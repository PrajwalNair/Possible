package com.xworkz.dto;

import com.xworkz.dto.data.PgDto;

public class PgDtoDisplay {
	public static void main(String[] args) {
		PgDto p = new PgDto();
		p.setName("Krishna pg");
		p.setOwnerName("Sri ramulu");

		PgDto p1 = new PgDto();
		p1.setName("Krishna pg");
		p1.setOwnerName("Sri ramulu");

		if (p.hashCode() == p1.hashCode()) {
			System.out.println(p.equals(p1));
		} else {
			System.out.println("it is not equal");
		}

	}

}
