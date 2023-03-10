package com.spring.services.impl;

import java.util.List;

import com.spring.entities.Driver;
import com.spring.repo.DriverRepo;
import com.spring.services.DriverService;
import com.spring.services.driverservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
	

	@Autowired
	private DriverRepo driverRepo;

	private static Integer MAX_DISTANCE = 5;
	@Override
	public List<Driver> getDrivers() {
		return driverRepo.getDrivers();
	}

	@Override
	public Driver getDrivers(long id) {
		return  driverRepo.getDriver(id);
	}

	@Override
	public Driver addDriver(Driver driver) {
		return  driverRepo.addDriver(driver);
	}

	@Override
	public void updateDriver(long id, Driver driver) {

	}

	@Override
	public void deleteDriver(long id) {
	}


}
