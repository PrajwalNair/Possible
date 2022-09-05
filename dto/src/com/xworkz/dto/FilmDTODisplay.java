package com.xworkz.dto;

import com.xworkz.dto.data.FilmDTO;

public class FilmDTODisplay {

	public static void main(String[] args) {
		FilmDTO f = new FilmDTO();
		f.setName("Premam");
		f.setLanguage("Malayalam");

		FilmDTO f1 = new FilmDTO();
		f1.setName("Premam");
		f1.setLanguage("Malayalam");

		if (f.hashCode() == f1.hashCode()) {
			System.out.println(f.equals(f1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
