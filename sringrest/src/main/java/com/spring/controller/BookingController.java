
package com.spring.controller;

import java.util.List;

import com.spring.dto.BookingRequestDTO;
import com.spring.entities.BookingDetails;
import com.spring.dto.SearchCabRequestDTO;
import com.spring.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.services.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingServe;
	
	//get Driver Information
	@GetMapping("/bookings")
	public List<SearchRequestCab> getBookings()
	{
		return this.bookingServe.getBookings();
	}
	
	/*@PostMapping("/bookings")
	public SearchRequestCab addbooking(@RequestBody SearchRequestCab searchRequestCab)
	{
		SearchRequestCab searchCabRequest = new SearchRequestCab(101, searchCabRequestCab.getUser(),
				searchCabRequestDTO.getStart(), searchCabRequestDTO.getEnd());
		return this.bookingServe.addbooking(searchRequestCab);
	}*/
	
	@DeleteMapping("/bookings/{id}")
	public void deleteBooking(@PathVariable("id") long id)
	{
		this.bookingServe.deleteBooking(id);
	}

	@GetMapping("/searchCab")
	public List<Driver> search(@RequestBody SearchCabRequestDTO searchCabRequestDTO)
	{
		SearchRequestCab searchCabRequest = new SearchRequestCab(101, searchCabRequestDTO.getUser(),
				searchCabRequestDTO.getStart(), searchCabRequestDTO.getEnd());
		return this.bookingServe.findDriverForBooking(searchCabRequest);
	}

	@PostMapping("/trip")
	public BookingDetails addBooking(@RequestBody BookingRequestDTO bookingRequestDTO)
	{
		return bookingServe.addBooking(bookingRequestDTO.getDriver(),bookingRequestDTO.getUser());

	}
}
