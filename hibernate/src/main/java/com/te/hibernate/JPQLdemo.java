package com.te.hibernate;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//		String query = "from Team";
//		String query="from Team where id=4";
//		Query createQuery2 = createEntityManager.createQuery(query);
//		Object singleResult = createQuery2.getSingleResult();
//		System.out.println(singleResult);
//		String query = "Select min(salary) from Team";
//		Query createQuery2 = createEntityManager.createQuery(query);
//		Double singleResult = (Double) createQuery2.getSingleResult();
//		System.out.println(singleResult);
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query="update Team set salary=:sal where id=:od";
//		String query="delete Team where designation='Vice Captain'";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query);
		createQuery.setParameter("sal", 12000.0);
		createQuery.setParameter("od", 1);
		int update = createQuery.executeUpdate();
		transaction.commit();
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);
//		}

	}

}
