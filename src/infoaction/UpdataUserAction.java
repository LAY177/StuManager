
/*
 * 修改学生信息
 */

 package infoaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

import infomanager.UserManager;
import mode.StudentBean;

 public class UpdataUserAction extends Action {
  
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
          
		    String id=request.getParameter("id");
			UserManager userMassage=UserManager.getInstance();
			StudentBean bean=userMassage.findUserById(id);
			request.setAttribute("user",bean);
		    return mapping.findForward("success");
	 }
 }
