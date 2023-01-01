package com.polymorphism.methodOverLoading;

public class HumanTest{

	public static void main(String[] test) {
		Unknown stranger = new Unknown();
		Friend friend = new Friend();
		
		
		stranger.speak("unknown");
		friend.speak("friend");
		
	}
}
