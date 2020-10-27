
 /*
  * 学生成绩管理表单
  */

 package ActionForm;

 import org.apache.struts.action.ActionForm; 

 public class ScoreActionForm extends ActionForm {
    
	 private String username;
	 
	 private String studentId;
	 
	 private String classId;
	 
	 private String grade;
	 

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	 
 }
