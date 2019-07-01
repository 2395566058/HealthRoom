package swim.gdkm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/*
 * 登录拦截器
 * 
 * */

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		if (url.equals("/HealthRoom/tologin")||url.equals("/HealthRoom/login.html")) {
			// 访问主页，直接进入
			return true;
		}else if(!url.equals("/HealthRoom/error")) {
			String userid=(String) request.getSession().getAttribute("USER");
			if(userid==null||userid.equals("null")) {
				request.setAttribute("msg", "必须先登录！");
				request.getRequestDispatcher("/login.html").forward(request, response);
				return false;
			}else {
				return true;
			}
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}
}
