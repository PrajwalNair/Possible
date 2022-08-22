package com.xworkz.cricket.display;

import com.xworkz.cricket.child.OneDayCricket;
import com.xworkz.cricket.child.T20Cricket;
import com.xworkz.cricket.child.TestCricket;
import com.xworkz.cricket.parent.Cricket;

public class CricketDisplay {

	public static void main(String[] args) {
		OneDayCricket cr = new OneDayCricket();
		boolean e = cr.entertainment();
		System.out.println(e + "===");
		cr.setCaptain("MS Dhoni");
		cr.setCountry("India");
		cr.setGender('M');
		cr.presentation();
		cr.setBestBowler("Jasprith bumrah");
		cr.setBestBatsman("Rohit Sharma");
		System.out.println(cr.manOfTheSeries());

		TestCricket c = new TestCricket();
		double p = c.presentation();
		System.out.println(p);
		c.setGroundType("");

		T20Cricket cri = new T20Cricket();
		System.out.println(cri.entertainment());
		System.out.println(cri.manOfTheMatch());

	}

}
