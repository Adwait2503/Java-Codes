package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Team player = new Team();
		player.setId(1);
		player.setName("MS Dhoni");
		player.setSalary(10000);
		player.setDesignation("Captain");
		Team player1 = new Team();
		player1.setId(18);
		player1.setName("King Kohli");
		player1.setSalary(7000);
		player1.setDesignation("Vice Captain");

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(player);
		createEntityManager.persist(player1);
		transaction.commit();
	}
}
