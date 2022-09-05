package com.xworkz.dto;

import com.xworkz.dto.data.InstituteDTO;

public class InstituteDTODisplay {

	public static void main(String[] args) {
		InstituteDTO i = new InstituteDTO();
		i.setName("xyz");
		i.setOwner("Hanamant");

		InstituteDTO i1 = new InstituteDTO();
		i1.setName("Urban Oasis");
		i1.setOwner("Hanamant");

		if (i.hashCode() == i1.hashCode()) {
			System.out.println(i.equals(i1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
