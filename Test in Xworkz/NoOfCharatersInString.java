class NoOfCharatersInString{
	public static void main(String[] args){
		String input = "qwertyuiopasdfghjklzxcvbnm";
		int count =0;
		for(int i= 0; i< input.length(); i++){
			count++;
		}
		System.out.println("Total number of Characteer in given String : "+count);
	}
}