package com.rays.exclude;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAutowire {

	@Autowired
	private UserService userService;

	@Autowired
	private AnotherService anotherService;

	public void performOperations() {
		userService.greet(); // Should print "Hello, John Doe!"
		anotherService.doSomething(); // Should print "Doing something..."
	}

}
