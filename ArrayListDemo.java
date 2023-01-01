import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("hi");
		ArrayList<Students> student = new ArrayList<Students>();
		Students suraj = new Students("Suraj", "a01", "JNNCE");
		Students hritik = new Students("Hritik", "a02", "RITZ");
		Students roshan = new Students("Roshan", "a03", "EMPC");
		Students sharuk = new Students("Sharuk", "a04", "TEKP");
		//Students khan = new Student("khan", "a05", "AHCE");

		student.add(suraj);
		student.add(hritik);
		student.add(roshan);
		student.add(sharuk);
		//student.add(khan);
		
		for (Students s : student) {
			if (s.collage.equals("JNNCE")) {
				System.out.println(s);
			}
		}

	}
}
