package ru.alexov.altarics.businesslogic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionfact = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		return new Configuration().configure().buildSessionFactory();
	}
	public static void shutdown() {
		getSessionsFactory().close();
	}
	public static SessionFactory getSessionsFactory() {
		
		return sessionfact;
	}

}
