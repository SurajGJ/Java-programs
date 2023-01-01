class DataTypes{
	public static void main(String Test[]){
		
		byte daysinaWeeek = 7;   //incompatible types -128 to 127
		short workerinCompany = 32767;  //incompatible types -32768 to 32767
		int populationinKarnataka = 2147483640; //integer number too large -2billion to 2 billion
		long populationinWorld = 9223372036854775807L; //integer number too large
		float  time = 19.22f; //Stores 6-7 decimal digit
		double valueofPai = 3.1415926535; //Stores 15 decimal digit
		char symbol = '$'; //Stores all character
		boolean oneSun=true; //Stores only 0/1
		
		String strinDo = "String is Non Primitive Datatype"; //Non Primitive
		
		System.out.println("Total number of days in a Week : "+daysinaWeeek);
		System.out.println("Total number of Worker in a Coompany : "+workerinCompany);
		System.out.println("Population of karnataka : "+populationinKarnataka);
		System.out.println("Pulation of the World : "+populationinWorld);
		System.out.println("Time : "+time);
		System.out.println("Value of Pai : "+valueofPai);
		System.out.println("Dollar Symbol : "+symbol);
		System.out.println("Only one Sun in our Galaxy : "+oneSun);
		System.out.println("What kind of Datatype is String is : "+strinDo);
		
		
		String[] pets={"Vamshi", "Juju", "Chukki", "Dia"};  //Non Primitive
		System.out.println();
		System.out.println("Name of Pets that i know them very well");
		for(int count=0; count<pets.length; count++)
		{
			String refrence = pets[count];
			
			System.out.println(refrence);
		}
		
	/*  if(daysinaWeeek = 8)
		{
			System.out.println("Only 7 days in Week");
		}
		else
		{
			System.out.println("It is Correct");
		}*/
	}
}