
/*
 * 学生成绩管理
 */

 package scoreaction;

 import java.util.List;

 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import org.apache.struts.action.Action;
 import org.apache.struts.action.ActionForm;
 import org.apache.struts.action.ActionForward;
 import org.apache.struts.action.ActionMapping;

 import ActionForm.ScoreActionForm;
 import scoremanager.ScoreManager;

 public class StudentgradeInfoAction extends Action {
   
	 public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception{
		 
		  ScoreActionForm saf=(ScoreActionForm)form;
		  String username = saf.getUsername(); 
	      ScoreManager scoreMassage=ScoreManager.getInstance();
	      List list =scoreMassage.findAllScore(username);
	      request.setAttribute("scoreList",list);
	      return mapping.findForward("success");
	 }
	 
 }
