package com.ganesh.account;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bank {
	private String bankName;
	private int pinCode;
	private String location;

	public Bank() {
		System.out.println("Bank Object Created.");
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", pinCode=" + pinCode + ", location=" + location + "]";
	}

}
