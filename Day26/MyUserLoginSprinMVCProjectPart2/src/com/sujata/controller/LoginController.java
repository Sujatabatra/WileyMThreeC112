package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView getLoginPage() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("command", new User());
		mv.setViewName("loginPage.jsp");
		return mv;
		
	}

	@RequestMapping("/loginCheck")
	public ModelAndView checkLoginController(@ModelAttribute User  user) {
		ModelAndView mv=new ModelAndView();

		String message=null;
		if(userService.loginCheck(user))
			message="Login Succesful !";
		else
			message="Login Failed !";
		
		mv.addObject("msg", message);
		mv.setViewName("output.jsp");
		
		return mv;
	}

	
//	@RequestMapping("/loginCheck")
//	public ModelAndView checkLoginController(HttpServletRequest request) {
//		ModelAndView mv=new ModelAndView();
//		String username=request.getParameter("uname");
//		String pwd=request.getParameter("pwd");
//		User user=new User(username, pwd);
//		String message=null;
//		if(userService.loginCheck(user))
//			message="Login Succesful !";
//		else
//			message="Login Failed !";
//		
//		mv.addObject("msg", message);
//		mv.setViewName("output.jsp");
//		
//		return mv;
//	}

}
