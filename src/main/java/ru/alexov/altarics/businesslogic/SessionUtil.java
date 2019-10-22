package ru.alexov.altarics.businesslogic;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SessionUtil {

	private Session session;
	private Transaction transaction;
	
	public Session getSession() {
		return session;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	
	public Session openSession() {
		return HibernateUtil.getSessionsFactory().openSession();
	}
	public Session openTransactionSession() {
		session = openSession();
		transaction = session.beginTransaction();
		return session;
	}
}
