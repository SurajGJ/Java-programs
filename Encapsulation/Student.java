package com.Encapsulation;

public class Student {

	private String name;
	private int rollNo;
	private String school;
	private double percentage;
	private char result ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char isResult() {
		return result;
	}
	public void setResult(char result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Name : " + name + ", RollNo : " + rollNo + ", School : " + school + ", Percentage : " + percentage
				+ " % ,  Result : " + result ;
	}
	
	
}
