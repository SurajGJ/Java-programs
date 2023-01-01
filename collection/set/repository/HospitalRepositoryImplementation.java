package com.collection.set.repository;

import java.util.HashSet;

import com.collection.set.model.Hospital;

public class HospitalRepositoryImplementation implements HospitalRepository{

	HashSet<Hospital> hospital = new HashSet<Hospital>();
	
	public void add(Hospital hospitalDetails) {
		boolean result = hospital.add(hospitalDetails);
		if(result)
		System.out.println("Hospital Details added Sucessfully");
	}
	
	
	public HashSet<Hospital> getHospital() {
		return hospital;
	}

}
