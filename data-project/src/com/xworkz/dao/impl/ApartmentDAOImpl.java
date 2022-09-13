package com.xworkz.dao.impl;

import com.xworkz.dao.ApartmentDAO;
import com.xworkz.dto.ApartmentDTO;

public class ApartmentDAOImpl implements ApartmentDAO {
	private ApartmentDTO[] ap = new ApartmentDTO[14];
	private int index;

	@Override
	public Boolean create(ApartmentDTO dto) {
		this.ap[index] = dto;
		System.out.println("apartment is saved " + dto + " index is " + this.ap[index]);
		index++;
		return true;
	}

}
