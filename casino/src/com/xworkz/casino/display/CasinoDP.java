package com.xworkz.casino.display;

import com.xworkz.casino.dao.CasinoDAO;
import com.xworkz.casino.dao.CasinoDAOImpl;
import com.xworkz.casino.service.CasinoService;
import com.xworkz.casino.service.CasinoServiceImpl;

public class CasinoDP {
	public static void main(String[] args) {
		CasinoDAO casinoDAO=new CasinoDAOImpl();
		casinoDAO.save("DPNair");
		CasinoService casinoService=new CasinoServiceImpl(casinoDAO);
		
	 boolean checkAndValidate = casinoService.checkAndValidate("DPNair");
		System.out.println(checkAndValidate);
	}

}
