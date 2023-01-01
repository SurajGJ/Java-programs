class PrimeJava{
	static int number=57;
	static boolean call(){
		if (number <= 1) return false;
		for( int i = 2; i<= number/2; i++){
			if(number % i == 0)
			return false;
		}
		return true;
	}
	public static void main(String[] args){
		String outCome = call()? "Prime Number" : "Not Prime Number";
		System.out.println(number+" "+outCome);
	}
}