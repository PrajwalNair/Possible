package com.xworkz.dto;

import com.xworkz.dto.data.BusDTO;

public class BusDTODisplay {

	public static void main(String[] args) {
		BusDTO b = new BusDTO();
		b.setBrand("volvo");
		b.setType("public");
		b.setNoPlate("KA25M2050");
		b.setWayOfTransport("land");
		b.setNoOfPassengers(40);
		b.setNoOfWheels(6);

		BusDTO b1 = new BusDTO();
		b1.setBrand("volvo");
		b1.setType("public");
		b1.setNoPlate("KA25M2050");
		b1.setWayOfTransport("land");
		b1.setNoOfPassengers(40);
		b1.setNoOfWheels(6);

		if (b.hashCode() == b1.hashCode()) {
			System.out.println(b.equals(b1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
