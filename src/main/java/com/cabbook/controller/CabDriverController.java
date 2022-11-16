package com.cabbook.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cabbook.model.Driver.Driver;
import com.cabbook.model.Login.Login;
import com.cabbook.model.ride.Ride;
import com.cabbook.service.Driver.login.DriverLoginService;
import com.cabbook.service.Driver.reg.DriverRegService;
import com.cabbook.service.bookride.BookRideService;

@Controller
public class CabDriverController {

	@Autowired
	DriverRegService driverRegService;

	@Autowired
	DriverLoginService driverLoginService;

	@Autowired
	BookRideService bookRideService;

	@GetMapping(value = "signUpOptions")
	public ModelAndView signUpOptions() {
		return new ModelAndView("SignUpOptions");
	}

	@GetMapping(value = "loadRegisterDriver")
	public ModelAndView loadRegisterDriver() {
		return new ModelAndView("Driver/SignUpDriver", "driver", new Driver());
	}

	@PostMapping(value = "registerDriver")
	public ModelAndView registerDriver(@ModelAttribute Driver driver) {
		Login driverLogin = driver.getLogin();
		this.driverLoginService.loginDriver(driverLogin);
		this.driverRegService.saveDriver(driver);
		return new ModelAndView("redirect:/", "login", new Login());
	}

	@GetMapping(value = "dashboardDriver")
	public ModelAndView dashboardDriver(@ModelAttribute Driver driver, HttpSession session) {
		Driver driverData = (Driver) session.getAttribute("driverData");
		ModelAndView model = new ModelAndView("Driver/dashboard");
		model.addObject("driverData", driverData);
		return model;
	}

	@GetMapping(value = "notifications")
	public ModelAndView notifications(@ModelAttribute Ride ride, @ModelAttribute Driver driver, HttpSession session) {
		ride.setStatus("pending");
		ArrayList<Ride> driverDataWithStatus = this.bookRideService.getBookingWithStatus(ride);
		ModelAndView model = new ModelAndView("Driver/notifications", "bookingData", driverDataWithStatus);
		model.addObject("driverData", driverDataWithStatus);
		return model;
	}

	@GetMapping(value = "acceptRide")
	public ModelAndView acceptRide(@RequestParam("bookId") Long bookId, @ModelAttribute Ride ride) {
		ride.setRideId(bookId);
		this.bookRideService.acceptRide(ride);
		return new ModelAndView("redirect:/notifications");
	}

	@GetMapping(value = "rejectRide")
	public ModelAndView rejectRide(@RequestParam("bookId") Long bookId, @ModelAttribute Ride ride) {
		ride.setRideId(bookId);
		this.bookRideService.rejectRide(ride);
		return new ModelAndView("redirect:/notifications");
	}

	@GetMapping(value = "previousBookings")
	public ModelAndView previousBookings(@ModelAttribute Ride ride, @ModelAttribute Driver driver,
			HttpSession session) {
		List<Ride> bookingData = this.bookRideService.getDriverBookingData();
		Driver driverData = (Driver) session.getAttribute("driverData");
		ModelAndView model = new ModelAndView("Driver/previousBooking", "bookingData", bookingData);
		model.addObject("driverData", driverData);
		return model;
	}

}
