package com.descion_making.ifelseif;

public class TrafficSignal{
	public static void main(String [] args){
		
	char color = 'z';
	
	
		if (color == 'r' )
			System.out.println("Stop the vehicle");
		else if(color == 'y')
			System.out.println("Start the engine and ready to go");
		else if (color == 'g')
			System.out.println("Move the vehicle");
		else
			System.out.println("not a Traffic signal color");
	}
}
