package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Drivers;
import com.spring.services.driverservice;


@RestController
public class DriverController {
	
	@Autowired
	private driverservice driverServe;
	
	//get Driver Information
	@GetMapping("/drivers")
	public List<Drivers> getDrivers()
		{
			return this.driverServe.getDrivers();
		}
		
				
		//get Specific Driver Information
		@GetMapping("/drivers/{id}")
		public Drivers getDrivers(@PathVariable long id)
		{
			return this.driverServe.getDrivers(id);
		}
		
		//postUsersInformation
		@PostMapping("/drivers")
		public Drivers addDriver(@RequestBody Drivers driver) 
		{
			return this.driverServe.addDriver(driver);
		}
		
		
		//UpdateUserInformation
		@PutMapping("/drivers/{id}")
		public Drivers updateDriver(@RequestBody Drivers driver, @PathVariable long id)
		{
			 this.driverServe.updateDriver(driver,id);
			 return driver; 
		}
}