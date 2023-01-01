import java.util.Scanner;
class PerfectSquareRoot {
	static boolean verify(int number){
		for (int i=1; i*i<=number; i++){
			if((number%i==0) && (number/i==i)){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		while(true){
		System.out.println("Enter the Number");
		int number = scr.nextInt();
		if( verify(number) )
			System.out.println("Perfect Square Number");
		else 
			System.out.println("Not Perfect Square Number");
		}		
	}
}