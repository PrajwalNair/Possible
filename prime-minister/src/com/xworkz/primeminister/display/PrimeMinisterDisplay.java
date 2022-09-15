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
			ministerService.checkAndValidate("Atal Bihari Vajpayee");
			ministerService.checkAndValidate("H D Devegowda");
			ministerService.checkAndValidate("Chandra Shekhar");
			ministerService.checkAndValidate("V P Singh");
			ministerService.checkAndValidate("Lal Bahadur Shastri");
			ministerService.checkAndValidate("Jawahar Lal Nehru");

		} catch (InvalidNameException ine) {
			ine.getMessage();
			ine.getClass();
		} catch (InvalidCheckIndexException icie) {
			icie.getMessage();
		}

	}

}
