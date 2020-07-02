package com.nt.beans;

import java.util.Date;


public class WishMessageGenarator {
	
	
	 private Date date;
	public void setDate(Date date) {
		this.date = date;   //spring bean property
		
	}
	   
	
	// B.method using the injected Date class object  to  b.logic 
	
	public String generateWishMessage(String user) {
		 
		int hour=0;
		// get current hour the day
		
		hour=date.getHours();
		
		if(hour<12)
			return "good morning ::"+user;
		else if(hour<16)
			return "Good Afternoon::"+user;
		else if(hour<20)
			return " Good evening ::"+user;
		else
			return " Good night ::"+user;
	}



	}

