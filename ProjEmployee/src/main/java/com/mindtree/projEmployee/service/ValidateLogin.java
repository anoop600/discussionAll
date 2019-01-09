package com.mindtree.projEmployee.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.projEmployee.configuration.FactoryMethod;
import com.mindtree.projEmployee.entity.Login;
import com.mindtree.projEmployee.util.LoginService;

public class ValidateLogin {
	public boolean validate(Login login) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);

		LoginService ls = context.getBean(LoginService.class);
		Login user = ls.read(login.getUserName());
		if (user != null) {
			return true;
		} else {
			return false;
		}
	}
}
