package swim.gdkm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import swim.gdkm.service.UsersService;

/*
 * 用户登录退出模块
 */
@Controller
public class LoginController {
	@Autowired
	private UsersService usersService;

	/*
	 * 登录验证
	 */
	@RequestMapping("/tologin")
	@ResponseBody
	public String tologin(String username, String password, HttpServletRequest request) {
		boolean result = usersService.existUser(username, password);
		if (result != true) {
			return "账号或密码错误!";
		}
		int userid = usersService.getUseridByUsernameAndPassword(username, password);
		request.getSession().setAttribute("USER", userid);
		return "true";
	}
	
	/*
	 * 退出登录
	 */
	@RequestMapping("/tologout")
	@ResponseBody
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		request.setAttribute("msg", "已登出！");
		return "login.html";
	}

}
