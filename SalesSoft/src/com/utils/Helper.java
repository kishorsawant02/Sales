package com.utils;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class Helper {

    private static final Logger LOGGER = Logger.getLogger(Helper.class);

	private static SessionFactory sessionFactory;
	
	static
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//configuration.configure("/edu/vt/vbi/ndssl/granite/mapping/hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(configuration
                .getProperties());
		sessionFactory = configuration
                .buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());
		//sessionFactory = configuration.buildSessionFactory();		
	}
	
	public static Session getSession(){
		LOGGER.info("Current open connections : "+sessionFactory.getStatistics().getSessionOpenCount());
		return sessionFactory.openSession();
	}
	
	public static void closeSession(Session session){
		if (session != null)
			session.close();
	}
	
}
