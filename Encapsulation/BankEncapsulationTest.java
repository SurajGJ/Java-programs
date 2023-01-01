package com.Encapsulation;

public class BankEncapsulationTest {

	public static void main(String[] args) {
		BankAccoutEncapsulated bank = new BankAccoutEncapsulated();
		bank.setAccNo(423005750l);
		bank.setName("Suraj");
		bank.setMobileNo(7259303408l);
		bank.setAmount(35000.00);
		System.out.println("Account Number : "+bank.getAccNo());
		System.out.println("Name : "+bank.getName());
		System.out.println("Mobile Number : "+bank.getMobileNo());
		System.out.println("Amout : "+bank.getAmount());
		
	}
}
