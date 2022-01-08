package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class Retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		/*
		 * Fetching
		 */
//		Team player = createEntityManager.find(Team.class, 3);
//		System.out.println(player);
		/*
		 * Deleteng
		 */
//		transaction.begin();
//		createEntityManager.remove(player);
//		transaction.commit();
		/*
		 * Updating
		 */
		Team kk = createEntityManager.find(Team.class, 18);
		if (kk != null) {
			kk.setName("Kimishta");
			transaction.begin();
			transaction.commit();
			System.out.println("Updated");
		}
	}

}
