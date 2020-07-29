package com.nt.dto;

import java.io.Serializable;

public class PlayerDTO implements Serializable {
	
	
	private int sno;
	private String pname;
	private int page;
	private float t20btavg;
	private float odibtavg;
	private float testbtavg;
	private float t20blwavg;
	private float odiblwavg;
	private float testblwage;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public float getT20btavg() {
		return t20btavg;
	}
	public void setT20btavg(float t20btavg) {
		this.t20btavg = t20btavg;
	}
	public float getOdibtavg() {
		return odibtavg;
	}
	public void setOdibtavg(float odibtavg) {
		this.odibtavg = odibtavg;
	}
	public float getTestbtavg() {
		return testbtavg;
	}
	public void setTestbtavg(float testbtavg) {
		this.testbtavg = testbtavg;
	}
	public float getT20blwavg() {
		return t20blwavg;
	}
	public void setT20blwavg(float t20blwavg) {
		this.t20blwavg = t20blwavg;
	}
	public float getOdiblwavg() {
		return odiblwavg;
	}
	public void setOdiblwavg(float odiblwavg) {
		this.odiblwavg = odiblwavg;
	}
	public float getTestblwage() {
		return testblwage;
	}
	public void setTestblwage(float testblwage) {
		this.testblwage = testblwage;
	}
	
	
	
	
	
	

}
