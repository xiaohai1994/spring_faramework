package com.zhouyu.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletAutoConfiguration {

	@Bean
	public DispatcherServlet dispatcherServlet(){
		return new DispatcherServlet();
	}
}
