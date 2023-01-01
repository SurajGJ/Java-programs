import java.util.Scanner;

class ReverseInterger{
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		long number = scr.nextInt();
		long value = number;
		long reverse=0L;
		while( number != 0){
			long remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number= number / 10;
		}
		System.out.println("Given number : "+value);
		System.out.println("Reversed number : "+reverse);
	}
}