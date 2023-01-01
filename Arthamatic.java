class Arthamatic{
	public static void main(String[] test){
		
		byte daysinaWeeek = 7;   //incompatible types -128 to 127
		short workerinCompany = 32767;  //incompatible types -32768 to 32767
		int populationinKarnataka = 2147483640; //integer number too large -2billion to 2 billion
		long populationinWorld = 9223372036854775807L; //integer number too large
		
		int randomAddition = daysinaWeeek + populationinKarnataka;
		int randomSubtraction = daysinaWeeek - populationinKarnataka;
		long randomDivision = populationinWorld / populationinKarnataka;
		int randomMultiplication = daysinaWeeek * workerinCompany;
		int randomModulus = populationinKarnataka % workerinCompany;
		
		System.err.println();
		System.err.println("Addition : "+randomAddition);
		System.err.println("Subtraction : "+randomSubtraction);
		System.err.println("Multiplication : "+randomMultiplication);
		System.err.println("Division : "+randomDivision);
		System.err.println("Modulus : "+randomModulus);
	}
}	