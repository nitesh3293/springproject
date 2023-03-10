package com.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.entities.Bookings;
import com.spring.entities.Drivers;
import com.spring.entities.Users;

public class bookingServiceimpl implements bookingService {

	List<Bookings> bookingList;
	
	public bookingServiceimpl() {
		bookingList = new ArrayList<>();
	}
	
	@Override
	public List<Bookings> getBookings(){
		// TODO Auto-generated method stub
		return bookingList;
	}

	@Override
	public Bookings addbooking(Bookings booking){
		// TODO Auto-generated method stub
		
		List<Drivers> availableDrivers = new ArrayList<>();
		for(Drivers d : driverList)
		{
			if(d.status() && ) 
			{
				availableDrivers.add(d);
			}
		}
		return booking;
	}

	@Override
	public void deleteBooking(long id){
		// TODO Auto-generated method stub
		bookingList = bookingList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
	}

}
