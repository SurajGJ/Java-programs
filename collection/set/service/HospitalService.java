package com.collection.set.service;

import com.collection.set.HospitalException;
import com.collection.set.model.Hospital;

public interface HospitalService {

	void add(Hospital hospitalDetails) throws HospitalException;
	
	Hospital getHospital(String hospitalName) throws HospitalException;
}
