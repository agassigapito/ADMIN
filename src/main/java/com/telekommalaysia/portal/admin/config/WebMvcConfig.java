package com.telekommalaysia.portal.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.telekommalaysia.portal.admin.handler.SessionHandler;

@EnableWebMvc
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/mock/", "classpath:/templates/" };

	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
		// .setCachePeriod(3600)
		// .resourceChain(true)
		// .addResolver(new GzipResourceResolver())
		// .addResolver(new PathResourceResolver());

		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor()).excludePathPatterns("/portallogin");
	}

	@Bean
	public SessionHandler myInterceptor() {
		return new SessionHandler();
	}
	//
}