package com.xworkz.fire.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(loadOnStartup = 2,urlPatterns = "/benki")
public class FireServlet extends HttpServlet{
	
	public FireServlet() {
		System.out.println("started the server");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("servlet started");
		res.setContentType("text/html");
		String name = req.getParameter("alias");
		String company = req.getParameter("company");
		String salary = req.getParameter("salary");
		System.out.println("name "+name);
		System.out.println("company "+company);
		System.out.println("salary "+salary);
		
		PrintWriter writer = res.getWriter();
		
		writer.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("this is benki")
		.append("<h1/>")
		.append("<br>")
		.append("Alias").append(name)
		.append("<br>")
		.append("Company").append(company)
		.append("<br>")
		.append("Salary").append(salary)
		.append("<body/>")
		.append("<html/>");
		
	}
	

}
