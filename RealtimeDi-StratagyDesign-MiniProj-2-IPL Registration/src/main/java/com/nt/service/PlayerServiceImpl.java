package com.nt.service;

import com.nt.bo.PlayerBO;
import com.nt.dao.PlayerDAO;
import com.nt.dto.PlayerDTO;

public class PlayerServiceImpl implements PlayerService {
	
	private PlayerDAO dao;

	public PlayerServiceImpl(PlayerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String battingAndBowlingAvg(PlayerDTO dto) throws Exception {
		
		PlayerBO bo;
		
		  float btavg=0.0f;
		  float blwavg=0.0f;
		  int count =0;
		  
		  btavg=((dto.getT20btavg()+dto.getOdibtavg()+dto.getTestbtavg())/3);
		  blwavg=((dto.getT20blwavg()+dto.getOdiblwavg()+dto.getTestblwage())/3);
		  bo=new PlayerBO();
		  
		  bo.setPname(dto.getPname());
		  bo.setPage(dto.getPage());
		  bo.setT20btavg(dto.getT20btavg());
		  bo.setOdibtavg(dto.getOdibtavg());
		  bo.setTestbtavg(dto.getTestbtavg());
		  bo.setT20blwavg(dto.getT20blwavg());
		  bo.setOdiblwavg(dto.getOdiblwavg());
		  bo.setTestblwage(dto.getTestblwage());
		  
		  count=dao.insert(bo);
		  
		  // process the result 
		  
		  if(count==0)
				return " Player Registration Failed \n Name ::"+dto.getPname()+"  Age ::"+dto.getPage()+"Batting avg :"+btavg;
			else
				return " \n Mr Dear Player  your Registration Succeded \n  Name ::"+dto.getPname()+" \n Age ::"+dto.getPage()+"   \n  Batting avg"+btavg+" \n  Bowling avg :"+blwavg;
			
			
		  
		
	}
}
	