class AddPlay{
	public static void main(String [] gopro){
		AddPlay data = new AddPlay();
		
		System.out.println(data.sum(2,2) );
	}
	int sum(int a, int b){
		int s=(a+b)*(a-b);
		return s;
	}
}