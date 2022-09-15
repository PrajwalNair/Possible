package com.xworkz.primeminister.dao;

import javax.naming.InvalidNameException;

import com.xworkz.primeminister.exception.InvalidCheckIndexException;

public interface PrimeMinisterDAO {
	boolean saveName(String name)throws InvalidCheckIndexException;

	boolean checkName(String name) ;

}
