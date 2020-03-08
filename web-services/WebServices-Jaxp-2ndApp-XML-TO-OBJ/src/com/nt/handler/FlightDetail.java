package com.nt.handler;

public class FlightDetail {
	private int fid;
	private String fSource;
	private String fDest;
	private float billAmt;
	
	public int getFid() {
		return fid;
	}
	
	public void setFid(int fid) {
		this.fid = fid;
	}
	
	public String getfSource() {
		return fSource;
	}

	public void setfSource(String fSource) {
		this.fSource = fSource;
	}

	public String getfDest() {
		return fDest;
	}

	public void setfDest(String fDest) {
		this.fDest = fDest;
	}

	public float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "FlightDetail [fid=" + fid + ", fSource=" + fSource + ", fDest=" + fDest + ", billAmt=" + billAmt + "]";
	}
	
}
