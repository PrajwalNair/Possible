package com.xworkz.interfaces.classes;

import com.xworkz.interfaces.HRRules;
import com.xworkz.interfaces.ManagerRules;
import com.xworkz.interfaces.SecurityRules;

public class ITRuleFollower implements HRRules, SecurityRules, ManagerRules {
	@Override
	public boolean applyLeave() {
		System.out.println("Applying for a leave");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("Case not found");
		return false;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("Swipe the card");
		return false;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("parking approved");
		return false;
	}

	@Override
	public boolean informLeave() {
		System.out.println("inform leave");
		return false;
	}

	@Override
	public boolean wfh() {
		System.out.println("work from home approved");
		return false;
	}

}
