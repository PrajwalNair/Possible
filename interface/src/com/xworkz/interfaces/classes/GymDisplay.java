package com.xworkz.interfaces.classes;

import com.xworkz.interfaces.GymRule;
import com.xworkz.interfaces.GymStaff;
import com.xworkz.interfaces.PrajwalRules;

public class GymDisplay {

	public static void main(String[] args) {
		GymRule gymRule = new PrajwalRules();

		GymStaff g = new GymStaff(gymRule);
		g.checkRules();

	}

}
