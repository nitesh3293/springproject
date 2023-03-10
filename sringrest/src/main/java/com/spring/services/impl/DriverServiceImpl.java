package com.spring.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.entities.Location;
import com.spring.entities.SearchRequestCab;
import com.spring.entities.Driver;
import com.spring.repo.DriverRepo;
import com.spring.services.DriverService;
import com.spring.services.driverservice;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
	

	@Autowired
	private DriverRepo driverRepo;

	private static Integer MAX_DISTANCE = 5;
	@Override
	public List<Driver> getDrivers() {
		return ;
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
	public Driver updateDriver(long id, Driver driver) {
		return null;
	}

	@Override
	public void deleteDriver(long id) {

	}


}
