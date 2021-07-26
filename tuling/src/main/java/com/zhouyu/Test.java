package com.zhouyu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


	public static void main(String[] args) throws InterruptedException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		UserService userService = context.getBean("userService", UserService.class);
		userService.test();


	}
}
