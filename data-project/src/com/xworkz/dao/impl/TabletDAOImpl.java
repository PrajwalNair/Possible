package com.xworkz.dao.impl;

import com.xworkz.dao.TabletDAO;
import com.xworkz.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO {
	private TabletDTO[] tab = new TabletDTO[14];
	private int index;

	@Override
	public Boolean create(TabletDTO dto) {
		this.tab[index] = dto;
		System.out.println("Tablet is saved " + dto + " into index " + this.tab[index]);
		index++;
		return false;
	}

}
