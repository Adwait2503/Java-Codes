package com.te.logincred;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String parameter = req.getParameter("user");
		String parameter2 = req.getParameter("password");
		UserCred cred = new UserCred();

		cred.setUserName(parameter);
		cred.setPassword(parameter2);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("datainput");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(cred);
		transaction.commit();
		
		
//		String a = " from usercred where userName =:uname and password =:upass";
//		Query createQuery = manager.createQuery(a);
//		List<UserCred> r = createQuery.getResultList();
//		for(UserCred result : r ) {
//			writer.println(result);
//		}
	}
}
