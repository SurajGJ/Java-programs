package com.collection.set;

import java.util.HashSet;
import com.collection.set.model.Doctor;
import com.collection.set.model.Hospital;
import com.collection.set.service.HospitalService;
import com.collection.set.service.HospitalServiceImplimentation;

public class HospitalTest {

	public static void main(String [] args)  {
		
		HospitalService service = new HospitalServiceImplimentation();
		
		Doctor suraj = new Doctor();
		suraj.setName("Suraj");
		suraj.setSplization("Pulmanary");
		HashSet<Doctor> victoriaDoctor = new HashSet<Doctor>();
		victoriaDoctor.add(suraj);
		
		Hospital victoria = new Hospital();
		victoria.setName("Victoria");
		victoria.setDoctor(victoriaDoctor);
		
		Doctor hitesh = new Doctor();
		hitesh.setName("Hitesh Kumar");
		hitesh.setSplization("Dentist");
		HashSet<Doctor> simsDoctor = new HashSet<Doctor>();
		simsDoctor.add(hitesh);
		
		Hospital sims = new Hospital();
		sims.setDoctor(simsDoctor);
		sims.setName("SIMS");
		
		Hospital manipal = new Hospital();
		manipal.setName("Victoria");
		manipal.setDoctor(victoriaDoctor);
		
		
		
			try {
				service.add(victoria);
				service.add(manipal);
				service.add(sims);
				
			}
			catch(HospitalException e) {
				System.out.println(e);
			}
			
			try {
				Hospital hospital = service.getHospital("Kims");
				System.out.println("Details of SIMS : "+hospital);
			}
			catch(HospitalException e) {
				System.out.println(e.getMessage() );
			}
		
	}
}
