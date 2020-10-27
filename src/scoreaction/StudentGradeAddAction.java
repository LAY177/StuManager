
/*
 * 添加学生成绩
 */

 package scoreaction;

 import java.util.List;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

 import scoremanager.ScoreManager;

 public class StudentGradeAddAction extends Action {

	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception {
		 
		 ScoreManager scoreMassage=ScoreManager.getInstance();
		    List list1 =scoreMassage.findAllStudentId();
		    List list2 =scoreMassage.findAllClassId();
			request.setAttribute("studentAllId",list1);
			request.setAttribute("classAllId",list2);
		    return mapping.findForward("success");
	 }
	 
 }
