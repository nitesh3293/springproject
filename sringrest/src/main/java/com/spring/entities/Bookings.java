package com.spring.entities;

public class Bookings {

	private long id;	
	private long userId; 	   
	private String fromLocation;	   
	private String toLocation;
	public Bookings(long id, long userId, String fromLocation, String toLocation) {
		super();
		this.id = id;
		this.userId = userId;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
	}
	
	
	public Bookings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
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
		return "Bookings [id=" + id + ", userId=" + userId + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + "]";
	}
}

