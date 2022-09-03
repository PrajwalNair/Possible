package com.xworkz.dto;

import com.xworkz.dto.data.HospitalDto;

public class HospitalDtoDisplay {

	public static void main(String[] args) {
		HospitalDto h = new HospitalDto();
		h.setName("SDM");
		h.setType("Multispeciality");

		HospitalDto h1 = new HospitalDto();
		h1.setName("SDM");
		h1.setType("Multispeciality");

		if (h.hashCode() == h1.hashCode()) {
			System.out.println(h.equals(h1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
