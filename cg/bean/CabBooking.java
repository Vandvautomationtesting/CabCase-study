package com.cg.bean;

import java.io.Serializable;


public class CabBooking implements Serializable{
	
	private int otp;
	private String pickUp;
	private  String drop;
	private String mobileNo;
	private  String cabType;

	public CabBooking() { }
	
	public CabBooking(int otp, String pickUp,String drop,String mobileNo,String cabType ) {
		this.otp = otp;
		this.pickUp = pickUp;
		this. drop =  drop;
		this.mobileNo=mobileNo;
		this.cabType=cabType;
	}
	
	
	
	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getPickUp() {
		return pickUp;
	}

	public void setPickUp(String pickUp) {
		this.pickUp = pickUp;
	}

	public String getDrop() {
		return drop;
	}

	public void setDrop(String drop) {
		this.drop = drop;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCabType() {
		return cabType;
	}

	public void setCabType(String cabType) {
		this.cabType = cabType;
	}

	@Override
	public String toString() {
		return "Cab [OTP=" + otp + ", PickUp ="
				+ pickUp + ", drop=" + drop + ",mobileNo=" +mobileNo+ ",cabType=" +cabType+"]";
	}

}
