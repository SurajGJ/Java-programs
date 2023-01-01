package com.collection.list.array_list;

public class XworkzStudentRecord {

	public  static void main(String[] args) {
		StudentInXworkz student1 = new StudentInXworkz("Vikrant","CSR",2022,"Shivamogga","Asha");
		StudentInXworkz student2 = new StudentInXworkz("Shankar","Noraml",2019,"Hubballi","Asha");
		StudentInXworkz student3 = new StudentInXworkz("Mahadevan","CSR",2022,"Mysore","Omkar");
		StudentInXworkz student4 = new StudentInXworkz("Arjun","Noraml",2021, "Manglore","Omkar");
		StudentInXworkz student5 = new StudentInXworkz("Vijay","CSR",2020,"Mysore","Asha");
		StudentInXworkz student6 = new StudentInXworkz("Prakash","CSR",2022,"Shvamogga","Asha");
		StudentInXworkz student7 = new StudentInXworkz("Janya","Normal",2022,"Benglore","Asha");
		
		StudentInXworkz[] studentData = {student1,student2,student3,student4,student5,student6,student7};
		for(StudentInXworkz s:studentData) {
			if(s.trainer.equals("Asha")) {
				System.out.println("This students are trained by Asha");
				
				
				System.out.println(s.name);
				break;
			}
		}
	}
	
}
