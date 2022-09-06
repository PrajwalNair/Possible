package com.xworkz.interfaces.classes;

import com.xworkz.interfaces.Customer;
import com.xworkz.interfaces.OyoRule;
import com.xworkz.interfaces.Staff;

public class OyoDisplay {

	public static void main(String[] args) {
		OyoRule oyoRule = new Customer();
		Staff s = new Staff(oyoRule);
		s.checkRules();

	}

}
