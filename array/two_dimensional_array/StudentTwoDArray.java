package com.array.two_dimensional_array;

public class StudentTwoDArray {
	
	public static void main(String[] args0) {
		Students suraj = new Students("Suraj",045,"TCE","JNNCE");
		Students hitesh = new Students("Hitesh",014,"TCE","JNNCE");
		Students shamanth = new Students("Shamanth",037,"TCE","PesIT");
		Students rohan = new Students("Rohan",035,"TCE","PesIT");
		Students akshay = new Students("akshay",023,"EEE","SRNM");
		
	    Students []student = {suraj,hitesh,shamanth,rohan,akshay};
		
		for(int i=0; i<student.length; i++) {
			if(student[i].branch.equals("TCE"))
			System.out.println(student[i]);
		}
	}
}
