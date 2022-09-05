package com.xworkz.dto;

import com.xworkz.dto.data.ShipDTO;

public class ShipDTODisplay {

	public static void main(String[] args) {
		ShipDTO s = new ShipDTO();
		s.setAc(true);
		s.setFan(true);
		s.setTypeOfAc("automatic");
		s.setPriceOfAc(35000);
		s.setSecurityName("vikram");
		s.setSecurity(true);
		s.setNoOfchairs(10);
		s.setNoOfDoors(12);
		s.setNoOfFans(4);
		s.setNoOfTables(2);
		s.setNoOfLights(5);
		s.setNoOfRooms(8);
		s.setPriceOfChairs(560);
		s.setPriceOfTables(2000);
		s.setPriceOfFans(2500);
		s.setPriceOfWindow(3000);

		ShipDTO s1 = new ShipDTO();
		s1.setAc(true);
		s1.setFan(true);
		s1.setTypeOfAc("automatic");
		s1.setPriceOfAc(35000);
		s1.setSecurityName("vikram");
		s1.setSecurity(true);
		s1.setNoOfchairs(10);
		s1.setNoOfDoors(12);
		s1.setNoOfFans(4);
		s1.setNoOfTables(2);
		s1.setNoOfLights(5);
		s1.setNoOfRooms(8);
		s1.setPriceOfChairs(560);
		s1.setPriceOfTables(2000);
		s1.setPriceOfFans(2500);
		s1.setPriceOfWindow(3000);

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
