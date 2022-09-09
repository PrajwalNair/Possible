package com.xworkz.dao;

public interface LakeDAO {
	boolean save(String lakeName);

	void printAll();

	boolean delete(int index);

	boolean update(int index, String lakeName);

	boolean updateByName(String name, String newName);

	boolean delete(String name);

}
