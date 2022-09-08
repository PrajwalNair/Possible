package com.xworkz.dao;

public class LakeDAOImplementor implements LakeDAO {

	private String[] lakeNames = new String[10];

	@Override
	public boolean save(String lakeName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if (lakeNames[i] == null) {
				lakeNames[i] = lakeName;
				System.out.println("lakes");
				return true;
			}
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
	public void delete(int index) {
		lakeNames[index] = null;

	}

	@Override
	public void update(int index, String lakeName) {
		lakeNames[index] = lakeName;

	}

}
