package com.tech.arralist;

public class Student {
	
	private int sid;
	
	private String sName;
	
	private String addrs;
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "sid=" + sid + ", sName=" + sName + ", addrs=" + addrs ;
	}
	
	

}
