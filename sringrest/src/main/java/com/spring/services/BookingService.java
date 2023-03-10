package com.spring.services;

import java.util.List;

import com.spring.entities.Driver;
import com.spring.entities.SearchRequestCab;

public interface BookingService {

	public  List<SearchRequestCab> getBookings();

	public SearchRequestCab addbooking(Driver driver);

	public void deleteBooking(long id);

	public List<Driver> findDriverForBooking(SearchRequestCab searchRequestCab);

}
