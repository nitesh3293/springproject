package com.spring.services;

import java.util.List;

import com.spring.entities.BookingDetails;
import com.spring.entities.Driver;
import com.spring.entities.SearchRequestCab;
import com.spring.entities.User;

public interface BookingService {

	public  List<SearchRequestCab> getBookings();

	public BookingDetails addBooking(Driver driver, User user, long id);

	public void deleteBooking(long id);

	public List<Driver> findDriverForBooking(SearchRequestCab searchRequestCab);


}
