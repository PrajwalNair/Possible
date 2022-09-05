package com.xworkz.dto;

import com.xworkz.dto.data.HospitalDTO;

public class HospitalDTODisplay {

	public static void main(String[] args) {
		HospitalDTO h = new HospitalDTO();
		h.setName("SDM");
		h.setType("Multispeciality");

		HospitalDTO h1 = new HospitalDTO();
		h1.setName("SDM");
		h1.setType("Multispeciality");

		if (h.hashCode() == h1.hashCode()) {
			System.out.println(h.equals(h1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
