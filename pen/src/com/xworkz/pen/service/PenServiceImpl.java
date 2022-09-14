package com.xworkz.pen.service;

import com.xworkz.pen.dao.PenDAO;

public class PenServiceImpl implements PenService {
	private PenDAO penDAO;

	public PenServiceImpl(PenDAO penDAO) {
		this.penDAO = penDAO;
	}

	@Override
	public boolean checkAndValidate(String name) {
		if (name != null && name.length() > 3 && name.length() < 50) {
			if (penDAO.checkName(name)) {
				System.out.println("name is valid");
			}
			return true;
		}
		return false;
	}

}
