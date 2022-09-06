package com.xworkz.interfaces.classes;

import com.xworkz.interfaces.HRRules;
import com.xworkz.interfaces.ManagerRules;
import com.xworkz.interfaces.SecurityRules;

public class ITRuleFollowerDisplay {

	public static void main(String[] args) {
		Object o = new ITRuleFollower();

		HRRules hr = new ITRuleFollower();
		hr.applyLeave();
		hr.harrasment();

		SecurityRules s = new ITRuleFollower();
		s.parkingApproval();
		s.swipeCard();

		ManagerRules m = new ITRuleFollower();
		m.informLeave();
		m.wfh();

		ITRuleFollower i = new ITRuleFollower();
		i.informLeave();
		i.parkingApproval();

	}

}
