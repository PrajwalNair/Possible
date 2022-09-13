package com.xworkz.display;

import com.xworkz.dao.TabletDAO;
import com.xworkz.dao.impl.TabletDAOImpl;
import com.xworkz.dto.TabletDTO;

public class TabletDisplay {

	public static void main(String[] args) {
		TabletDTO dto = new TabletDTO();
		dto.setName("Crocin");
		dto.setType("Paracetamol");
		dto.setPrice(5.5D);
		dto.setColor("White");
		dto.setShape("Circle");
		dto.setWarning(true);
		dto.setPainKiller(true);
		dto.setFever(true);
		String[] effect = { "itching", "liver damage" };
		dto.setSideEffects(effect);
		dto.setDoseagePerDay(3);
		dto.setChildren(false);
		dto.setWrapperColor("blue");
		dto.setNoOfTabletsPerStrip(10);
		dto.setCold(true);
		dto.setKuff(false);

		TabletDAO dao = new TabletDAOImpl();
		dao.create(dto);

	}

}
