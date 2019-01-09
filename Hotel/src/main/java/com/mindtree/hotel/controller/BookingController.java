package com.mindtree.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.hotel.entity.Booking;
import com.mindtree.hotel.service.BookingService;

@RestController
@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public Booking index(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addHotel")
	public ModelAndView addHotel(@RequestBody Booking booking) {
		System.out.println("hihihihih");
		bookingService.addBooking(booking);
		return new ModelAndView("AddBooking", "message", "Added");

	}

	@RequestMapping(method = RequestMethod.GET, value = "/getBooking/{id}")
	public ModelAndView getBooking(@RequestBody int id) {
		System.out.println("hihihihih");
		if (bookingService.getBooking(id) != null) {
			return new ModelAndView("GetById", "message", "");
		} else
			return new ModelAndView("GetById", "message", "No Booking on the Id " + id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getAllBooking")
	public List<Booking> getAllBooking() {
		System.out.println("hihihihih");
		return bookingService.getAllBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/luxury")
	public List<Booking> getAllLuxuryBooking() {
		return bookingService.getAllLuxuryBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/semi")
	public List<Booking> getAllSemiLuxuryBooking() {
		return bookingService.getAllSemiLuxuryBooking();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/budget")
	public List<Booking> getAllBudgetBooking() {
		return bookingService.getAllBudgetBooking();
	}

}
