class Number{
	public static void main(String[] args){
		int n=78945498, reverse=0;
		int number = n;
		while(n!=0){
			int remainder=n%10;
			reverse=(reverse*10)+remainder;
			n/=10;
		}
		String outCome = (number == reverse)? "It is palindrome":"It is not Palindrome";
		System.out.println(number+" "+outCome);
	}
}