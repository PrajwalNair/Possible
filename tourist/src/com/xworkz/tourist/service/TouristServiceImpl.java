package com.xworkz.tourist.service;

import com.xworkz.tourist.customexception.TouristPlaceValidateException;
import com.xworkz.tourist.dao.TouristDAO;

public class TouristServiceImpl implements TouristService {
	private TouristDAO dao;

	public TouristServiceImpl(TouristDAO dao) {
		this.dao = dao;

	}

	@Override
	public boolean checkAndValidatePlace(String place) throws TouristPlaceValidateException {
		if (place != null && place.length() > 0 && place.length() < 15) {
			if (!this.dao.checkName(place)) {
				System.out.println("check method is running :" + place);
				return this.dao.createPlace(place);

			} else {
				System.err.println("place is not valid");
				throw new TouristPlaceValidateException("duplicate");
			}

		} else {
			System.err.println("place is not correct");
			throw new TouristPlaceValidateException("invalid");
		}

	}

}
