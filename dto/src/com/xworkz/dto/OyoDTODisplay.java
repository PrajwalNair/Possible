package com.xworkz.dto;

import com.xworkz.dto.data.OyoDTO;

public class OyoDTODisplay {

	public static void main(String[] args) {
		OyoDTO oy = new OyoDTO();
		oy.setAc(true);
		oy.setFan(true);
		oy.setTypeOfAc("automatic");
		oy.setPriceOfAc(35000);
		oy.setSecurityName("vikram");
		oy.setSecurity(true);
		oy.setNoOfchairs(10);
		oy.setNoOfDoors(12);
		oy.setNoOfFans(4);
		oy.setNoOfTables(2);
		oy.setNoOfLights(5);
		oy.setNoOfRooms(8);
		oy.setPriceOfChairs(560);
		oy.setPriceOfTables(2000);
		oy.setPriceOfFans(2500);
		oy.setPriceOfWindow(3000);

		OyoDTO oy1 = new OyoDTO();
		oy1.setAc(true);
		oy1.setFan(true);
		oy1.setTypeOfAc("automatic");
		oy1.setPriceOfAc(35000);
		oy1.setSecurityName("vikram");
		oy1.setSecurity(true);
		oy1.setNoOfchairs(10);
		oy1.setNoOfDoors(12);
		oy1.setNoOfFans(4);
		oy1.setNoOfTables(2);
		oy1.setNoOfLights(5);
		oy1.setNoOfRooms(8);
		oy1.setPriceOfChairs(560);
		oy1.setPriceOfTables(2000);
		oy1.setPriceOfFans(2500);
		oy1.setPriceOfWindow(3000);

		if (oy.hashCode() == oy1.hashCode()) {
			System.out.println(oy.equals(oy1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
