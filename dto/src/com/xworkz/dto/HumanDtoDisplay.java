package com.xworkz.dto;

import com.xworkz.dto.data.HumanDto;

public class HumanDtoDisplay {

	public static void main(String[] args) {
		HumanDto s = new HumanDto();
		s.setName("Hanamant");
		s.setGender("Male");

		HumanDto s1 = new HumanDto();
		s1.setName("Hanamant");
		s1.setGender("Male");

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
