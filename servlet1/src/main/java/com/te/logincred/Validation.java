package com.te.logincred;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Validation extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("datainput");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		String query = "select password from usercred where userName=:uname";
		Query createQuery = manager.createQuery(query);
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("password");
		createQuery.setParameter("uname", parameter);
		Object singleResult = null;
RequestDispatcher dispatcher = req.getRequestDispatcher("./invalid");
	}
}
