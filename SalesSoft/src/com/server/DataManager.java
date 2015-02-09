package com.server;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.domain.Company;
import com.domain.User;
import com.utils.Helper;

/**
 * @author Kishor
 * 
 */
public class DataManager {
	private static final Logger LOGGER = Logger.getLogger(DataManager.class);

	/**
	 * Adds the user.
	 * 
	 * @param user
	 *            the user
	 * @return true, if successful
	 */
	public static boolean addUser(User user) {
		boolean addUser = false;
		Session session = Helper.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			System.out.println("inside addUser  " + session.toString());
			session.save(user);
			addUser = true;
			transaction.commit();
		} catch (RuntimeException e) {
			try {
				addUser = false;
				transaction.rollback();
			} catch (RuntimeException ex) {
				ex.printStackTrace();
			}
			throw e;
		} finally {
			session.close();
		}
		return addUser;
	}

	public static boolean addCompany(Company company) {
		boolean addcompany = false;
		Session session = Helper.getSession();
		Transaction transaction = session.beginTransaction();
		try {
			System.out.println("inside add company  " + session.toString());
			session.save(company);
			addcompany = true;
			transaction.commit();
		} catch (RuntimeException e) {
			try {
				addcompany = false;
				transaction.rollback();
			} catch (RuntimeException ex) {
				ex.printStackTrace();
			}
			throw e;
		} finally {
			session.close();
		}
		return addcompany;
	}
}
