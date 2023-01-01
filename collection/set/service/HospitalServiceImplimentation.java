package com.collection.set.service;

import java.util.HashSet;

import com.collection.set.HospitalException;
import com.collection.set.model.Hospital;
import com.collection.set.repository.HospitalRepository;
import com.collection.set.repository.HospitalRepositoryImplementation;

public class HospitalServiceImplimentation implements HospitalService{

	HospitalRepository hospitalRepository = new HospitalRepositoryImplementation();
	
	public void add(Hospital hospitalDetails) throws HospitalException{
		if(hospitalDetails != null) {
			hospitalRepository.add(hospitalDetails);
		}
		else {			 
			throw new HospitalException();
			}
		}

	@Override
	public Hospital getHospital(String hospitalName) throws HospitalException {
		HashSet<Hospital> hospital = hospitalRepository.getHospital();
		Hospital hospitalDetails = null;
		
		for(Hospital hospitals:hospital) {
			if(hospitals.getName().equals(hospitalName)) {
				hospitalDetails = hospitals;
			}
		}
		if(hospitalDetails == null) {
			throw new HospitalException();
		}
		return hospitalDetails;
	}
	
	}
 
