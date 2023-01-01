package com.exception.compiletime_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.jar.Manifest;

public class Compiletime {
	public static void main(String[] args) {
		
		try {
			FileReader file = new FileReader("D:\\sdjfkjkhkhj.txt");
			BufferedReader buff = new BufferedReader(file);
			for (int i = 0; i < 2; i++) {
				System.out.println(buff.readLine());
			}
		} catch (IOException e) {
			
			System.out.println("exception caught");
		}
		
	}
}
