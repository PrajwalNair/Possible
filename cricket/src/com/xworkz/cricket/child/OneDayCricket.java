package com.xworkz.cricket.child;

import com.xworkz.cricket.parent.Cricket;

public class OneDayCricket extends Cricket {
	public String bestBowler;
	public String bestBatsman;

	public void setBestBowler(String bestBowler) {
		this.bestBowler = bestBowler;
		System.out.println("Best bowler in ODI is " + bestBowler + " ------ (ODI class)");
	}

	public void setBestBatsman(String bestBatsman) {
		this.bestBatsman = bestBatsman;
		System.out.println("Best batsman in ODI is " + bestBatsman + " ------ (ODI class)");
	}

	public String manOfTheSeries() {
		System.out.println("Man of the series in ODI" + "------ (ODI class)");
		return "Shubman Gill";
	}

	@Override
	public double presentation() {
		double pr = super.presentation();
		System.out.println(pr + " ------ (Using super)");
		System.out.println("Presentation in ODI" + " ------ (ODI class)");
		return 0.1;
	}

	@Override
	public boolean entertainment() {
		System.out.println("entertainment in ODI" + "------ (ODI class)");
		return true;
	}

}
