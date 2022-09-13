package com.xworkz.dao.impl;

import com.xworkz.dao.SpeakersDAO;
import com.xworkz.dto.SpeakersDTO;

public class SpeakersDAOImpl implements SpeakersDAO {
	private SpeakersDTO[] sp = new SpeakersDTO[14];
	private int index;

	@Override
	public Boolean create(SpeakersDTO dto) {
		this.sp[index] = dto;
		System.out.println("Speakers saved " + dto + " index is " + this.sp[index]);
		return true;
	}

}
