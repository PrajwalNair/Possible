package com.xworkz.dao;

public class LakeDAOImplementor implements LakeDAO {

	private String[] lakeNames = new String[10];
	private int index;

	@Override
	public boolean save(String lakeName) {

		if (index < lakeNames.length) {
			this.lakeNames[index] = lakeName;
			index++;
			System.out.println(lakeName);

		}
		return false;
	}

	@Override
	public void printAll() {
		for (int i = 0; i < lakeNames.length; i++) {

			System.out.println(lakeNames[i]);
		}

	}

	@Override
	public boolean delete(int index) {
		for (int i = 0; i < lakeNames.length; i++) {
			lakeNames[i] = null;
		}
		return true;
	}

	@Override
	public boolean update(int index, String lakeName) {
		lakeNames[index] = lakeName;
		return true;
	}

	@Override
	public boolean updateByName(String name, String newName) {
		for (int i = 0; i > lakeNames.length; i++) {
			if (lakeNames[i] == name) {
				name = newName;
				return true;

			}

		}
		return false;
	}

	@Override
	public boolean delete(String name) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == name) {
				name = null;
			}
		}

		return false;
	}

}
