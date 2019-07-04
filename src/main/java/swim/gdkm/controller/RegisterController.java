package swim.gdkm.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import swim.gdkm.poji.Register;
import swim.gdkm.service.RegisterService;
import swim.gdkm.utils.GeneratID;

/*
 * 预约挂号模块
 */
@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	/*
	 * 添加挂号表信息
	 */
	@RequestMapping("/addRegister")
	@ResponseBody
	public String addRegister(HttpServletRequest request) {
		Map<String, Object> newmap = new HashMap<String, Object>();
		Map<String, String[]> map = request.getParameterMap();
		Set<Entry<String, String[]>> set = map.entrySet();
		Iterator<Entry<String, String[]>> it = set.iterator();
		System.out.println("监听到请求数据:");
		while (it.hasNext()) {
			Entry<String, String[]> entry = it.next();
			newmap.put(entry.getKey(), JtoString(entry.getValue()));
			System.out.println(entry.getKey() + "  :   " + JtoString(entry.getValue()));
		}
		String reg_no = String.valueOf(GeneratID.getGeneratID());
		newmap.put("reg_no", reg_no);
		boolean result = registerService.addRegisterByMap(newmap);
		if (result == true) {
			String type = (String) newmap.get("type");
			return type + "挂号信息添加成功！";
		}
		return "挂号信息添加失败！";
	}

	/*
	 * 获取挂号表信息
	 */
	@RequestMapping("/getRegister")
	@ResponseBody
	public String getRegister() {
		List<Register> list = registerService.getRegister();
		StringBuffer sb=getJson(list);
		return sb.toString();
	}

	/*
	 * 把String数组转为String
	 */
	public String JtoString(String[] data) {
		if (data.length == 0 || data == null) {
			return null;
		}
		String newdata = "";
		for (int i = 0; i < data.length; i++) {
			newdata = newdata + data[i];
		}
		return newdata.toString();
	}

	public StringBuffer getJson(List<Register> list) {
		StringBuffer sb = new StringBuffer("[");
		if (list.size() == 0) {
			return new StringBuffer("null");
		}
		for (int i = 0; i < list.size(); i++) {
			Register obj = list.get(i);
			String reg_no = obj.getReg_no();
			String type = obj.getType();
			String name = obj.getName();
			String birth = String.valueOf(obj.getBirth());
			String sex = obj.getSex();
			String mobile = obj.getMobile();
			String disease_time = String.valueOf(obj.getDisease_time());
			String first_further = obj.getFirst_further();
			String symptom = obj.getSymptom();
			sb.append("{");
			if (reg_no != null && reg_no != "") {
				sb.append("\"门诊号\":\"" + reg_no + "\",");
			}
			if (name != null && name != "") {
				sb.append("\"姓名\":\"" + name + "\",");
			}
			if (type != null && type != "") {
				sb.append("\"类型\":\"" + type + "\",");
			}
			if (birth != null && birth != "") {
				sb.append("\"出生日期\":\"" + birth + "\",");
			}
			if (sex != null && sex != "") {
				sb.append("\"性别\":\"" + sex + "\",");
			}
			if (mobile != null && mobile != "") {
				sb.append("\"手机号\":\"" + mobile + "\",");
			}
			if (disease_time != null && disease_time != "") {
				sb.append("\"发病时间\":\"" + disease_time + "\",");
			}
			if (first_further != null && first_further != "") {
				sb.append("\"出诊或复诊\":\"" + first_further + "\",");
			}
			if (symptom != null && symptom != "") {
				sb.append("\"症状\":\"" + symptom + "\",");
			}
			
			if(type.equals("学生")) {

				String patient_no = obj.getPatient_no();
				String grade = obj.getGrade();
				String dept = obj.getDept();
				String major = obj.getMajor();
				String glass = obj.getGlass();
				String dorm = obj.getDorm();
				if (patient_no != null && patient_no != "") {
					sb.append("\"学号\":\"" + patient_no + "\",");
				}
				if (grade != null && grade != "") {
					sb.append("\"年级\":\"" + grade + "\",");
				}
				if (dept != null && dept != "") {
					sb.append("\"系别\":\"" + dept + "\",");
				}
				if (major != null && major != "") {
					sb.append("\"专业\":\"" + major + "\",");
				}
				if (glass != null && glass != "") {
					sb.append("\"班级\":\"" + glass + "\",");
				}
				if (dorm != null && dorm != "") {
					sb.append("\"宿舍\":\"" + dorm + "\"");
				}
			}else if(type.equals("教工")){
				String patient_no = obj.getPatient_no();
				if (patient_no != null && patient_no != "") {
					sb.append("\"工号\":\"" + patient_no + "\"");
				}
			}else if(type.equals("其他人员")) {
				String id_no=obj.getId_no();
				String job=obj.getJob();
				if (id_no != null && id_no != "") {
					sb.append("\"身份证号\":\"" + id_no + "\",");
				}
				if (job != null && job != "") {
					sb.append("\"职业\":\"" + job + "\"");
				}
			}
			if(sb.substring(sb.length()).equals(",")){
				sb.deleteCharAt(sb.length() - 1);
			}
			sb.append("},");
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("]");
		return sb;
	}
}
