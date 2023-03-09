
package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Bookings;
import com.spring.services.bookingService;


@RestController
public class BookingController {
	
	@Autowired
	private bookingService bookingServe;
	
	//get Driver Information
	@GetMapping("/bookings")
	public List<Bookings> getBookings()
	{
		return this.bookingServe.getBookings();
	}
	
	@PostMapping("/bookings")
	public Bookings addbooking(@RequestBody Bookings booking) 
	{
		return this.bookingServe.addbooking(booking);
	}
	
	@DeleteMapping("/bookings/{bookingId}")
	public void deleteBooking(@PathVariable("bookingId") long bookingId)
	{
		this.bookingServe.deleteBooking(bookingId);
	}

}
