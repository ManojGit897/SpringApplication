package com.nt.service;

import java.util.Calendar;

public class WishMsgServiceImpl implements WishMsgService {
	
	WishMsgService wmg;
	
	public WishMsgServiceImpl(WishMsgService wmg) {
	
		this.wmg = wmg;
	}

     public String GenarateWishMsg() {
    		// TODO Auto-generated method stub
 		int hour=0;
 		Calendar calender=null;
 		// get System date 
 		
 		calender=Calendar.getInstance();
 		hour=calender.get(Calendar.HOUR_OF_DAY);
 		
 		// genarete Wish msg
 		
 		if(hour<=12)
 		
 		return " Good Morning " ;
 		
 		else if(hour<=17)
 		
 			
 			return " Good Afternoon " ;
 		else if(hour<=20)
 			
 			return " Good Evening " ;
 		else 
 			
 			return " Good night " ;
		
 		
 		//return "Good night";
 		
 		
	}

}
