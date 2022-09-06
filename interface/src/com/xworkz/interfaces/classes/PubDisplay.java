package com.xworkz.interfaces.classes;

import com.xworkz.interfaces.CustomerPubRule;
import com.xworkz.interfaces.DownTownPub;
import com.xworkz.interfaces.PubRules;

public class PubDisplay {

	public static void main(String[] args) {
		PubRules pubRule = new CustomerPubRule();

		DownTownPub down = new DownTownPub(pubRule);
		down.checkRules();

	}

}
