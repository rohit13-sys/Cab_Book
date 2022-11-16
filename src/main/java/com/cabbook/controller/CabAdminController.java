package com.cabbook.controller;

import javax.servlet.http.HttpSession;

import org.apache.coyote.http11.Http11OutputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cabbook.controller.*;
import com.cabbook.model.Driver.Driver;
import com.cabbook.model.Login.Login;
import com.cabbook.model.User.User;
import com.cabbook.service.Driver.reg.DriverRegService;
import com.cabbook.service.Login.LoginService;
import com.cabbook.service.User.reg.UserRegService;

@Controller
public class CabAdminController {

	@Autowired
	LoginService loginService;

	@Autowired
	private UserRegService userRegService;

	@Autowired
	private DriverRegService driverRegService;

	@PostMapping(value = "dashboard")
	public ModelAndView dashboard(@ModelAttribute Login login, @ModelAttribute User user, HttpSession session) {
		String email = login.getEmail();
		String password = login.getPassword();
		Login loginList = this.loginService.loginCheck(email, password);
		String loginRole = loginList.getRole();
		Long loginId = loginList.getLoginId();
		session.setAttribute("bookLoginId", loginId);
		if (loginRole.equals("user")) {
			User userData = this.userRegService.getUserData(loginList);
			session.setAttribute("userData", userData);
			return new ModelAndView("User/dashboard", "userData", userData);
		}
		if (loginRole.equals("driver")) {
			login.setLoginId(loginId);
			Driver driverData = this.driverRegService.getDriverData(login);
			session.setAttribute("driverData", driverData);
			return new ModelAndView("Driver/dashboard", "driverData", driverData);
		} else {
			return new ModelAndView("redirect:/", "login", new Login());
		}
	}
}
