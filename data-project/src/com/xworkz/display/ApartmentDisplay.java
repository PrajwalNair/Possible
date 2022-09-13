package com.xworkz.display;

import com.xworkz.dao.ApartmentDAO;
import com.xworkz.dao.impl.ApartmentDAOImpl;
import com.xworkz.dto.ApartmentDTO;

public class ApartmentDisplay {

	public static void main(String[] args) {
		ApartmentDTO dto = new ApartmentDTO();
		dto.setName("Galaxy Apartment");
		dto.setNoOfFloors(5);
		dto.setNoOfFlats(10);
		dto.setLifts(true);
		dto.setWaterTank(true);
		dto.setCostOfConstruction(10.00);
		dto.setStairCase(true);
		dto.setNoOfDoors(30);
		dto.setNoOfWindows(52);
		dto.setNoOfFans(50);
		dto.setFireFighting(true);
		dto.setNoOfLights(100);
		dto.setChejja(true);
		dto.setVentilators(true);
		dto.setDoors(true);

		ApartmentDAO dao = new ApartmentDAOImpl();
		dao.create(dto);

	}

}
