class Student{
	
	 String name,rollno,dob,college,branch;
	 
	 void study()
	 {
		 System.out.println(name+", Roll Number : "+rollno+", Date of Birth : "+dob+"; From "+college+" college, "+branch+" branch");
	 }
	 
	 public static void main(String[] data)
	 {
		 Student Hitesh = new Student();
		 
		 Hitesh.name="Hitesh Kumar";
		 Hitesh.rollno="TE014";
		 Hitesh.dob="24 May 2000";
		 Hitesh.college="JNNCE";
		 Hitesh.branch="TCE";
		 
		 Hitesh.study();
		 
		 Student Shamanth = new Student();
		 
		 Shamanth.name="Shamanth Kumar";
		 Shamanth.rollno="TE037";
		 Shamanth.dob="20 November 2000";
		 Shamanth.college="JNNCE";
		 Shamanth.branch="TCE";
		 
		 Shamanth.study();
		 
		 Student Rohan = new Student();
		 
		 Rohan.name="Rohan L";
		 Rohan.rollno="TE035";
		 Rohan.dob="09 March 2000";
		 Rohan.college="JNNCE";
		 Rohan.branch="TCE";
		 
		 Rohan.study();
		 
		 Student Suraj = new Student();
		 
		 Suraj.name="Suraj S";
		 Suraj.rollno="TE045";
		 Suraj.dob="15 November 2000";
		 Suraj.college="JNNCE";
		 Suraj.branch="TCE";
		 
		 Suraj.study();
		
		 Student Sushruth = new Student();
		 
		 Sushruth.name="Sushruth H G";
		 Sushruth.rollno="TE046";
		 Sushruth.dob="11 August 2000";
		 Sushruth.college="JNNCE";
		 Sushruth.branch="TCE";
		 
		 Sushruth.study();
		 
		 new Student().study();
	 }
}