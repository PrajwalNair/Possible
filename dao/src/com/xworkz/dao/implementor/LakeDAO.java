package com.xworkz.dao.implementor;

public interface LakeDAO {
	boolean save(String lakeName);

	void printAll();

	void delete(int index);

	void update(int index, String lakeName);

}
