package com.xworkz.dto;

import com.xworkz.dto.data.NatureDTO;

public class NatureDTODisplay {

	public static void main(String[] args) {
		NatureDTO n = new NatureDTO();
		n.setRivers(true);
		n.setLakes(true);
		n.setSoil(true);
		n.setOcean(true);
		n.setTrees(true);
		n.setPlants(true);

		NatureDTO n1 = new NatureDTO();
		n1.setRivers(true);
		n1.setLakes(true);
		n1.setSoil(true);
		n1.setOcean(true);
		n1.setTrees(true);
		n1.setPlants(true);

		if (n.hashCode() == n1.hashCode()) {
			System.out.println(n.equals(n1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
