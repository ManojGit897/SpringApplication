package com.nt.controller;
import java.util.Date;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController extends AbstractController{
    
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest req,
	 * HttpServletResponse res) throws Exception { // TODO Auto-generated method
	 * stub
	 * 
	 * return new ModelAndView("home");// lvn,modelattributename,model attribute
	 * value }
	 */
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("home");// lvn,modelattributename,model attribute value
	}

}

