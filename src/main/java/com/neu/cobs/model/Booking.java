package com.neu.cobs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "Id")
	private int bookingId;
	
	@Column(name = "AdvertiserId")
	private int advertiserId;
	
	@Column(name = "PublisherId")
	private int publisherId;
	
	@Column(name = "FromBookedDate")
	private Date fromBookedDate;
	
	@Column(name = "TillBookedDate")
	private Date tillBookedDate;
	
	@ManyToOne
	private Advertisements advertisements;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getAdvertiserId() {
		return advertiserId;
	}
	public void setAdvertiserId(int advertiserId) {
		this.advertiserId = advertiserId;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public Date getFromBookedDate() {
		return fromBookedDate;
	}
	public void setFromBookedDate(Date fromBookedDate) {
		this.fromBookedDate = fromBookedDate;
	}
	
	public Date getTillBookedDate() {
		return tillBookedDate;
	}
	public void setTillBookedDate(Date tillBookedDate) {
		this.tillBookedDate = tillBookedDate;
	}
	public Advertisements getAdvertisements() {
		return advertisements;
	}
	public void setAdvertisements(Advertisements advertisements) {
		this.advertisements = advertisements;
	}
}
