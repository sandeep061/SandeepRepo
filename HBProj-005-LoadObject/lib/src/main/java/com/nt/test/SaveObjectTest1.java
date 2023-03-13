package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;
import com.nt.util.HibernateUtil;

public class SaveObjectTest1{

	public static void main(String[] args) {
	
	Session ses=null;
	//Activate Hibernate framework
	
	//open session
	ses=HibernateUtil.getSession();
	try {
	Product res= ses.load(Product.class, 1);
	System.out.println(res.getClass()+"  "+res.getClass().getSuperclass());
	System.out.println(res.getPname());
//	System.out.println("res"+res);
	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

}

