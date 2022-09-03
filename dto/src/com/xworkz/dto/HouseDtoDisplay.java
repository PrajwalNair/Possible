package com.xworkz.dto;

import com.xworkz.dto.data.HouseDto;

public class HouseDtoDisplay {

	public static void main(String[] args) {
		HouseDto house = new HouseDto();
		house.setHouseNo("#141");
		house.setExternalPaintColor("White");

		HouseDto house1 = new HouseDto();
		house1.setHouseNo("#141");
		house1.setExternalPaintColor("White");

		if (house.hashCode() == house1.hashCode()) {
			System.out.println(house.equals(house1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
