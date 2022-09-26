package com.xworkz.sudoko.servlet;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.sudoko.dto.JobApplicationDTO;

@WebServlet(loadOnStartup = 5,urlPatterns = "/job")
public class JobApplicationServlet extends HttpServlet {
	
	private List <JobApplicationDTO> dtos = new ArrayList ();
	
	
	public JobApplicationServlet() {
		System.out.println(this.getClass().getSimpleName());
		
	}
	
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("The server is running succesfully");
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phoneNo = req.getParameter("phoneno");
		String altPhNo = req.getParameter("altPhno");
		String gender = req.getParameter("gen");
		String qualification = req.getParameter("qualification");
		String yop = req.getParameter("yop");
		String university = req.getParameter("University");
		String address = req.getParameter("address");
		String skills = req.getParameter("skills");
//		String j1 = req.getParameter("skills1");
//		String j2 = req.getParameter("skills2");
		String salary = req.getParameter("salary");
		String experience = req.getParameter("experience");
		String idProof = req.getParameter("idproof");
		String idProofNo = req.getParameter("idProofNo");
		
		System.out.println("Name :"+name);
		System.out.println("E-mail :"+email);
		System.out.println("phoneno :"+phoneNo);
		System.out.println("altPhno :"+altPhNo);
		System.out.println("gen :"+gender);
		System.out.println("qualification :"+qualification);
		System.out.println("yop :"+yop);
		System.out.println("University :"+university);
		System.out.println("address :"+address);
		System.out.println("skills :"+skills);
//		System.out.println("skills :"+j1);
//		System.out.println("skills :"+j2);
		System.out.println("salary :"+salary);
		System.out.println("exp :"+experience);
		System.out.println("idproof :"+idProof);
		System.out.println("idProofNo :"+idProofNo);
		
		PrintWriter w  =res.getWriter();
		w.append("<html>")
		.append("<body>")
		.append("<h1>")
		.append("Registration is successfull below are the details")
		.append("</h1>")
		.append("Name "+name).append("<br/>")
		.append("E-mail :"+email).append("<br/>")
		.append("phoneno :"+phoneNo).append("<br/>")
		.append("altPhno :"+altPhNo).append("<br/>")
		.append("gen :"+gender).append("<br/>")
		.append("qualification :"+qualification).append("<br/>")
		.append("yop :"+yop).append("<br/>")
		.append("University :"+university).append("<br/>")
		.append("address :"+address).append("<br/>")
		.append("skills :"+skills).append("<br/>")
//		.append("skills :"+j1).append("<br/>")
//		.append("skills :"+j2).append("<br/>")
		.append("salary :"+salary).append("<br/>")
		.append("exp :"+experience).append("<br/>")
		.append("idproof :"+idProof).append("<br/>")
		.append("idProofNo :"+idProofNo).append("<br/>")
		.append("</body>")
		.append("</html>");
		
		JobApplicationDTO dto = new JobApplicationDTO(name,email,Long.parseLong(phoneNo),
				Long.parseLong(altPhNo),gender,qualification,Integer.parseInt(yop),university,
				address,skills,Double.parseDouble(salary),Integer.parseInt(experience),idProof,idProofNo);
				dtos.add(dto);
		
		
	}
	
	

}
