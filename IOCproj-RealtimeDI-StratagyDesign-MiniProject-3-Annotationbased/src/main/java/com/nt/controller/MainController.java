package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;
import com.nt.vo.CustomerVo;

@Repository("controller")
public final class MainController {
	
	@Autowired
	@Qualifier("custservice")
	private CustomerMgmtService service;
	
	// for construction injection 
	
	public MainController(CustomerMgmtService service) {
		this.service = service;
	}
	
	public String processCustomer(CustomerVo vo)throws Exception{
		CustomerDTO dto=null;
		String result=null;
		
		// convert vo class object to DTO class Object
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getpAmt()) );
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		// use service 
		result=service.calculateIntrestAmount(dto);
		return result;
		
	}
	

}
