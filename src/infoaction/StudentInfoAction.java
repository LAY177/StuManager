
/*
 * 显示学生信息
 */

 package infoaction;

 import java.util.List;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

 import ActionForm.InfoActionForm;
 import infomanager.UserManager;

 public class StudentInfoAction extends Action {
   
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
       
		    InfoActionForm iaf=(InfoActionForm )form; 
		    String username =iaf.getUsername();
			UserManager userManager=UserManager.getInstance();
			List list =userManager.findAllUse(username);
			request.setAttribute("user", list);
		 
	       return mapping.findForward("success");
	 }
 }
