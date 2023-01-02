class ReverseString{
	public static void main(String[] args){
		String input = "Xworkz";
		String reverse = "";
		for(int i=input.length()-1; i>=0; i--){
			reverse= reverse+input.charAt(i);
		}
		System.out.println("Reverse of given string is : "+reverse);
	}
}