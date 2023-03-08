package com.spring.services;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.stereotype.Service;

import com.spring.entities.Drivers;

@Service
public class driverserviceimpl implements driverservice {
	
	List<Drivers> list;

	@Override
	public List<Drivers> getDrivers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drivers getDrivers(long id) {
		// TODO Auto-generated method stub
		Drivers u = null;
		
		for(Drivers driver : list)
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
		list.add(driver);
		return driver;
	}

	@Override
	public void updateDriver(Drivers driver, long id) {
		// TODO Auto-generated method stub
		list = list.stream().map(u ->{
			if(u.getId() == id)
			{
				u.setAge(driver.getAge());
				u.setGender(driver.getGender());
				u.setName(driver.getName());
			}
			return u;
		}).collect(Collectors.toList());
	}

	

}
