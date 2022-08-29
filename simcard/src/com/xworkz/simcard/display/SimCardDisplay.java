package com.xworkz.simcard.display;

import com.xworkz.simcard.child.Postpaid;
import com.xworkz.simcard.child.Prepaid;
import com.xworkz.simcard.parent.SimCard;

public class SimCardDisplay {

	public static void main(String[] args) {
		SimCard sim = new Prepaid();
		sim.calling();
		sim.network();
		sim.message();
		sim.simService();

		SimCard sim1 = new Postpaid();
		sim1.calling();
		sim1.network();
		sim1.message();
		sim1.simService();

	}

}
