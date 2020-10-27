
/*
 * 修改学生信息操作
 */

 package infoaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

import ActionForm.InfoActionForm;
import infomanager.UserManager;
import mode.StudentBean;

 public class modifyUserAction extends Action {
 
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		 
		 InfoActionForm iaf=(InfoActionForm)form;
		 StudentBean rgf =new StudentBean();
		   rgf.setName(iaf.getName());
		   rgf.setPassword(iaf.getPassword());
		   rgf.setSex(iaf.getSex());
		   rgf.setEmail(iaf.getEmail());
		   String id = iaf.getId();
		       
		   UserManager userMassage=UserManager.getInstance();
		   boolean flag=userMassage.modifyUser(rgf,id);
		 
		if(flag){
		  
			return mapping.findForward("success"); 

		}else {
			return null;
		}
		 
	 }
 }
