import java.util.Scanner;  
public class CheckPerfectSquareExample2  {
	static boolean checkPerfectSquare(int number)   {   
		for (int i=1; i*i<=number; i++)   {     
			if((number%i==0) && (number/i==i))   {       
				return true;   
			}   
		}   
		return false;   
	} 
	
	public static void main(String[] args)   {    
		Scanner scr = new Scanner(System.in);  
		System.out.println("Enter a number: ");     
		int number = scr.nextInt();   
		if (checkPerfectSquare(number))   
			System.out.println("Yes, the given number is perfect square.");  
		else  
			System.out.print("No, the given number is not perfect square.");   
	}       
} 