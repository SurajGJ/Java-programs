package com.xworkz.soap.constants;

public enum MySqlCredentials {

	URL("jdbc:mysql://localhost:3306/Jdbc"), USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	String value;

	private MySqlCredentials(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
