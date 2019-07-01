package swim.gdkm.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String addRegister(HttpServletRequest request) {
		Map<String, Object> newmap=new HashMap<String, Object>();
		Map<String, String[]> map = request.getParameterMap();
		Set<Entry<String, String[]>> set = map.entrySet();
		Iterator<Entry<String, String[]>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, String[]> entry = it.next();
			newmap.put(entry.getKey(), JtoString(entry.getValue()));
		}
		String reg_no=String.valueOf(GeneratID.getGeneratID());
		newmap.put("reg_no", reg_no);
		boolean result=registerService.addRegisterByMap(newmap);
		if(result==true) {
			String type=(String) newmap.get("type");
			return type+"挂号信息添加成功！";
		}
		return "挂号信息添加失败！";
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
}
