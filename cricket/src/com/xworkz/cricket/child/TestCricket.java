package com.xworkz.cricket.child;

import com.xworkz.cricket.parent.Cricket;

public class TestCricket extends Cricket {
	public String groundType;

	public void setGroundType(String groundType) {
		this.groundType = groundType;
		System.out.println("Type of ground in Test cricket is " +groundType+ " ------ (TestCricket class)");
	}

	@Override
	public double presentation() {
		System.out.println("Presentation from Test cricket" + " ------ (TestCricket class)");
		return 1.25;
	}

}
