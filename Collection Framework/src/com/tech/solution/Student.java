package com.tech.solution;

public class Student {

	private int sid;
	private String sName;
	
	private String Email;
	
	
	public Address addrs;

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sName) {
		this.sName = sName;
	}

	public String getSname() {
		return sName;
	}

	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", Email=" + Email + ", addrs=" + addrs + "]";
	}

}
