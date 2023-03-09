package com.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.entities.Drivers;

@Service
public class driverserviceimpl implements driverservice {
	
	List<Drivers> driverList;
	
	public driverserviceimpl() {
		driverList = new ArrayList<>();
	}

	@Override
	public List<Drivers> getDrivers() {
		// TODO Auto-generated method stub
		return driverList;
	}

	@Override
	public Drivers getDrivers(long id) {
		// TODO Auto-generated method stub
		Drivers u = null;
		
		for(Drivers driver : driverList)
		{
			if(driver.getId() == id)
			{
				u = driver;
				break;
			}
		}
		return u;
	}

	@Override
	public Drivers addDriver(Drivers driver) {
		// TODO Auto-generated method stub
		driverList.add(driver);
		return driver;
	}

	@Override
	public void updateDriver(Drivers driver, long id) {
		// TODO Auto-generated method stub
		driverList = driverList.stream().map(d ->{
			if(d.getId() == id)
			{
				d.setAge(driver.getAge());
				d.setGender(driver.getGender());
				d.setName(driver.getName());
			}
			return d;
		}).collect(Collectors.toList());
	}

	@Override
	public void deleteDriver(long id) {
		// TODO Auto-generated method stub
		
		driverList = driverList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
	}

	

}
