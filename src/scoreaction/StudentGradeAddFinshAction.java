
 /*
  * 完成学生成绩插入请求控制
  */

 package scoreaction;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

import ActionForm.ScoreActionForm;
import forms.GradeFrom;
import scoremanager.ScoreManager;

 public class StudentGradeAddFinshAction extends Action {

	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response)throws Exception {
		 
		    ScoreActionForm saf=(ScoreActionForm)form;
		    int studentId = Integer.parseInt(saf.getStudentId());
			int classId=Integer.parseInt(saf.getClassId());
			String grade=saf.getGrade();
			
			GradeFrom gradeFrom=new GradeFrom();
			gradeFrom.setClassId(classId);
			gradeFrom.setStudentId(studentId);
			gradeFrom.setGrade(grade);
			
			ScoreManager scoreMassage=ScoreManager.getInstance();
			scoreMassage.addGrade(gradeFrom);
		    return mapping.findForward("success");
	 }
	 
 }
