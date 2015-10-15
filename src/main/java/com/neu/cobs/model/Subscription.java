package com.neu.cobs.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subscription {
	@Id
	@GeneratedValue
	private String userId;
	private boolean IsSubscriptionStatus;
	private Date susbcriptionFrom;
	private Date subscriptionTill;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public boolean isIsSubscriptionStatus() {
		return IsSubscriptionStatus;
	}
	public void setIsSubscriptionStatus(boolean isSubscriptionStatus) {
		IsSubscriptionStatus = isSubscriptionStatus;
	}
	public Date getSusbcriptionFrom() {
		return susbcriptionFrom;
	}
	public void setSusbcriptionFrom(Date susbcriptionFrom) {
		this.susbcriptionFrom = susbcriptionFrom;
	}
	public Date getSubscriptionTill() {
		return subscriptionTill;
	}
	public void setSubscriptionTill(Date subscriptionTill) {
		this.subscriptionTill = subscriptionTill;
	}	
	
}
