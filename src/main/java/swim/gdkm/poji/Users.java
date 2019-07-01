package swim.gdkm.poji;

public class Users {
	private int userid;// 用户编号
	private String username;// 登录名
	private String password;// 口令
	private String name;// 姓名
	private String userrole;// 用户角色
	private String email;// 电子邮箱
	private String telephone;// 联系电话
	private String mobile;// 手机
	private boolean is_workert;// 是否员工
	private String worker_no;// 工号
	private String us_status;// 用户状态
	private String remark;// 备注

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean isIs_workert() {
		return is_workert;
	}

	public void setIs_workert(boolean is_workert) {
		this.is_workert = is_workert;
	}

	public String getWorker_no() {
		return worker_no;
	}

	public void setWorker_no(String worker_no) {
		this.worker_no = worker_no;
	}

	public String getUs_status() {
		return us_status;
	}

	public void setUs_status(String us_status) {
		this.us_status = us_status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
