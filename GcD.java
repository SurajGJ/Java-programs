public class GCD {		
	public static void main(String[] fgdfghjh) {
		int number1 = 45;
		int number2 = 9856;
		int gcd = 1;
		for(int i = 1 ; i <= number1 && i <= number2; i++) {
			if( number1 % i == 0 && number2 % i == 0)
				gcd=i;
		}	
		System.out.println("greatest Common Divisior is : "+gcd);
	}
}
