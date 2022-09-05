package com.xworkz.dto;

import com.xworkz.dto.data.ApartmentDTO;

public class ApartmentDTODisplay {

	public static void main(String[] args) {
		ApartmentDTO ap = new ApartmentDTO();
		ap.setName("Indigo");
		ap.setType("Business");
		ap.setOwner("Vishal");
		ap.setRent(6000);
		ap.setParking(true);
		ap.setMaintenanceCost(2000);

		ApartmentDTO ap1 = new ApartmentDTO();
		ap1.setName("Indigo");
		ap1.setType("Business");
		ap1.setOwner("Vishal");
		ap1.setRent(6000);
		ap1.setParking(true);
		ap1.setMaintenanceCost(2000);

		if (ap.hashCode() == ap1.hashCode()) {
			System.out.println(ap.equals(ap1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
