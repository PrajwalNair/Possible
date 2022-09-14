package com.xworkz.casino.dao;

public class CasinoDAOImpl implements CasinoDAO {

	private String[] datastore = new String[4];

	private int index;

	@Override
	public boolean save(String name) {
		this.datastore[index] = name;
		System.out.println("data stored " + name + " index" + this.index);
		index++;
		return true;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.datastore)
			if (ref != null && ref.equals(name)) {
				System.out.println("it is valid");
				return true;
			}
		return false;
	}

}
