package com.xworkz.dto;

import com.xworkz.dto.data.PgDTO;

public class PgDTODisplay {
	public static void main(String[] args) {
		PgDTO p = new PgDTO();
		p.setName("Krishna pg");
		p.setOwnerName("Sri ramulu");

		PgDTO p1 = new PgDTO();
		p1.setName("Krishna pg");
		p1.setOwnerName("Sri ramulu");

		if (p.hashCode() == p1.hashCode()) {
			System.out.println(p.equals(p1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
