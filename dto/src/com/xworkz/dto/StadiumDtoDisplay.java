package com.xworkz.dto;

import com.xworkz.dto.data.StadiumDTO;

public class StadiumDtoDisplay {

	public static void main(String[] args) {
		StadiumDTO s = new StadiumDTO();
		s.setName("Motera");
		s.setCountry("India");

		StadiumDTO s1 = new StadiumDTO();
		s1.setName("Motera");
		s1.setCountry("India");

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
