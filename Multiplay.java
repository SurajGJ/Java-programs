public class Multiplay {
	int number=0;
	int multiply;
	int power=1;
	final int BASE=5;
	int cross(int exponent) {
		for (int i=1; i<=exponent; i++) {
			power=power*BASE;
		}
		multiply=number* power;
		System.out.println("multiply("+number+") == "+multiply);
		return multiply;
	}
	
	public static void main(String[] args) {
		Multiplay power = new Multiplay();
		if( power.number < 0 ) {
			if(power.number < 10) {
				power.cross(1);
			}
			else if(power.number >= 10 && power.number <= 50) {
				power.cross(2);
			}
			else{
				power.cross(3);
			}	
		}	
	}

}