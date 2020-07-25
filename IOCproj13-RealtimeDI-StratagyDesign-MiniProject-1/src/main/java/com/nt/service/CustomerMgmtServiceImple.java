package com.nt.service;

import com.nt.bo.CustomerBo;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;
import com.nt.test.RealtimeDITest;

public final class CustomerMgmtServiceImple  implements CustomerMgmtService {

	private CustomerDAO dao;
	
	 public CustomerMgmtServiceImple(CustomerDAO dao) {
		this.dao=dao;
		// TODO Auto-generated constructor stub
	}
	 
	
	@Override
	public String calculateIntrestAmount(CustomerDTO dto) throws Exception {
		
		float intrAmt=0.0f;
		CustomerBo bo;
		
		
		int count=0;
		
		intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		
		// prepareCustomerBO Object having persistable data
		
		bo=new CustomerBo();
		
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntramt(intrAmt);
		
		// use dao
		count=dao.insert(bo);
		// process the result
		
		if(count==0)
			return "Customer Registration Failed \n Principle amount ::"+dto.getPamt()+"  intrest ::"+intrAmt+" Total Amount"+(dto.getPamt()+intrAmt);
		else
			return "  Mr Dear Customer  your Registration Succeded \n  Principle amount :: "+dto.getPamt()+" \n intrest :: "+intrAmt+" \n Total Amount :: "+(dto.getPamt()+intrAmt);
		
		
	}

}
