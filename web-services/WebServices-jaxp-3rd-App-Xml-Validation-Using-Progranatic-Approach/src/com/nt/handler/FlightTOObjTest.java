package com.nt.handler;

public class FlightTOObjTest {
	private int fid;
	private String fsrc;
	private String fdest;
	private String bill;

	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFsrc() {
		return fsrc;
	}
	public void setFsrc(String fsrc) {
		this.fsrc = fsrc;
	}
	public String getFdest() {
		return fdest;
	}
	public void setFdest(String fdest) {
		this.fdest = fdest;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "FlightTOObjTest [fid=" + fid + ", fsrc=" + fsrc + ", fdest=" + fdest + ", bill=" + bill + "]";
	}
	
	
}
