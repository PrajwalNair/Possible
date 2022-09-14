package com.xworkz.casino.service;

import com.xworkz.casino.dao.CasinoDAO;

public class CasinoServiceImpl implements CasinoService {

	private CasinoDAO casinoDao;

	public CasinoServiceImpl(CasinoDAO casinoDao) {
		this.casinoDao = casinoDao;

	}

	@Override
	public boolean checkAndValidate(String name) {
		if (name != null && name.length() > 3 && name.length() < 50) {
			if (this.casinoDao.checkName(name)) {
				System.out.println("name is present");
				return casinoDao.save(name);
			} else {
				System.out.println("name is not present");
			}
		}
		return false;
	}

}
