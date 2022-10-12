package com.xworkz.garage.repository;

import com.xworkz.garage.dto.GarageDTO;

public class GarageRepositoryImpl implements GarageRepository {
	@Override
	public boolean save(GarageDTO dto) {
		System.out.println("Data is saved"+dto);
		return false;
	}

}
