package com.neu.cobs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myneu.contacts.model.Message;
import com.neu.cobs.HomeController;
import com.neu.cobs.model.User;
import com.neu.cobs.dao.UserDao;
import com.neu.cobs.model.*;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*
	 * Specify this useValidate will be injected
	 */
	@Autowired
	@Qualifier("userValidator")
	private Validator validator;
	
	@Autowired
	private UserDao userDao;
	
	/*
	 * This is to initialize webDataBinder,set its
	 * validator as we specify.
	 */
	@InitBinder
	private void initBinder (WebDataBinder binder){
		binder.setValidator(validator);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "home";
	}
	
	@RequestMapping(value="/" ,method=RequestMethod.POST)
	public String submitForm(Model model, @Validated User user, BindingResult result, HttpServletRequest request){
		String returnVal = "userHomePage";
		String returnValAdvertiser = "advertiserHomePage";
		String returnValPublisher = "publisherHomePage";
		if (result.hasErrors()){
			return "home";
		}else{
			try {
				User u = userDao.queryUserByNameAndPassword(user.getUserName(), user.getPassword());
				if (u != null){
					HttpSession session = request.getSession();
				    session.setAttribute("user", u);
				//	model.addAttribute("user", u);
				    if (u.getType().equalsIgnoreCase("admin")){
					return returnVal;	
				    }else if(u.getType().equalsIgnoreCase("advertiser")){
				    return returnValAdvertiser;
				    }else if(u.getType().equalsIgnoreCase("publisher")){
					    return returnValPublisher;
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		    	//	return "loginError";
			}
		//	return "home";
			return "loginError";
		}
		
		
					
	}
	
	
	
	@RequestMapping(value = "registraterUser", method = RequestMethod.POST)
	public String addUser(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User u = (User)session.getAttribute("user");
		Message newMessage = new Message();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String date = sdf.format(new Date()); 
		String message = request.getParameter("messageText");
		String fromUser = u.getUserName();
		String toUser = request.getParameter("toUser");
		
		System.out.println("message is "+request.getParameter("messageText"));
	    
	    try {
	    userDao.registerUser(message, fromUser, toUser, date);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
		
		return "registeredSucces";
	}
	
	
	
	
}
