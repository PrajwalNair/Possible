package com.xworkz.dto;

import com.xworkz.dto.data.ConstructionDTO;

public class ConstructionDTODisplay {

	public static void main(String[] args) {
		ConstructionDTO co = new ConstructionDTO();
		co.setCement(true);
		co.setSand(true);
		co.setAdmixtures(true);
		co.setWater(true);
		co.setAggregate(true);
		co.setSteel(true);

		ConstructionDTO co1 = new ConstructionDTO();
		co1.setCement(true);
		co1.setSand(true);
		co1.setAdmixtures(true);
		co1.setWater(true);
		co1.setAggregate(true);
		co1.setSteel(true);

		if (co.hashCode() == co1.hashCode()) {
			System.out.println(co.equals(co1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
