package com.spring.entities;

public class Bookings {

	private int bookingId;	
	private int userId; 	   
	private Drivers driver;
	private String fromLocation;	   
	private String toLocation;
	
	
	
	public Bookings(int bookingId, int userId, Drivers driver, String fromLocation, String toLocation) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.driver = driver;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}
	
	
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Drivers getDriver() {
		return driver;
	}
	public void setDriver(Drivers driver) {
		this.driver = driver;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	
	
	
	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", userId=" + userId + ", driver=" + driver + ", fromLocation="
				+ fromLocation + ", toLocation=" + toLocation + "]";
	}
}

