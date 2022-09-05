package com.xworkz.dto;

import com.xworkz.dto.data.ShowRoomDTO;

public class ShowRoomDTODisplay {

	public static void main(String[] args) {
		ShowRoomDTO sw = new ShowRoomDTO();
		sw.setAc(true);
		sw.setFan(true);
		sw.setTypeOfAc("automatic");
		sw.setPriceOfAc(35000);
		sw.setSecurityName("vikram");
		sw.setSecurity(true);
		sw.setNoOfchairs(10);
		sw.setNoOfDoors(12);
		sw.setNoOfFans(4);
		sw.setNoOfTables(2);
		sw.setNoOfLights(5);
		sw.setNoOfRooms(8);
		sw.setPriceOfChairs(560);
		sw.setPriceOfTables(2000);
		sw.setPriceOfFans(2500);
		sw.setPriceOfWindow(3000);

		ShowRoomDTO sw1 = new ShowRoomDTO();
		sw1.setAc(true);
		sw1.setFan(true);
		sw1.setTypeOfAc("automatic");
		sw1.setPriceOfAc(35000);
		sw1.setSecurityName("vikram");
		sw1.setSecurity(true);
		sw1.setNoOfchairs(10);
		sw1.setNoOfDoors(12);
		sw1.setNoOfFans(4);
		sw1.setNoOfTables(2);
		sw1.setNoOfLights(5);
		sw1.setNoOfRooms(8);
		sw1.setPriceOfChairs(560);
		sw1.setPriceOfTables(2000);
		sw1.setPriceOfFans(2500);
		sw1.setPriceOfWindow(3000);

		if (sw.hashCode() == sw1.hashCode()) {
			System.out.println(sw.equals(sw1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
