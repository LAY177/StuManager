
/*
 * 学生成绩删除
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

 public class StudentGradeDelAction extends Action {
    
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)throws Exception {
		 
//		    ScoreActionForm saf=(ScoreActionForm)form;
//		    System.out.println(saf.getId());
		 //get提交无法使用表单收集
		    int id=Integer.parseInt(request.getParameter("Id"));
		    ScoreManager scoreMassage=ScoreManager.getInstance();
		    scoreMassage.StudentGradeDel(id);
		 
		 return mapping.findForward("success");
	 }
	 
 }
