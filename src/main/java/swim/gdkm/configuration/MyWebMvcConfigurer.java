package swim.gdkm.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import swim.gdkm.interceptor.LoginInterceptor;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
	String[] exclude = { "/css/*", "/img/*", "/js/*", "/images/*","/interaction-js/*"};

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List<String> testList = Arrays.asList(exclude);
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns(testList);
		WebMvcConfigurer.super.addInterceptors(registry);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//registry.addResourceHandler("/images/**").addResourceLocations("file:/HealthRoomData/images/");
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
		registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
		registry.addResourceHandler("/interaction-js/**").addResourceLocations("classpath:/static/interaction-js/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
}
