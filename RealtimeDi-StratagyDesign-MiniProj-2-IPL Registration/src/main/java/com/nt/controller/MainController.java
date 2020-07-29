package com.nt.controller;

import com.nt.dto.PlayerDTO;
import com.nt.service.PlayerService;
import com.nt.vo.PlayerVo;

public final class MainController {
	
	PlayerService service;
    // for constraction injection
	public MainController(PlayerService service) {
		this.service = service;
	}
	
	public String processPlayer(PlayerVo vo)throws Exception{
		PlayerDTO dto =new PlayerDTO();
		String result=null;
		
		// convrts vo class objects to Dto class objects
		
		dto.setPname(vo.getPname());
		dto.setPage(Integer.parseInt(vo.getPage()));
		dto.setT20btavg(Float.parseFloat(vo.getT20btavg()));
		dto.setT20blwavg(Float.parseFloat(vo.getT20blwavg()));
		dto.setOdibtavg(Float.parseFloat(vo.getOdibtavg()));
		dto.setOdiblwavg(Float.parseFloat(vo.getOdiblwavg()));
		dto.setTestbtavg(Float.parseFloat(vo.getTestbtavg()));
		dto.setTestblwage(Float.parseFloat(vo.getTestblwage()));
		
		// use Service method 
		
		result=service.battingAndBowlingAvg(dto);
				
		return result;
		
	}

}
