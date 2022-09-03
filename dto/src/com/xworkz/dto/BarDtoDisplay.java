package com.xworkz.dto;

import com.xworkz.dto.data.BarDto;

public class BarDtoDisplay {

	public static void main(String[] args) {
		BarDto dto = new BarDto();
		dto.setDoorColor("Grey");
		dto.setBeerPrice(1000.00D);

		BarDto dto1 = new BarDto();
		dto1.setDoorColor("Yellow");
		dto1.setBeerPrice(2000.00D);

		System.out.println(dto.hashCode());
		System.out.println(dto.hashCode());

		System.out.println(System.identityHashCode(dto));
		System.out.println(System.identityHashCode(dto1));

		if (dto.hashCode() == dto.hashCode()) {
			Boolean b = dto.equals(dto1);
			System.out.println(b);
		} else {
			System.out.println("Hashcode are not equal");
		}

	}

}
