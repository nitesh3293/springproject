package com.spring.services;

import com.spring.entities.Driver;

import java.util.List;

public interface DriverService {
    public List<Driver> getDrivers();
    public Driver getDrivers(long id);

    public Driver addDriver(Driver driver);

    public Driver updateDriver(long id,Driver driver);

    public void deleteDriver(long id);
}
