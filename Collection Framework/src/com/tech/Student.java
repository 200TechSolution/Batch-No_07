package com.tech;



public class Student {
	
	int sid;
	String sname;
	String mono;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMono() {
		return mono;
	}
	public void setMono(String mono) {
		this.mono = mono;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", mono=" + mono;
	}
	
	
	

}
