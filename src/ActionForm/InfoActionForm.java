
/*
 * 学生信息管理表单
 */

 package ActionForm;

 import org.apache.struts.action.ActionForm;

 public class InfoActionForm extends ActionForm {
   
	 private String username;
	 
	 private String name; //修改的学生信息
	 
	 private String password;
	 
	 private String sex;
	 
	 private String email;
	 
	 private String id;
	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	 
 }
