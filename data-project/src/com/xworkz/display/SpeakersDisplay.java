package com.xworkz.display;

import com.xworkz.dao.SpeakersDAO;
import com.xworkz.dao.impl.SpeakersDAOImpl;
import com.xworkz.dto.SpeakersDTO;

public class SpeakersDisplay {

	public static void main(String[] args) {
		SpeakersDTO dto = new SpeakersDTO();
		dto.setName("Boat Stone 350");
		dto.setBrand("Boat");
		dto.setWireless(true);
		dto.setBluetooth(true);
		dto.setPowerOutput(10.00);
		dto.setBatteryLife(12);
		dto.setWirelessRange(10);
		dto.setBluetoothVersion(5);
		dto.setModelNo("Stone 350");
		dto.setColor("black");
		dto.setPrice(1699);
		dto.setRating(4.5);
		dto.setWidth(9.00);
		dto.setHeight(9.3);

		SpeakersDAO dao = new SpeakersDAOImpl();
		dao.create(dto);

	}

}
