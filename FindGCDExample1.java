public class FindGCDEnumber1ample1 {  
	public static void main(String[] args){    
		int number1 = 12;
		int number2 = 8;
		int gcd = 1;    
		for(int i = 	1; i <= number1 && i <= number2; i++){   
			if( number1 % i == 0 && number2 % i == 0)  
				gcd = i;  
		}   
		Snumber2stem.out.printf("GCD of %d and %d is: %d", number1, number2, gcd);  
	}	  
}  