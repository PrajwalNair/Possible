package com.xworkz.pen.display;

import com.xworkz.pen.dao.PenDAO;
import com.xworkz.pen.dao.PenDAOImpl;
import com.xworkz.pen.service.PenService;
import com.xworkz.pen.service.PenServiceImpl;

public class PenDisplay {

	public static void main(String[] args) {
		PenDAO penDAO = new PenDAOImpl();
		penDAO.create("Reynolds");

		PenService penService = new PenServiceImpl(penDAO);
		boolean check = penService.checkAndValidate("Reynolds");
		System.out.println(check);

	}

}
