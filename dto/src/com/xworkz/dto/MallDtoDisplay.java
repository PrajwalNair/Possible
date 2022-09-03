package com.xworkz.dto;

import com.xworkz.dto.data.MallDto;

public class MallDtoDisplay {

	public static void main(String[] args) {
		MallDto m = new MallDto();
		m.setName("Urban Oasis");
		m.setOwnerName("Hanamant");

		MallDto m1 = new MallDto();
		m1.setName("Urban Oasis");
		m1.setOwnerName("Hanamant");

		if (m.hashCode() == m1.hashCode()) {
			System.out.println(m.equals(m1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
