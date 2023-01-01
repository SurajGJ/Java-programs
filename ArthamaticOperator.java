class ArthamaticOperator{
	public static void main(String Test[]){
		
		byte daysinaWeeek = 7;   //incompatible types -128 to 127
		short workerinCompany = 32767;  //incompatible types -32768 to 32767
		int populationinKarnataka = 2147483640; //integer number too large -2billion to 2 billion
		long populationinWorld = 9223372036854775807L; //integer number too large
		float  time = 19.22f; //Stores 6-7 decimal digit
		double valueofPai = 3.1415926535; //Stores 15 decimal digit
		char symbol = '$'; //Stores all character
		boolean oneSun=true; //Stores only 0/1
		
		int randomAddition = daysinaWeeek + populationinKarnataka;
		int randomSubtraction = daysinaWeeek - populationinKarnataka;
		long randomDivision = populationinWorld / populationinKarnataka;
		int randomMultiplication = daysinaWeeek * workerinCompany;
		int randomModulus = populationinKarnataka % workerinCompany;
		
		System.out.println();
		System.out.println("Addition : "+randomAddition);
		System.out.println("Subtraction : "+randomSubtraction);
		System.out.println("Multiplication : "+randomMultiplication);
		System.out.println("Division : "+randomDivision);
		System.out.println("Modulus : "+randomModulus);
	}
}	