package com.collection.set.repository;

import java.util.HashSet;

import com.collection.set.model.Hospital;

public interface HospitalRepository {

	public void add(Hospital hospitalDetails);

	public HashSet<Hospital> getHospital();
 
}
