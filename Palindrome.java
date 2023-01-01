class Palindrome{
	public static void main(String[] fghjk){
		String input="JhonTheDon";
		String reversedInput="";
		for(int i=input.length()-1; i>=0; i--){
			reversedInput += input.charAt(i);		
		}
		System.out.println(reversedInput);
		String result = (input == reversedInput)? "Palindrome": "Not Palindrome";
		System.out.println(result);	
	}
}