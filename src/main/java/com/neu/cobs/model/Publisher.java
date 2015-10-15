package com.neu.cobs.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Publisher")  
@PrimaryKeyJoinColumn(name="ID") 
public class Publisher extends User{
	
	@Column(name = "TotalAdPosted")
	private int totalAdPosted;
	
	@Column(name = "TotalAdBooked")
	private int totalAdBooked;
	
	@OneToOne
	private Subscription subscription;
	
	@OneToMany
	private List<Advertisements> adInventory;
		
	public Subscription getSubscription() {
		return subscription;
	}
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public List<Advertisements> getAdInventory() {
		return adInventory;
	}
	public void setAdInventory(List<Advertisements> adInventory) {
		this.adInventory = adInventory;
	}
	public int getTotalAdPosted() {
		return totalAdPosted;
	}
	public void setTotalAdPosted(int totalAdPosted) {
		this.totalAdPosted = totalAdPosted;
	}
	public int getTotalAdBooked() {
		return totalAdBooked;
	}
	public void setTotalAdBooked(int totalAdBooked) {
		this.totalAdBooked = totalAdBooked;
	}	
	
}
