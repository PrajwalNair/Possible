package com.xworkz.dto;

import com.xworkz.dto.data.TruckDTO;

public class TruckDTODisplay {

	public static void main(String[] args) {
		TruckDTO n = new TruckDTO();
		n.setBrand("Mahindra");
		n.setType("Goods");
		n.setNoPlate("KA25M6020");
		n.setTyreBrand("MRF");
		n.setWayOfTransport("Land");
		n.setNoOfWheels(6);

		TruckDTO n1 = new TruckDTO();
		n1.setBrand("Mahindra");
		n1.setType("Goods");
		n1.setNoPlate("KA25M6020");
		n1.setTyreBrand("MRF");
		n1.setWayOfTransport("Land");
		n1.setNoOfWheels(6);

		if (n.hashCode() == n1.hashCode()) {
			System.out.println(n.equals(n1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
