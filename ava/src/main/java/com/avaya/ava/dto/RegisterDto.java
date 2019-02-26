package com.avaya.ava.dto;

public class RegisterDto {
	
	String alaisUserName;
	String phoneUserName;
	String phoneExtensionNumber;
	String phoneExtensionPwd;

	public String getAlaisUserName() {
		return alaisUserName;
	}
	public void setAlaisUserName(String alaisUserName) {
		this.alaisUserName = alaisUserName;
	}
	public String getPhoneUserName() {
		return phoneUserName;
	}
	public void setPhoneUserName(String phoneUserName) {
		this.phoneUserName = phoneUserName;
	}
	public String getPhoneExtensionNumber() {
		return phoneExtensionNumber;
	}
	public void setPhoneExtensionNumber(String phoneExtensionNumber) {
		this.phoneExtensionNumber = phoneExtensionNumber;
	}
	public String getPhoneExtensionPwd() {
		return phoneExtensionPwd;
	}
	public void setPhoneExtensionPwd(String phoneExtensionPwd) {
		this.phoneExtensionPwd = phoneExtensionPwd;
	}
}
