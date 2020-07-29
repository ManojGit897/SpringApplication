package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PlayerBO;

public class PlayerDAOImpl implements PlayerDAO {
	
	//create table ipl_registration(sno number,pname varchar2(20),page varchar2(20),
	//t20btavg float,odibtavg float,testbtavg float,t20blwavg float,odiblwavg float,testblwavg float);


	public static final String PLAYER_INSERT_QUARY="INSERT INTO IPL_REGISTRATION VALUES(IPL_S1.NEXTVAL,?,?,?,?,?,?,?,?)" ;
	
	
    private DataSource ds;
  
	public PlayerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	public int insert(PlayerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		// get pooled connection 
		con=ds.getConnection();
		ps=con.prepareStatement(PLAYER_INSERT_QUARY);
		
		// set values to query params
		
		
		
		        ps.setString(1,bo.getPname());
				ps.setInt(2,bo.getPage());
				ps.setFloat(3,bo.getT20btavg());
				ps.setFloat(4,bo.getOdibtavg());
				ps.setFloat(5,bo.getTestbtavg());
				ps.setFloat(6,bo.getT20blwavg());
				ps.setFloat(7,bo.getOdiblwavg());
				ps.setFloat(8,bo.getTestblwage());
		
		
		
		// execute the query
		count=ps.executeUpdate();
		//close the jdbc objects
		
		con.close();
		ps.close();
	
		return count;
		
	}

	

	

}
