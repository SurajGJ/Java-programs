class VowelsInString{
	
	static String str1 = "Don Bangega Jhon, Jhon Banega Don";
	str = str1.toLowerCase();
	static int count = 0;
	static void vowels(){
		for(int i=0; i<str.length(); i++){
			if(str.charAt[i] == 'a'|| str.charAt[i] == 'e'|| str.charAt[i] == 'i'|| 
			str.charAt[i] == 'o'|| str.charAt[i] == 'u' ){	
			count++;
		}
		System.out.println(count);
		//return count;
	}
	public static void main(String[] args){
		//String str = 'Don Bangega Jhon|| Jhon Banega Don';
		System.out.println(vowels());
	}
}