class LeapYear{
	
	public static void main(String[] suraj){
		
		int year = 2024;
		
		//String output = ( year % 4 == 0)? "Leap Year" : "Not a Leap Year";
		
		if(year % 4 == 0)
			System.out.println(year+" is Leap Year");
		else	
			System.out.println(year+" is Not Leap Year");
	}
}