package com.xworkz.dto;

import com.xworkz.dto.data.TrainDTO;

public class TrainDTODisplay {

	public static void main(String[] args) {
		TrainDTO t = new TrainDTO();
		t.setBrand("Indian Railway");
		t.setType("passenger");
		t.setTrainNo("20809");
		t.setWayOfTransport("land");
		t.setNoOfPassengers(1000);
		t.setNoOfWheels(80);
		t.setSource("Hubli");
		t.setDestination("Bangalore");
		t.setNoOfMirrors(20);
		t.setWidthOfMirror(5);
		t.setHeightOfMirror(5);
		t.setThicknessOfMirror(8);
		t.setNoOfCoaches(10);
		t.setSleeperCoach(true);
		t.setNoOfSeats(1200);
		t.setWidthOfTrain(2.4);

		TrainDTO t1 = new TrainDTO();
		t1.setBrand("Indian Railway");
		t1.setType("passenger");
		t1.setTrainNo("20809");
		t1.setWayOfTransport("land");
		t1.setNoOfPassengers(1000);
		t1.setNoOfWheels(80);
		t1.setSource("Hubli");
		t1.setDestination("Bangalore");
		t1.setNoOfMirrors(20);
		t1.setWidthOfMirror(5);
		t1.setHeightOfMirror(5);
		t1.setThicknessOfMirror(8);
		t1.setNoOfCoaches(10);
		t1.setSleeperCoach(true);
		t1.setNoOfSeats(1200);
		t1.setWidthOfTrain(2.4);

		if (t.hashCode() == t1.hashCode()) {
			System.out.println(t.equals(t1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
