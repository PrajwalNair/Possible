package com.xworkz.pen.dao;

public class PenDAOImpl implements PenDAO {
	private String[] pen = new String[4];
	private int index;

	@Override
	public boolean create(String name) {
		this.pen[index] = name;
		System.out.println("name saved " + name + "index is " + this.index);
		index++;
		return true;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.pen) {
			if (ref != null && ref.equals(name)) {
				System.out.println("it is not a duplicate name");
				return true;
			} else {
				System.out.println("it is a duplicate name");
			}
		}

		return false;
	}

}
