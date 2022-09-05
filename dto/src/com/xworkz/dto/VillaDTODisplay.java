package com.xworkz.dto;

import com.xworkz.dto.data.VillaDTO;

public class VillaDTODisplay {

	public static void main(String[] args) {
		VillaDTO v = new VillaDTO();
		v.setAc(true);
		v.setFan(true);
		v.setTypeOfAc("automatic");
		v.setPriceOfAc(35000);
		v.setSecurityName("vikram");
		v.setSecurity(true);
		v.setNoOfchairs(10);
		v.setNoOfDoors(12);
		v.setNoOfFans(4);
		v.setNoOfTables(2);
		v.setNoOfLights(5);
		v.setNoOfRooms(8);
		v.setPriceOfChairs(560);
		v.setPriceOfTables(2000);
		v.setPriceOfFans(2500);
		v.setPriceOfWindow(3000);

		VillaDTO v1 = new VillaDTO();
		v1.setAc(true);
		v1.setFan(true);
		v1.setTypeOfAc("automatic");
		v1.setPriceOfAc(35000);
		v1.setSecurityName("vikram");
		v1.setSecurity(true);
		v1.setNoOfchairs(10);
		v1.setNoOfDoors(12);
		v1.setNoOfFans(4);
		v1.setNoOfTables(2);
		v1.setNoOfLights(5);
		v1.setNoOfRooms(8);
		v1.setPriceOfChairs(560);
		v1.setPriceOfTables(2000);
		v1.setPriceOfFans(2500);
		v1.setPriceOfWindow(3000);

		if (v.hashCode() == v1.hashCode()) {
			System.out.println(v.equals(v1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
