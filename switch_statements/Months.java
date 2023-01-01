package com.descion_making.switch_statements;

public class Months {

	public static void main(String[] args) {

		String month = "nov";
		
		switch(month) {
		case "jan" : System.out.println("January Month");
			break;
		case "feb" : System.out.println("Febraury Month");
			break;
		case "mar" : System.out.println("March Month");
			break;
		case "apr" : System.out.println("April Month");
			break;
		case "may" : System.out.println("May Month");
			break;
		case "jun" : System.out.println("June Month");
			break;
		case "jul" : System.out.println("July Month");
			break;
		case "aug" : System.out.println("August Month");
			break;
		case "sep" : System.out.println("September Month");
			break;
		case "oct" : System.out.println("October Month");
			break;
		case "nov" : System.out.println("November Month");
			break;
		case "dec" : System.out.println("December Month");
		
		default : System.out.println("Enter valid name of month");
		}

	}

}
