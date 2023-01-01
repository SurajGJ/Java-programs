package com.array.two_dimensional_array;

public class TwoDArrayRepresenttion {
	
	public static void main(String[] ars) {
		int[][] num = new int[4][4];
		int n = 20;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j]=n;
				n+=5;
			}
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
					System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
