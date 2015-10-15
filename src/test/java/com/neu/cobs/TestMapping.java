package com.neu.cobs;

import org.hibernate.Session;

import com.neu.cobs.dao.HibernateUtil;
import com.neu.cobs.model.Advertiser;
import com.neu.cobs.model.User;

public class TestMapping {
	public static void main(String args[]){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		User user = new User();
		user.setName("Prateek");
		user.setEmail("hi@123");
		
		Advertiser advertiser = new Advertiser();
		advertiser.setAddress("ABC");
		advertiser.setCompanyName("Test");
		advertiser.setContactNumber("6173730292");
		advertiser.setEmail("paikray.p@husky.neu.edu");
		advertiser.setUserName("admin");
		advertiser.setPassword("password");
		
		
		
		session.save(user);
		session.save(advertiser);
		session.getTransaction().commit();
		session.close();
		System.out.println("success");
		
	}
}
