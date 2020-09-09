package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	
 private String cname;
 private String cadd;
 private float Pamt;
 private float rate;
 private float time;
 
 // gettrs and setters
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCadd() {
	return cadd;
}
public void setCadd(String cadd) {
	this.cadd = cadd;
}
public float getPamt() {
	return Pamt;
}
public void setPamt(float pamt) {
	Pamt = pamt;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
public float getTime() {
	return time;
}
public void setTime(float time) {
	this.time = time;
}
 
 
}
