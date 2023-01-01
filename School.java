class School{
	String name;
	String address;
	int totalClass;
	Teachers teacher = new Teachers();
	
	void learn(){
		System.out.println("School Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Total Number of Class : "+totalClass);
	}
	teacher.teach();
}}