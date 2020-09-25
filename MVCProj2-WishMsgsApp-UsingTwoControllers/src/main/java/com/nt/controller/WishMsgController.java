package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMsgServiceImpl;

public class WishMsgController extends AbstractController {
	
	WishMsgServiceImpl service;
	
	public WishMsgController(WishMsgServiceImpl service) {
	
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		String msg=service.GenarateWishMsg();
		// TODO Auto-generated method stub
		return  new ModelAndView("result","wmsg",msg);
	}
	
	

}
