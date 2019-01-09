package com.mindtree.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.hotel.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
