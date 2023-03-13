package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
	
	Session ses=null;
	//Activate Hibernate framework
	
	//open session
	ses=HibernateUtil.getSession();
	Product res= ses.get(Product.class, 1);
//	System.out.println("res"+res);
	
	
	}

}

