package com.xworkz.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/liquid")
public class GreenMoonServlet extends HttpServlet{
	public GreenMoonServlet() {
		System.out.println("running moon servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service is provided");
		res.setContentType("text/html");
		PrintWriter writer=res.getWriter();
		writer.append("<html>\r\n"
				+ "  <body bgcolor=\"green\">\r\n"
				+ "    <h1>idu green</h1>\r\n"
				+ "  </body>\r\n"
				+ "</html>");
	}

}
