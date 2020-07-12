package com.nt.components;

public class Student {
	
	private int sno;
	private String sname;
	private String saddrs;
	private float avg;
	
	
	
	// constractor injecton 
	public Student(int sno, String sname, String saddrs, float avg) {
		System.out.println("4-param constractor");
		this.sno = sno;
		this.sname = sname;
		this.saddrs = saddrs;
		this.avg = avg;
	}


	// setter injection 
	
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}


	public void setAvg(float avg) {
		this.avg = avg;
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", saddrs=" + saddrs + ", avg=" + avg + "]";
	}
	
	
	

}
