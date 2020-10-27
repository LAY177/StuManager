
/*
 * 学生成绩修改成功
 */

 package scoreaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

 import ActionForm.ScoreActionForm;
 import scoremanager.ScoreManager;

 public class StudentUpdateGradeFinshAction extends Action {
     
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)throws Exception {
	    
		 ScoreActionForm saf=(ScoreActionForm)form;
		 int id =Integer.parseInt(request.getParameter("id"));
		 String grade=saf.getGrade();
			
		 ScoreManager scoreMassage=ScoreManager.getInstance();
		 scoreMassage.updateGrade(id,grade);
		 
	    return mapping.findForward("success");
	 }
 }
