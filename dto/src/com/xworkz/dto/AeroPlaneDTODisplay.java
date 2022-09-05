package com.xworkz.dto;

import com.xworkz.dto.data.AeroPlaneDTO;
import com.xworkz.dto.data.FilmDTO;

public class AeroPlaneDTODisplay {

	public static void main(String[] args) {
		AeroPlaneDTO ae = new AeroPlaneDTO();
		ae.setName("Indigo");
		ae.setType("Business");
		ae.setCountry("India");
		ae.setState("Karnataka");
		ae.setCity("Hubli");
		ae.setTicketPrice(4500);

		AeroPlaneDTO ae1 = new AeroPlaneDTO();
		ae1.setName("Indigo");
		ae1.setType("Business");
		ae1.setCountry("India");
		ae1.setState("Karnataka");
		ae1.setCity("Hubli");
		ae1.setTicketPrice(4500);

		if (ae.hashCode() == ae1.hashCode()) {
			System.out.println(ae.equals(ae1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
