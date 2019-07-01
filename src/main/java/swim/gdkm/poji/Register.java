package swim.gdkm.poji;

import java.math.BigDecimal;
import java.util.Date;

public class Register {
	private String reg_no;// 门诊号
	private Date disease_time;// 发病时间
	private String symptom;// 症状
	private Date see_date;// 就诊日期
	private String type;// 类型
	private String name;// 姓名
	private String id_no;// 身份证号
	private String job;// 职业
	private String reg_work;// 工作单位
	private Date birth;// 出生日期
	private String mobile;// 联系手机
	private String cornet;// 手机短号
	private String email;// 电子邮箱
	private String qq;// QQ号码
	private String patient_no;// 学号/工号
	private String dept;// 系别
	private String grade;// 年级
	private String major;// 专业
	private String glass;// 班级
	private String dorm;// 宿舍
	private String first_further;// 初诊/复诊
	private byte charge_reg;// 是否收取挂号费
	private BigDecimal register_fee;// 挂号费
	private String sex;// 性别

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public Date getDisease_time() {
		return disease_time;
	}

	public void setDisease_time(Date disease_time) {
		this.disease_time = disease_time;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public Date getSee_date() {
		return see_date;
	}

	public void setSee_date(Date see_date) {
		this.see_date = see_date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getReg_work() {
		return reg_work;
	}

	public void setReg_work(String reg_work) {
		this.reg_work = reg_work;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCornet() {
		return cornet;
	}

	public void setCornet(String cornet) {
		this.cornet = cornet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPatient_no() {
		return patient_no;
	}

	public void setPatient_no(String patient_no) {
		this.patient_no = patient_no;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getGlass() {
		return glass;
	}

	public void setGlass(String glass) {
		this.glass = glass;
	}

	public String getDorm() {
		return dorm;
	}

	public void setDorm(String dorm) {
		this.dorm = dorm;
	}

	public String getFirst_further() {
		return first_further;
	}

	public void setFirst_further(String first_further) {
		this.first_further = first_further;
	}

	public byte getCharge_reg() {
		return charge_reg;
	}

	public void setCharge_reg(byte charge_reg) {
		this.charge_reg = charge_reg;
	}

	public BigDecimal getRegister_fee() {
		return register_fee;
	}

	public void setRegister_fee(BigDecimal register_fee) {
		this.register_fee = register_fee;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
