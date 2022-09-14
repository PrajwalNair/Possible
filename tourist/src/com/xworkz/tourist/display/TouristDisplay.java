package com.xworkz.tourist.display;

import com.xworkz.tourist.customexception.TouristPlaceValidateException;
import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.service.TouristService;
import com.xworkz.tourist.service.TouristServiceImpl;

public class TouristDisplay {

	public static void main(String[] args) {
		TouristDAO touristDAO = new TouristDAOImpl();

		TouristService touristService = new TouristServiceImpl(touristDAO);

		try {
			touristService.checkAndValidatePlace("Maldives");
			touristService.checkAndValidatePlace("Coorg");
			touristService.checkAndValidatePlace("Australia");
			touristService.checkAndValidatePlace("Jamaica");
			touristService.checkAndValidatePlace("Srilanka");
			touristService.checkAndValidatePlace("Switzerland");
			touristService.checkAndValidatePlace("Singapore");
			touristService.checkAndValidatePlace("Paris");
			touristService.checkAndValidatePlace("China");
			touristService.checkAndValidatePlace("Russia");
			touristService.checkAndValidatePlace("Russia");

		} catch (TouristPlaceValidateException tpve) {
			System.out.println(tpve.getMessage());
			System.out.println(tpve.getClass());
		}
	}

}
