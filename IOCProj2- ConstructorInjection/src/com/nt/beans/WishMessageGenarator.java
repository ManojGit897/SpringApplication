package com.nt.beans;

import java.util.Date;


public class WishMessageGenarator {
	
	static {
		System.out.println("Static block ");
	}
	
	
	 private Date date;
	 
   // for constructor injection 
	
	  public WishMessageGenarator(Date date) {
	  System.out.println("Constructor param"); this.date = date;
	  
	  }
	 
  // setter injection
	public void setDate(Date date) {
		System.out.println("Settor injection ");
		this.date = date;   //spring bean property
		System.out.println(date);
		
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

