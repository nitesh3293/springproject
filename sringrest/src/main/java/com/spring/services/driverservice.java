package com.spring.services;

import java.util.List;

import com.spring.entities.Drivers;

public interface driverservice {

	public List<Drivers> getDrivers();
	
	public Drivers getDrivers(long id);
	
	public Drivers addDriver(Drivers driver);
	
	public void updateDriver(Drivers driver, long id);

	
}
