package com.Encapsulation;

public class BankAccoutEncapsulated {

	private String name;
	private long accNo;
	private long mobileNo;
	private double amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankAccoutEncapsulated [name=" + name + ", accNo=" + accNo + ", mobileNo=" + mobileNo + ", amount="
				+ amount + "]";
	}
	
}
