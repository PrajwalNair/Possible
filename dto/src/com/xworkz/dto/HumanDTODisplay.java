package com.xworkz.dto;

import com.xworkz.dto.data.HumanDTO;

public class HumanDTODisplay {

	public static void main(String[] args) {
		HumanDTO s = new HumanDTO();
		s.setName("Hanamant");
		s.setGender("Male");

		HumanDTO s1 = new HumanDTO();
		s1.setName("Hanamant");
		s1.setGender("Male");

		if (s.hashCode() == s1.hashCode()) {
			System.out.println(s.equals(s1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
