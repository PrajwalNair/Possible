package com.xworkz.display;

import com.xworkz.dao.MoviesDAO;
import com.xworkz.dao.impl.MoviesDAOImpl;
import com.xworkz.dto.MoviesDTO;

public class MoviesDisplay {

	public static void main(String[] args) {
		MoviesDTO dto = new MoviesDTO();
		dto.setName("Cuttputlli");
		dto.setType("psychological crime thriller");
		dto.setDirector("Ranjit M Tewari");
		dto.setLanguage("Hindi");
		dto.setRating(4.5);
		dto.setBudget(109D);
		dto.setHero("Akshay Kumar");
		dto.setHeroine("Rakulpreet");
		dto.setNoOfSongs(4);
		String[] producers = { "Vashu Bhagnani", "Jackky Bhagnani", "Deepshikha Deshmukh" };
		dto.setProducers(producers);
		dto.setCinematography("Rajeev Ravi");
		dto.setScreenPlayBy("Aseem Arora");
		dto.setStoryBy("Ram Kumar");
		dto.setEditedBy("Chandan arora");
		dto.setCountry("India");

		MoviesDAO dao = new MoviesDAOImpl();
		dao.create(dto);

	}

}
