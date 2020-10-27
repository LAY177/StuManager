

 /*
  * 删除学生信息
  */

 package infoaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

 import infomanager.UserManager;

 public class UserDelAction extends Action {
  
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
 
		 String id = request.getParameter("userId");
		 
			UserManager userMassage=UserManager.getInstance();
			int rs = userMassage.delUserById(id);
			if(rs != 0){
				return mapping.findForward("success");
			}else {
				return null;
			}
	 }
 }
