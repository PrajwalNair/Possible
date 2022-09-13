package com.xworkz.dao.impl;

import com.xworkz.dao.MoviesDAO;
import com.xworkz.dto.MoviesDTO;

public class MoviesDAOImpl implements MoviesDAO {
	private MoviesDTO[] movies = new MoviesDTO[14];
	private int index;

	@Override
	public Boolean create(MoviesDTO dto) {
		this.movies[index] = dto;
		System.out.println("Movie saved " + dto + " index is " + this.movies[index]);
		index++;
		return true;
	}

}
