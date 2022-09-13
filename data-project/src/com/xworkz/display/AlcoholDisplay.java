package com.xworkz.display;

import java.time.LocalDate;

import com.xworkz.dao.AlcoholDAO;
import com.xworkz.dao.impl.AlcoholDAOImpl;
import com.xworkz.dto.AlcoholDTO;

public class AlcoholDisplay {

	public static void main(String[] args) {
		AlcoholDTO dto = new AlcoholDTO();
		dto.setBrand("Carlsberg");
		dto.setName("Elephant");
		dto.setType("Beer");
		dto.setMaterialOfBottle("glass");
		dto.setPrice(198D);
		dto.setFlavour(true);
		dto.setDiameterOfBottle(5D);
		dto.setQuantity(650D);
		dto.setExpiry(LocalDate.of(2023, 2, 2));
		dto.setSince(1847);
		dto.setBar("MRP");
		dto.setAlcoholPercentage(14D);
		dto.setRadiusOfBottle(2.5);
		dto.setPrecaution(true);
		dto.setInjurious(true);

		AlcoholDAO dao = new AlcoholDAOImpl();

		dao.create(dto);

	}

}
