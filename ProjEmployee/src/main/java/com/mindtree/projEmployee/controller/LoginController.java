package com.mindtree.projEmployee.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.projEmployee.configuration.FactoryMethod;
import com.mindtree.projEmployee.entity.Login;
import com.mindtree.projEmployee.service.ValidateLogin;
import com.mindtree.projEmployee.util.InsertData;

@Controller
public class LoginController {

	// Signup Page
	@RequestMapping("/signup")
	public ModelAndView redirectToSignUp(HttpServletRequest request, HttpServletResponse response) {
		// PropertyConfigurator.configure("log4j.properties");
		ModelAndView mv = new ModelAndView();
		// System.out.println("hi");
		mv.setViewName("AddNewUser");
		return mv;

	}

	// Load Index page
	@RequestMapping("/")
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	// When Login details are filled in the webpage
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		// PropertyConfigurator.configure("log4j.properties");
		ApplicationContext context = new AnnotationConfigApplicationContext(FactoryMethod.class);
		Login login = context.getBean(Login.class);
		login.setUserName(request.getParameter("userName"));
		login.setUserPassword(request.getParameter("userPassword"));
		ModelAndView mv = new ModelAndView();
		ValidateLogin vl = new ValidateLogin();
		if (vl.validate(login)) {
			mv.setViewName("Success");
		} else {
			mv.setViewName("LoginFail");
		}
		return mv;
	}

	// When new user is added in the webpage
	@RequestMapping("/addUser")
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response) {
		// PropertyConfigurator.configure("log4j.properties");
		ModelAndView mv = new ModelAndView();
		Login login = new Login();
		login.setUserName(request.getParameter("userName"));
		login.setUserPassword(request.getParameter("userPassword"));
		// System.out.println(login);
		InsertData id = new InsertData();
		if (id.addData(login)) {
			mv.setViewName("Success");
		} else {
			mv.setViewName("LoginFail");
		}
		return mv;
	}

}
