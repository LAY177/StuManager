
/*
 * 修改学生成绩
 */

 package scoreaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

import mode.GradeBean;
import scoremanager.ScoreManager;

 public class StudentUpdataGradeAction extends Action {
    
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)throws Exception {
		    int id=0;
			id=Integer.parseInt(request.getParameter("id"));
			ScoreManager scoreMassage=ScoreManager.getInstance();
			GradeBean grade=scoreMassage.findGradeById(id);
			request.setAttribute("grade",grade);
		 
		 return mapping.findForward("success");
	 }
	 
 }
