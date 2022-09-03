package com.xworkz.dto;

import com.xworkz.dto.data.InstituteDto;

public class InstituteDtoDisplay {

	public static void main(String[] args) {
		InstituteDto i = new InstituteDto();
		i.setName("xyz");
		i.setOwner("Hanamant");

		InstituteDto i1 = new InstituteDto();
		i1.setName("Urban Oasis");
		i1.setOwner("Hanamant");

		if (i.hashCode() == i1.hashCode()) {
			System.out.println(i.equals(i1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
