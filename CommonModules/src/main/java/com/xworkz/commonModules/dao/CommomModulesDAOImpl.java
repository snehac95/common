package com.xworkz.commonModules.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.commonModules.entity.CommonModulesEntity;


@Repository

public class CommomModulesDAOImpl implements CommonModulesDAO{
	
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public CommomModulesDAOImpl() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public Serializable save(CommonModulesEntity  commonModulesEntity ) {
		System.out.println("Invoking save method");
		Session session = null;
		try {

			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begun");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(commonModulesEntity );
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}

		return 0;
	}

}





