package com.mindtree.projEmployee.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.projEmployee.configuration.FactoryMethod;
import com.mindtree.projEmployee.entity.Login;

public class InsertData {
	public boolean addData(Login login) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);
		LoginService ls = context.getBean(LoginService.class);
		ls.create(login);
		return true;
	}
}
