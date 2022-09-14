package com.xworkz.tourist.service;

import com.xworkz.tourist.customexception.TouristPlaceValidateException;

public interface TouristService {
	boolean checkAndValidatePlace(String place) throws TouristPlaceValidateException;

}
