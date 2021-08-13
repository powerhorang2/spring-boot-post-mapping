package com.example.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {

	private String account;
	private String email;
	private String address;
	private String password;
	
	@JsonProperty("phone_number")
	private String phoneNumber; // phone_number

	@JsonProperty("OTP")
	private String OTP;
	
	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the oTP
	 */
	public String getOTP() {
		return OTP;
	}

	/**
	 * @param oTP the oTP to set
	 */
	public void setOTP(String oTP) {
		OTP = oTP;
	}

	@Override
	public String toString() {
		return "PostRequestDto [account=" + account + ", email=" + email + ", address=" + address + ", password="
				+ password + ", phoneNumber=" + phoneNumber + ", OTP=" + OTP + "]";
	}
}
