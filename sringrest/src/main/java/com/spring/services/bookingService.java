package com.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.entities.Bookings;
import com.spring.entities.Users;
import com.spring.entities.Drivers;

public class bookingService {

	List<Bookings> list;
	public List<Bookings> getBookings()
	{
		list = new ArrayList<>();
		return list;
	}
	
	/*public Bookings addbooking(Bookings booking)
	{
		if(booking.get)
	}
*/
	public void deleteBooking(long bookingId) {
		// TODO Auto-generated method stub
		list = list.stream().filter(x -> x.getBookingId() != bookingId).collect(Collectors.toList());
	}
	
}
