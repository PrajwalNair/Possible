package com.xworkz.dto;

import com.xworkz.dto.data.FilmDto;

public class FilmDtoDisplay {

	public static void main(String[] args) {
		FilmDto f = new FilmDto();
		f.setName("Premam");
		f.setLanguage("Malayalam");

		FilmDto f1 = new FilmDto();
		f1.setName("Premam");
		f1.setLanguage("Malayalam");

		if (f.hashCode() == f1.hashCode()) {
			System.out.println(f.equals(f1));
		} else {
			System.err.println("it is not equal");
		}

	}

}
