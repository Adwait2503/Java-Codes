package com.te.hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of data you want to Enter :-");
		int input = scanner.nextInt();
		Team team = new Team();
		for (int i = 1; i <= input; i++) {
			System.out.println("Enter the Id of the player :-");
			int id = scanner.nextInt();
			System.out.println("Enter the Name of the player :-");
			String name = scanner.next();
			System.out.println("Enter the salary of the player :-");
			double salary = scanner.nextDouble();
			System.out.println("Enter the designation of the player :-");
			String designation = scanner.next();
			team.setId(id);
			team.setName(name);
			team.setSalary(salary);
			team.setDesignation(designation);
			EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("team");
			EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(team);
			transaction.commit();
		}
	}

}
