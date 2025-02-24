package com.rays.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAppConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.rays.config");

		context.register(AppConfig.class);

		// context.refresh();

		UserService service = (UserService) context.getBean("userService");

		service.add();

		context.close();
	}
}
