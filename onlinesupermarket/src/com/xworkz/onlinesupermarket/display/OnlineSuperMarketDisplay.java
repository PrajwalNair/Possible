package com.xworkz.onlinesupermarket.display;

import com.xworkz.onlinesupermarket.subclass.OnlineSuperMarket;
import com.xworkz.onlinesupermarket.subclass.SuperMarket;
import com.xworkz.onlinesupermarket.superclass.Market;

public class OnlineSuperMarketDisplay {

	public static void main(String[] args) {
		Market market = new Market(null, null, null);
		Market market1 = new SuperMarket(0, 0, false);
		Market market2 = new OnlineSuperMarket(true, "Dunzo", 4.95);

		Market m = market1;
		Market n = market2;

		OnlineSuperMarket c = (OnlineSuperMarket) market2;
		c.torisu();

		SuperMarket c1 = (OnlineSuperMarket) market2;
		if (market1 instanceof OnlineSuperMarket) {
			System.out.println("ref of a parent class");
		} else {
			System.out.println("not a ref of parent class");
		}

	}

}
