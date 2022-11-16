package com.cabbook.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cabbook.controller.*;
import com.cabbook.model.Login.Login;
import com.cabbook.model.User.User;
import com.cabbook.model.ride.Ride;
import com.cabbook.service.User.login.UserLoginService;
import com.cabbook.service.User.reg.UserRegService;
import com.cabbook.service.bookride.BookRideService;

@Controller
public class CabUserController {

	@Autowired
	private UserRegService userRegService;

	@Autowired
	private UserLoginService userLoginService;

	@Autowired
	private BookRideService bookRideService;

	@GetMapping(value = "/")
	public ModelAndView loadRegister() {
		return new ModelAndView("Login/SignIn", "login", new Login());
	}

	// UserPanel>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	@GetMapping(value = "loadRegisterUser")
	public ModelAndView loadRegisterUser() {
		return new ModelAndView("User/SignUpUser", "user", new User());
	}

	@PostMapping(value = "registerUser")
	public ModelAndView registerUser(@ModelAttribute User user) {
		Login login = user.getLogin();
		this.userLoginService.loginUser(login);
		this.userRegService.saveUser(user);
		return new ModelAndView("redirect:/loadLogin", "login", new Login());
	}

	@GetMapping(value = "dashboardUser")
	public ModelAndView dashboardUser(@ModelAttribute User user, HttpSession session) {
		User userData = (User) session.getAttribute("userData");
		return new ModelAndView("User/dashboard", "userData", userData);
	}

	@GetMapping(value = "loadLogin")
	public ModelAndView loadLogin(@ModelAttribute User user) {
		return new ModelAndView("Login/SignIn", "login", new Login());
	}

	@GetMapping(value = "loadBookRide")
	public ModelAndView loadBookRide(Ride ride, HttpSession session, @ModelAttribute User user,
			@ModelAttribute Login login) {
		Long bookLoginId = (Long) session.getAttribute("bookLoginId");
		System.out.println("bookLoginId>>>>>>" + bookLoginId);
		login.setLoginId(bookLoginId);
		User userData = this.userRegService.getUserData(login);
		System.out.println(">>>>>>>>>> book ride userdata");
		System.out.println(userData);
		ModelAndView model = new ModelAndView("User/BookRide", "ride", new Ride());
		model.addObject("userData", userData);
		return model;
	}

	@PostMapping(value = "userBookRide")
	public ModelAndView userBookRide(@ModelAttribute Ride ride, HttpSession session, @ModelAttribute User user,
			@ModelAttribute Login login) {
		Long bookLoginId = (Long) session.getAttribute("bookLoginId");
		login.setLoginId(bookLoginId);
		User userData = this.userRegService.getUserData(login);
		System.out.println(">>>>>>>>>> book ride userdata");
		System.out.println(userData);
		ModelAndView model = new ModelAndView("User/dashboard", "userData", userData);
		model.addObject("userData", userData);
		this.bookRideService.saveRide(ride);
		return model;
	}

	@GetMapping(value = "userAllBookingRides")
	public ModelAndView userAllBookingRides(HttpSession session, @ModelAttribute Login login,
			@ModelAttribute Ride ride) {
		Long viewBookLoginId = (Long) session.getAttribute("bookLoginId");
		login.setLoginId(viewBookLoginId);
		User userData = this.userRegService.getUserData(login);
		List<Ride> bookingData = this.bookRideService.getBookingData(login);
		System.out.println(">>>>>>>>>>>>>bookingData");
		System.out.println(bookingData);
		ModelAndView model = new ModelAndView("User/AllBookingRides", "bookingData", bookingData);
		model.addObject("userData", userData);
		return model;
	}

	@GetMapping(value = "cancelBooking")
	public ModelAndView cancelBooking(@RequestParam("bookId") Long bookId, @ModelAttribute Ride ride) {
		ride.setRideId(bookId);
		this.bookRideService.cancelRide(ride);
		return new ModelAndView("redirect:/userAllBookingRides");
	}

	@GetMapping(value = "logout")
	public ModelAndView logout() {
		return new ModelAndView("redirect:loadLogin", "login", new Login());
	}

}
