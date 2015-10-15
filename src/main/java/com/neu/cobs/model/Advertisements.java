package com.neu.cobs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertisements {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int advertisementId;
	
	@Column(name = "Length")
	private int length;
	
	@Column(name = "Width")
	private int width;
	
	@Column(name = "Type")
	private String type;
	
	@Column(name = "AvailableFrom")
	private Date availableFrom;
	
	@Column(name = "AvailableTill")
	private Date availableTill;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "Price")
	private float price;
	
	@Column(name = "Owner")
	private String owner;
	
	@Column(name = "BookedBy")
	private String bookedBy;
	
	@Column(name = "Status")
	private boolean status;
	

	public int getAdvertisementId() {
		return advertisementId;
	}
	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getAvailableFrom() {
		return availableFrom;
	}
	public void setAvailableFrom(Date availableFrom) {
		this.availableFrom = availableFrom;
	}
	public Date getAvailableTill() {
		return availableTill;
	}
	public void setAvailableTill(Date availableTill) {
		this.availableTill = availableTill;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
