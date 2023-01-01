package com.string.string_buffer;

public class StringBufferMethods {
	public static void main(String[] args) {
		String s = "Vishnu";
		//char [] gj = {'s' ,'u', 'r', 'a', 'j'}; 
		StringBuffer don = new StringBuffer("A for Apple");
		//System.out.println(don.append(false));
		//System.out.println(don.append(gj));  // join anythig at last of the string
		//System.out.println(don.capacity());	// it default is 16 and in addition of the string
		//System.out.println(don.codePointAt(3));	 //ASCII value of the respective index
		//System.out.println(don.substring(1));	//print Starts from the given index
		//System.out.println(don.delete(2, 6));	// It delete the character between those given Index
		//System.out.println(don.insert(2, 1)); // insert anything in anywhere of the string with help of index
		//System.out.println(don.replace(2, 7, "Ant")); // replace the string in given boundry og index
		//System.out.println(don.subSequence(0, 11));  // restricting the output
		don.trimToSize();
	}
}
