package com.te.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");

		if (parameter.equalsIgnoreCase("Adwait")) {
			resp.sendRedirect("http://www.youtube.com");
		}
		if (parameter.equalsIgnoreCase("Dev")) {
			resp.sendRedirect("./Login.html");
		}
		
//		UserCred cred = new UserCred();
//		cred.setUsername(parameter);
//		cred.setPassword(parameter2);

		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("datainput");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
//		manager.persist(cred);
//		transaction.commit();
	}
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter writer = res.getWriter();
//		String string = req.getParameter("uname");
//		String string2 = req.getParameter("upass");
//		writer.println("<h1 align=\"center\">Welcome" + string + "</h1> ");
//		writer.println("<h1 align=\"center\">Your password is " + string2 + "</h1> ");
//		String[] values = req.getParameterValues("sports");
//		for (int i = 0; i < values.length; i++) {
//			writer.println("<h1 align=\"center\">" + values[i] + "</h1>");
//		}
//	}

}
