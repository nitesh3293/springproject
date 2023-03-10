package com.spring.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.entities.Location;
import com.spring.entities.SearchRequestCab;
import com.spring.entities.Driver;
import com.spring.repo.DriverRepo;
import com.spring.services.BookingService;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	DriverRepo driverRepo;

	List<SearchRequestCab> searchRequestCabList;
	
	public BookingServiceImpl() {
		searchRequestCabList = new ArrayList<>();
	}
	
	@Override
	public List<SearchRequestCab> getBookings(){
		// TODO Auto-generated method stub
		return searchRequestCabList;
	}

	@Override
	public void deleteBooking(long id){
		// TODO Auto-generated method stub
		searchRequestCabList = searchRequestCabList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
	}

	public List<Driver> findDriverForBooking(SearchRequestCab searchRequestCab)
	{
		List<Driver> availableDrivers = driverRepo.getDrivers().stream()
				.filter(driver -> driver.getStatus() == 1).collect(Collectors.toList());
		return getNearByDrivers(searchRequestCab, availableDrivers);
	}

	public List<Driver> getNearByDrivers(SearchRequestCab searchRequestCab, List<Driver> availableDrivers)
	{
		List<Driver> nearDrivers = new ArrayStack<>();
		for(Driver driver : availableDrivers){
			if(calculateDistance(driver.getCurrentLocation(), searchRequestCab.getSource()) <= 5)
			{
				nearDrivers.add(driver);
			}
		}
		return nearDrivers;
	}
	public Integer calculateDistance(Location driverLocation, Location userLocation)
	{
		Integer distance =5;
		return distance;
	}

}
