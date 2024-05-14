package com.rays.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryExample {

	@Autowired
	private BeanFactory beanFactory;

	public void doSomething() {
		MyComponent myComponent = beanFactory.getBean(MyComponent.class);
		myComponent.doSomething();

		Role anotherComponent = beanFactory.getBean(Role.class);
		anotherComponent.doSomethingElse();
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.rays.test");

		context.register(AppConfig.class);

		// context.refresh();

		BeanFactoryExample example = context.getBean(BeanFactoryExample.class);

		example.doSomething();

		context.close();
	}
}
