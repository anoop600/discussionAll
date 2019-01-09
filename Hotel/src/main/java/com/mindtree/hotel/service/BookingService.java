package com.mindtree.hotel.service;

import java.util.List;
import java.util.Optional;

import com.mindtree.hotel.entity.Booking;

public interface BookingService {

	public Booking addBooking(Booking booking);


	public List<Booking> getAllBooking();

	public Optional<Booking> getBooking(int id);

	public List<Booking> getAllLuxuryBooking();

	public List<Booking> getAllSemiLuxuryBooking();

	public List<Booking> getAllBudgetBooking();

}