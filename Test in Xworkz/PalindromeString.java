class PalindromeString{
	public static void main(String[] args){
		String input = "godog";
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--){
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
		String output = (input.equals(reverse))? "Plindrome" : "Not Palindome";
		System.out.println("The given Sting is "+output);
	}
}