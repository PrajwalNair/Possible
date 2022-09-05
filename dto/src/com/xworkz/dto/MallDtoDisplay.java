package com.xworkz.dto;

import com.xworkz.dto.data.MallDTO;

public class MallDtoDisplay {

	public static void main(String[] args) {
		MallDTO m = new MallDTO();
		m.setName("Urban Oasis");
		m.setOwnerName("Hanamant");

		MallDTO m1 = new MallDTO();
		m1.setName("Urban Oasis");
		m1.setOwnerName("Hanamant");

		if (m.hashCode() == m1.hashCode()) {
			System.out.println(m.equals(m1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
