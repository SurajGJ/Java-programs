package com.xworkz.airCondition;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.airCondition.config.AirConditionConfig;
import com.xworkz.airCondition.dto.AirConditionDto;

public class AirCondiionRunner {

	public static void main(String[] args) {
		
		AirConditionDto dto1 = new AirConditionDto(1, "Lg", 4, "White", 15000);
		AirConditionDto dto2 = new AirConditionDto(2, "Samsung", 5, "Black", 20000);
		AirConditionDto dto3 = new AirConditionDto(3, "Voltas", 5, "White", 17000);
		AirConditionDto dto4 = new AirConditionDto(4, "Whirlpool", 3, "Greay", 12000);
		AirConditionDto dto5 = new AirConditionDto(5, "Blue Star", 4, "Black", 10000);
		
		Session session = AirConditionConfig.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);
//		session.save(dto5);
		
		
		System.out.println(session.get(AirConditionDto.class, 4));
		
		Criteria criteria = session.createCriteria(AirConditionDto.class);//read all
		List<AirConditionDto> list = criteria.list();//list create to read()
        System.out.println(list);

		transaction.commit();
		session.close();
	}

}
