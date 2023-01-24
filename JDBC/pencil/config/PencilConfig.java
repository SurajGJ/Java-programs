package com.xworks.pencil.config;

import java.sql.Connection;
import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworks.pencil.dto.PencilDto;


public class PencilConfig {

	private static SessionFactory sessionfactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory == null) {
			
			Configuration config = new Configuration();
			Properties properties = new Properties();
			
			properties.put(Environment.URL,"jdbc:mysql://localhost:3306/jdbc");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
//			properties.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			config.setProperties(properties);
			config.addAnnotatedClass(PencilDto.class);
			
			ServiceRegistry service = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			
			sessionfactory = config.buildSessionFactory(service);
			
			return sessionfactory;
		}
		
		return null;
	}
	
}
