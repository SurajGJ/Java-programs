package com.xworks.pencil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworks.pencil.config.PencilConfig;
import com.xworks.pencil.dto.PencilDto;

public class PencilRunner {

	public static void main(String[] args) {
		
		PencilDto dto1 = new PencilDto(1,"Natraja","Heagon","Red",3);
		PencilDto dto2 = new PencilDto(2,"Apsara","Triangle","Gray",5);
		
		Session session = PencilConfig.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(dto1);
//		session.save(dto2);
		System.out.println(session.get(PencilDto.class, 1));
		
		Criteria criteria = session.createCriteria(PencilDto.class);//read all
		List<PencilDto> list = criteria.list();//list create to read()
        System.out.println(list);
		

		transaction.commit();
		session.close();
	}

}
