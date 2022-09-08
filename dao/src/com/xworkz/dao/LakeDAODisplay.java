package com.xworkz.dao;

import com.xworkz.dao.implementor.LakeDAOImplementor;

public class LakeDAODisplay {

	public static void main(String[] args) {
		LakeDAOImplementor dao = new LakeDAOImplementor();
		dao.save("BTM Lake");
		dao.save("Unakal Lake");
		dao.save("Agara Lake");
		dao.save("Ulsoor Lake");
		dao.printAll();
		System.out.println("--------------");
		dao.delete(0);
		System.out.println("--------------");
		dao.printAll();
		System.out.println("--------------");
		dao.update(2, "Lal Bhagh lake");
		dao.printAll();

	}

}
