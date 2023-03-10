package com.spring.controller;

import java.util.List;

import com.spring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Driver;


@RestController
public class DriverController {
	
	@Autowired
	private DriverService driverServe;
	
	//get Driver Information
	@GetMapping("/drivers")
	public List<Driver> getDrivers()
	{
		return this.driverServe.getDrivers();
	}
		
				
	//get Specific Driver Information
	@GetMapping("/drivers/{id}")
	public Driver getDrivers(@PathVariable long id)
	{
		return this.driverServe.getDrivers(id);
	}
		
	//post Drivers Information
	@PostMapping("/drivers")
	public Driver addDriver(@RequestBody Driver driver)
	{
		return this.driverServe.addDriver(driver);
	}
		
		
	//Update DriverInformation
	@PutMapping("/drivers/{id}")
	public Driver updateDriver(@RequestBody Driver driver, @PathVariable long id)
	{
		 this.driverServe.updateDriver(id, driver);
		 return driver;
	}
	
	//Delete driver Information
	@DeleteMapping("/drivers/{id}")
	public void deleteDriver(@PathVariable long id)
	{
		this.driverServe.deleteDriver(id);
	}
}
