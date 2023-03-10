package com.spring.services.impl;

import java.util.List;

import com.spring.entities.Driver;
import com.spring.repo.DriverRepo;
import com.spring.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepo driverRepo;

	private static Integer MAX_DISTANCE = 5;

	//Show all Drivers
	@Override
	public List<Driver> getDrivers() {
		return driverRepo.getDrivers();
	}


	//Show a specific Driver
	@Override
	public Driver getDrivers(long id) {
		return  driverRepo.getDriver(id);
	}


	//Add a driver
	@Override
	public Driver addDriver(Driver driver) {
		return  driverRepo.addDriver(driver);
	}


	//Update a Driver
	@Override
	public void updateDriver(long id, Driver driver) {

	}

	//Delete a driver
	@Override
	public void deleteDriver(long id) {
	}


}
