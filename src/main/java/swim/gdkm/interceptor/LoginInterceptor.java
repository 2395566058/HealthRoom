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
	//	System.out.print("拦截了路径："+url+"- -");
		return true;
		/*
		if (url.equals("/HealthRoom/tologin")||url.equals("/HealthRoom/Login.html")) {
			// 访问主页，直接进入
			System.out.println("通过");
			return true;
		}else if(!url.equals("/HealthRoom/error")) {
			String userid=(String) request.getSession().getAttribute("USER");
			if(userid==null||userid.equals("null")) {
				request.setAttribute("msg", "必须先登录！");
				System.out.println("不通过");
				request.getRequestDispatcher("/Login.html").forward(request, response);
				return false;
			}else {
				System.out.println("通过");
				return true;
			}
		}
		System.out.println("不通过");
		return false;
		*/
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
