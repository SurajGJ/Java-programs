class PowerOfNumber{
	public static void main(String[] args){
		int power=1;
		int exponent=5;
		int base=5;
		for (int i=1; i<=exponent; i++) {
			power=power*base;
			System.out.println(power);
		}
	}
}