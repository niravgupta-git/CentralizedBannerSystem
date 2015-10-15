package com.neu.cobs.dao;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.neu.cobs.model.User;

public class UserDao extends DAO{
	
	/*
	    * Since its a query, it is not necessary to wrap code
	    * inside the begin transaction and commit part, unlike
	    * update, create, and delete. Since there is no object
	    * in the session yet, nothing will be committed.  After
	    * Adding these, "transaction is not successfully started'
	    * Exception will be thrown.
	    */
		public User queryUserByNameAndPassword(String name, String password)
	            throws Exception {
			try {
				//      begin();
	            Query q = getSession().createQuery("from User where userName = :username and password = :password");
	            q.setString("username", name);
	            q.setString("password", password);
	            User user = (User) q.uniqueResult();
	            //       commit();
	            close();
	            return user;
			} catch (HibernateException e) {
				//       rollback();
	            throw new Exception("Could not get user " + name, e);
			}
	    }
		
		public User registerUser(String name, String password, String address, String email,String type, String registrationStatus, String usertype, String userName)
	            throws Exception {
			try {
				//      begin();
	            Query q = getSession().createQuery("from User where userName = :username and password = :password");
	            q.setString("username", name);
	            q.setString("password", password);
	            User user = (User) q.uniqueResult();
	            //       commit();
	            close();
	            return user;
			} catch (HibernateException e) {
				//       rollback();
	            throw new Exception("Could not get user " + name, e);
			}
		
		}

}
