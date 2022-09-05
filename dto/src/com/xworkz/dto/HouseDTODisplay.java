package com.xworkz.dto;

import com.xworkz.dto.data.HouseDTO;

public class HouseDTODisplay {

	public static void main(String[] args) {
		HouseDTO house = new HouseDTO();
		house.setHouseNo("#141");
		house.setExternalPaintColor("White");

		HouseDTO house1 = new HouseDTO();
		house1.setHouseNo("#141");
		house1.setExternalPaintColor("White");

		if (house.hashCode() == house1.hashCode()) {
			System.out.println(house.equals(house1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
