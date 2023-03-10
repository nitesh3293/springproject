package com.spring.repo;

import com.spring.entities.Driver;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DriverRepo {
    List<Driver> driverList;

    public DriverRepo() {
        driverList = new ArrayList<>();
    }

    //Add a driver
    public Driver addDriver(Driver driver) {
        // TODO Auto-generated method stub
        driverList.add(driver);
        return driver;
    }

    //Show all drivers
    public List<Driver> getDrivers() {
        // TODO Auto-generated method stub
        return driverList;
    }

    //Show Specific Driver
    public Driver getDriver(long id) {
        // TODO Auto-generated method stub
        Driver u = null;

        for(Driver driver : driverList)
        {
            if(driver.getId() == id)
            {
                u = driver;
                break;
            }
        }
        return u;
    }

    //Update Driver
    public void updateDriver(Driver driver, long id) {
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

    //Delete Driver
    public void deleteDriver(long id) {
        // TODO Auto-generated method stub
        driverList = driverList.stream().filter(x -> x.getId() != id).collect(Collectors.toList());
    }

}
