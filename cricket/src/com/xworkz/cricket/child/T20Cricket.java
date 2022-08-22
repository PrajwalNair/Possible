package com.xworkz.cricket.child;

import com.xworkz.cricket.parent.Cricket;

public class T20Cricket extends Cricket {

	public String manOfTheMatch() {
		System.out.println("Man of the match in T20 Cricket" + " ------ (T20Cricket class)");
		return "Rishab Pant";
	}

	@Override
	public boolean entertainment() {
		System.out.println("Entertainment from T20 Cricket" + " ------ (T20Cricket class)");
		return true;
	}

}
