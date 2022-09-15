package com.xworkz.primeminister.display;

import javax.naming.InvalidNameException;

import com.xworkz.primeminister.dao.PrimeMinisterDAO;
import com.xworkz.primeminister.dao.PrimeMinisterDAOImpl;
import com.xworkz.primeminister.exception.InvalidCheckIndexException;
import com.xworkz.primeminister.service.PrimeMinisterService;
import com.xworkz.primeminister.service.PrimeMinisterServiceImpl;

public class PrimeMinisterDisplay {

	public static void main(String[] args) {
		PrimeMinisterDAO dao = new PrimeMinisterDAOImpl();

		PrimeMinisterService ministerService = new PrimeMinisterServiceImpl(dao);
		try {
			ministerService.checkAndValidate("Narendra Modi");
			ministerService.checkAndValidate("Atal bihari bajapai");
			ministerService.checkAndValidate("Atal bihari bajapa");
			ministerService.checkAndValidate("Atal bihari bajap");
			ministerService.checkAndValidate("Atal bihari baja");
			ministerService.checkAndValidate("Atal bihari baj");
			ministerService.checkAndValidate("Atal bihari ba");

		} catch (InvalidNameException ine) {
			ine.getMessage();
		} catch (InvalidCheckIndexException icie) {
			icie.getMessage();
		}

	}

}
