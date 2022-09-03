package com.xworkz.dto;

import com.xworkz.dto.data.HotelDto;

public class HotelDtoDisplay {

	public static void main(String[] args) {

		HotelDto hotel = new HotelDto();
		hotel.setName("Food Market");
		hotel.setType("veg & non-veg");

		HotelDto hotel1 = new HotelDto();
		hotel1.setName("Food Market");
		hotel1.setType("veg & non-veg");

		if (hotel.hashCode() == hotel1.hashCode()) {
			System.out.println(hotel.equals(hotel1));
			System.out.println(System.identityHashCode(hotel1));
		} else {
			System.out.println("it is not equals");
		}

	}

}
