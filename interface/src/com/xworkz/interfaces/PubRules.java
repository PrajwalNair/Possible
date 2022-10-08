package com.xworkz.interfaces;

public interface PubRules {
	boolean dressCodefollowed();

	int age();

	boolean validProof();

	default int age (int age) {
		return 0;
	}
	
	static void print () {
		
	}
	
}
