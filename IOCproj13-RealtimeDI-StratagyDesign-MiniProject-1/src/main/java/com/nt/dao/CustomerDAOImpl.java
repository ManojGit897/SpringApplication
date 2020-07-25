package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBo;

public final class CustomerDAOImpl implements CustomerDAO {
	 private static final String
	  CUSTOMER_INSERT_QUERY="INSERT INTO SPRING_CUSTOMER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?)" ;
	  
	 
	  private DataSource ds;
	  
	  public CustomerDAOImpl(DataSource ds) {
	  
	  this.ds = ds;
	  }

	public int insert(CustomerBo bo) throws Exception {
		  
		  Connection con=null; PreparedStatement ps=null;
		  
		  int count =0;
		  
		  // get pooled jdbc connection
		  
		  con=ds.getConnection();
		  
		  // create prepared Statement Object
		  ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		  
		  //set values to query param
		  
		  ps.setString(1,bo.getCname()); 
		  ps.setString(2,bo.getCadd());
		  ps.setFloat(3,bo.getPamt());
		  ps.setFloat(4,bo.getIntramt());
		  //execute the
		   count=ps.executeUpdate(); //close the jdbc objects ps.close();
		  con.close();
		  
		  return count;
		// TODO Auto-generated method stub
		
	}

}
