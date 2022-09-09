package com.xworkz.dao.display;

import com.xworkz.dao.LakeDAOImplementor;

public class LakeDAODisplay {

	public static void main(String[] args) {
		LakeDAOImplementor dao = new LakeDAOImplementor();
		dao.save("BTM Lake");
		dao.save("Unakal Lake");
		dao.save("Agara Lake");
		dao.save("Ulsoor Lake");

		dao.printAll();
		dao.updateByName("Unakal Lake", "Nirsagar");
		dao.printAll();
		dao.delete("BTM Lake");
		dao.printAll();

	}

}
