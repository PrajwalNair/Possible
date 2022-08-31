package com.xworkz.cricketdto;

import com.xworkz.cricketdto.parent.CricketDto;

public class CricketDtoDisplay {

	public static void main(String[] args) {
		CricketDto c = new CricketDto("India", "ODI", "Rohit Sharma", 11, "Wankhade", 'M', 5, 4, 2, 50);
		System.out.println(c.getCountry());
		System.out.println(c.getType());
		System.out.println(c.getNameOfCaptain());
		System.out.println(c.getNoOfPlayers());
		System.out.println(c.getNameOfStadium());
		System.out.println(c.getGender());
		System.out.println(c.getNoOfBatsmans());
		System.out.println(c.getNoOfBowlers());
		System.out.println(c.getNoOfAllrounders());
		System.out.println(c.getNoOfOvers());
		System.out.println(c);

	}

}
