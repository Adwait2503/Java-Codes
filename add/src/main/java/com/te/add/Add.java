package com.te.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		int parameter = Integer.parseInt(req.getParameter("number1"));
		int parameter2 = Integer.parseInt(req.getParameter("number2"));
		int result = parameter + parameter2;
		writer.println("The summation is =" + result);
	}
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter writer = res.getWriter();
//		int parameter = Integer.parseInt(req.getParameter("number1"));
//		int parameter2 = Integer.parseInt(req.getParameter("number2"));
//		int result = parameter + parameter2;
//		writer.println("The summation is =" + result);
}
