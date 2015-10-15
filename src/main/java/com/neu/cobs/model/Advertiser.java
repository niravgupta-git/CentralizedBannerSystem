package com.neu.cobs.model;

import java.util.List;

import javax.persistence.*; 


@Entity
@Table(name="Advertiser")  
@PrimaryKeyJoinColumn(name="ID") 
public class Advertiser extends User {
	
	@OneToMany
	public List<Booking> bookedAdInventory;
	
	@Column(name = "TotalAdBooked")
	private int totalAdBooked;
	
	@Column(name = "CompanyName")
	private String companyName;
	
	@OneToOne
	private Subscription subscription;
	
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	public int getTotalAdBooked() {
		return totalAdBooked;
	}
	public void setTotalAdBooked(int totalAdBooked) {
		this.totalAdBooked = totalAdBooked;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public List<Booking> getBookedAdInventory() {
	return bookedAdInventory;
	}
	
	public void setBookedAdInventory(List<Booking> bookedAdInventory) {
	this.bookedAdInventory = bookedAdInventory;
	}
}
