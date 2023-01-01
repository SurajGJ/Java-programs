package com.java_classes.object_clas;
import java.util.Objects;

public class HashCodeDemo {
	int n=420;
	static int b= 55;
	
	HashCodeDemo(int b){
		hashCode();
	}
	
	public int hashCode() {
		return b-300;
	}
	
	public static void main(String[] args) {
		HashCodeDemo hcd =new HashCodeDemo(b);
		// hcd.b  = hcd.hashCode();
		//hcd.n = hcd.hashCode();
		
		System.out.println(hcd.n+"  %%   "+hcd.hashCode());
		System.out.println(b+"  %%   "+hcd.hashCode());
		System.out.println(hcd);
		
	}

}
