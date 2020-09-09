package com.nt.vo;

import lombok.Getter;

import lombok.Setter;

@Setter
@Getter

public class CustomerVo {
	private String cname;
	private String cadd;
	private String pAmt;
	private String time;
	private String rate;
	
	//getters and getters
	
	
	  public String getCname() { return cname; }
	  
	  public void setCname(String cname) { this.cname = cname; } public String
	  getCadd() { return cadd; } public void setCadd(String cadd) { this.cadd =
	  cadd; } public String getpAmt() { return pAmt; } public void setpAmt(String
	  pAmt) { this.pAmt = pAmt; } public String getTime() { return time; } public
	  void setTime(String time) { this.time = time; } public String getRate() {
	  return rate; } public void setRate(String rate) { this.rate = rate; }
	 
	 
}
