package com.xworkz.tourist.dao;

public class TouristDAOImpl implements TouristDAO {
	private String[] places = new String[10];
	private int index;

	@Override
	public boolean createPlace(String place) {
		this.places[index] = place;
		System.out.println("placee saved  " + place + "  index  " + this.index);
		index++;
		return true;
	}

	@Override
	public boolean checkName(String place) {
		for (String ref : this.places)
			if (ref != null && ref.equals(place)) {
				return true;
			}

		return false;
	}

}
