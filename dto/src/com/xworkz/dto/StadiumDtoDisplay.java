package com.xworkz.dto;

import com.xworkz.dto.data.StadiumDto;

public class StadiumDtoDisplay {

	public static void main(String[] args) {
		StadiumDto s = new StadiumDto();
		s.setName("Motera");
		s.setCountry("India");

		StadiumDto s1 = new StadiumDto();
		s1.setName("Motera");
		s1.setCountry("India");

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
