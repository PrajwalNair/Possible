package com.xworkz.dto;

import com.xworkz.dto.data.ShopDTO;

public class ShopDTODisplay {

	public static void main(String[] args) {
		ShopDTO sh = new ShopDTO();
		sh.setAc(true);
		sh.setFan(true);
		sh.setTypeOfAc("automatic");
		sh.setPriceOfAc(35000);
		sh.setSecurityName("vikram");
		sh.setSecurity(true);
		sh.setNoOfchairs(10);
		sh.setNoOfDoors(12);
		sh.setNoOfFans(4);
		sh.setNoOfTables(2);
		sh.setNoOfLights(5);
		sh.setNoOfRooms(8);
		sh.setPriceOfChairs(560);
		sh.setPriceOfTables(2000);
		sh.setPriceOfFans(2500);
		sh.setPriceOfWindow(3000);

		ShopDTO sh1 = new ShopDTO();
		sh1.setAc(true);
		sh1.setFan(true);
		sh1.setTypeOfAc("automatic");
		sh1.setPriceOfAc(35000);
		sh1.setSecurityName("vikram");
		sh1.setSecurity(true);
		sh1.setNoOfchairs(10);
		sh1.setNoOfDoors(12);
		sh1.setNoOfFans(4);
		sh1.setNoOfTables(2);
		sh1.setNoOfLights(5);
		sh1.setNoOfRooms(8);
		sh1.setPriceOfChairs(560);
		sh1.setPriceOfTables(2000);
		sh1.setPriceOfFans(2500);
		sh1.setPriceOfWindow(3000);

		if (sh.hashCode() == sh1.hashCode()) {
			System.out.println(sh.equals(sh1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
