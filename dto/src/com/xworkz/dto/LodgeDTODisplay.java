package com.xworkz.dto;

import com.xworkz.dto.data.LodgeDTO;

public class LodgeDTODisplay {

	public static void main(String[] args) {
		LodgeDTO l = new LodgeDTO();
		l.setName("Indigo");
		l.setType("Business");
		l.setOwner("Vishal");
		l.setAvgCollectionPerDay(3500.00);
		l.setAvgCollectionPerWeek(30000);
		l.setAvgCollectionPerMonth(60000);

		LodgeDTO l1 = new LodgeDTO();
		l1.setName("Indigo");
		l1.setType("Business");
		l1.setOwner("Vishal");
		l1.setAvgCollectionPerDay(3500.00);
		l1.setAvgCollectionPerWeek(30000);
		l1.setAvgCollectionPerMonth(60000);

		if (l.hashCode() == l1.hashCode()) {
			System.out.println(l.equals(l1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
