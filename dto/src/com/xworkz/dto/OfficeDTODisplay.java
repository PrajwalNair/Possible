package com.xworkz.dto;

import com.xworkz.dto.data.OfficeDTO;

public class OfficeDTODisplay {

	public static void main(String[] args) {
		OfficeDTO of = new OfficeDTO();
		of.setAc(true);
		of.setFan(true);
		of.setTypeOfAc("automatic");
		of.setPriceOfAc(35000);
		of.setSecurityName("vikram");
		of.setSecurity(true);
		of.setNoOfchairs(10);
		of.setNoOfDoors(12);
		of.setNoOfFans(4);
		of.setNoOfTables(2);
		of.setNoOfLights(5);
		of.setNoOfRooms(8);
		of.setPriceOfChairs(560);
		of.setPriceOfTables(2000);
		of.setPriceOfFans(2500);
		of.setPriceOfWindow(3000);

		OfficeDTO of1 = new OfficeDTO();
		of1.setAc(true);
		of1.setFan(true);
		of1.setTypeOfAc("automatic");
		of1.setPriceOfAc(35000);
		of1.setSecurityName("vikram");
		of1.setSecurity(true);
		of1.setNoOfchairs(10);
		of1.setNoOfDoors(12);
		of1.setNoOfFans(4);
		of1.setNoOfTables(2);
		of1.setNoOfLights(5);
		of1.setNoOfRooms(8);
		of1.setPriceOfChairs(560);
		of1.setPriceOfTables(2000);
		of1.setPriceOfFans(2500);
		of1.setPriceOfWindow(3000);

		if (of.hashCode() == of1.hashCode()) {
			System.out.println(of.equals(of1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
