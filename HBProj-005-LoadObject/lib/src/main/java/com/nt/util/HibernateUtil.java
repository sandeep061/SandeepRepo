package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory=null;
    static{
    	Configuration cfg=null;
    	try {
    		//bootstraping hibernate 
    		cfg=new Configuration();
    		cfg.configure("com/nt/cfgs/hibernate.cfgs.xml");
    		//create session factory object
    		factory=cfg.buildSessionFactory();
    	}
    	catch (HibernateException he) {
			he.printStackTrace();
		}
    	catch (Exception e) {
		e.printStackTrace();
		}
    }//static block
    public static Session getSession() {
    	Session ses=null;
    	if(factory!=null) {
    		ses=factory.openSession();
    		return ses;
    	}
    	else
    		return null;
    }
    public static void closeSession(Session ses) {
    	if(ses!=null) {
    		ses.close();
    	}
    }
    	public static void closeSessionFactory() {
    		if(factory!=null) {
    			factory.close();
    		}
    	}
    }

