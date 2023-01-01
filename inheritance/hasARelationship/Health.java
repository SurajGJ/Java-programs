package com.inheritance.hasARelationship;

public class Health {

	public static void main(String[] args) {
		Human human = new Human();
		
		System.out.println("Name : "+human.name);
		System.out.println("Gender : "+human.gender);
		System.out.println("Contact Number : "+human.contactNumber);
		if(human.dailyExercise != true)
			System.out.println("Please do some Physical work or exercise daily");
		
		System.out.println();
		
		System.out.println("Tested Results");
		System.out.println("Blood Pressure : "+human.heart.bloodPressure+ " mmHg");
		System.out.println("Heart Beat Rate : "+human.heart.heartBeatRate+ " beats per minute");
		
		if ((human.heart.bloodPressure <80 || human.heart.bloodPressure >120 ) || (human.heart.heartBeatRate <60 || human.heart.heartBeatRate > 100) || (human.heart.painInChest == true))
			System.out.println("Suggestion : Please consult Cardiac Surgeon immiadiatly");
		else
			System.out.println("Your ECG repot hold Good number, that your are tested NORMAL"); 
	}

}
