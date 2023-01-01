package com.TypeCasting.non_primitive_casting;

public class Universe {

	public static void main(String[] args) {
		
		MilkywayGalaxy home = new MilkywayGalaxy();
		//Galaxy our = (Galaxy) new MilkywayGalaxy();
		MilkywayGalaxy home2 = (MilkywayGalaxy) home;
		//MilkywayGalaxy home2 = (home) new Galaxy();
		home.nosilence();
		home2.nosilence();
	}
}
