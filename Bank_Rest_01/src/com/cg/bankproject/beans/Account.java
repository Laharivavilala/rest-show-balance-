package com.cg.bankproject.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	private int accountId;
	private double balance;
	private double initialDeposit;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	private String emailId;

	public Account() {
		super();
	}
	
	public Account(int accountId, double balance, double initialDeposit,
			String firstName, String lastName, String phoneNum, String address,
			String emailId) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.initialDeposit = initialDeposit;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
		this.emailId = emailId;
	}

	

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", balance=" + balance
				+ ", initialDeposit=" + initialDeposit + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNum="
				+ phoneNum + ", address=" + address + ", emailId=" + emailId
				+ "]";
	}
	

}
