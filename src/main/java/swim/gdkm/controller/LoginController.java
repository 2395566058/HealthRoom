package swim.gdkm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String tologin(String username, String password, HttpServletRequest request) {
		boolean result = usersService.existUser(username, password);
		if (result != true) {
			request.setAttribute("msg", "账号或密码错误");
			return "login.html";
		}
		int userid = usersService.getUseridByUsernameAndPassword(username, password);
		request.getSession().setAttribute("USER", userid);
		return "xxx.html";
	}
	
	/*
	 * 退出登录
	 */
	@RequestMapping("/tologout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		request.setAttribute("msg", "已登出！");
		return "login.html";
	}

}
