package com.spring.services;

import java.util.List;

import com.spring.entities.Bookings;

public interface bookingService {

	public  List<Bookings> getBookings();

	public Bookings addbooking(Bookings booking);

	public void deleteBooking(long id);

}
