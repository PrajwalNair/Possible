package com.xworkz.dto.data;

import java.io.Serializable;

public class NatureDTO implements Serializable {
	private boolean humanBeings;
	private int noOfHumanBeings;
	private boolean vehicles;
	private boolean twoWheelers;
	private boolean fourWheelers;
	private int noOfTwoWheelers;
	private int noOfFourWheelers;
	private double typesOfTwoWheelers;
	private double typesOfFourWheelers;
	private boolean animals;

	private int typesOfAnimals;
	private int noOfVehicles;
	private boolean rivers;
	private boolean lakes;
	private boolean cannels;
	private boolean ocean;
	private boolean soil;
	private boolean water;
	private boolean trees;
	private boolean plants;

	private boolean birds;
	private boolean tiger;
	private boolean lion;
	private boolean dog;
	private boolean cat;
	private boolean monkey;
	private boolean friuts;
	private boolean vegetables;
	private boolean cheetha;
	private boolean wood;

	private boolean truck;
	private boolean auto;
	private boolean cycle;
	private boolean bike;
	private boolean land;
	private boolean sky;
	private boolean lizard;
	private boolean clouds;
	private boolean rain;
	private boolean summer;

	private boolean winter;
	private boolean rainy;
	private boolean sand;
	private boolean cement;
	private boolean house;

	public NatureDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		System.out.println("The hashcode");
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof NatureDTO) {
				NatureDTO c = (NatureDTO) obj;
				if (c.rivers == (this.rivers) && c.soil == (this.soil) && c.lakes == (this.lakes)
						&& c.ocean == (this.ocean) && c.trees == (this.trees) && c.plants == (this.plants)) {
					System.out.println(this.rivers + " & " + this.soil + " & " + this.lakes + " & " + this.ocean + " & "
							+ this.trees + " & " + this.plants);
					return true;
				} else {
					System.err.println("it is not equal");
				}
			} else {
				System.err.println("it is not instanceof");
			}
		}
		return super.equals(obj);
	}

	public boolean isHumanBeings() {
		return humanBeings;
	}

	public void setHumanBeings(boolean humanBeings) {
		this.humanBeings = humanBeings;
	}

	public int getNoOfHumanBeings() {
		return noOfHumanBeings;
	}

	public void setNoOfHumanBeings(int noOfHumanBeings) {
		this.noOfHumanBeings = noOfHumanBeings;
	}

	public boolean isVehicles() {
		return vehicles;
	}

	public void setVehicles(boolean vehicles) {
		this.vehicles = vehicles;
	}

	public boolean isTwoWheelers() {
		return twoWheelers;
	}

	public void setTwoWheelers(boolean twoWheelers) {
		this.twoWheelers = twoWheelers;
	}

	public boolean isFourWheelers() {
		return fourWheelers;
	}

	public void setFourWheelers(boolean fourWheelers) {
		this.fourWheelers = fourWheelers;
	}

	public int getNoOfTwoWheelers() {
		return noOfTwoWheelers;
	}

	public void setNoOfTwoWheelers(int noOfTwoWheelers) {
		this.noOfTwoWheelers = noOfTwoWheelers;
	}

	public int getNoOfFourWheelers() {
		return noOfFourWheelers;
	}

	public void setNoOfFourWheelers(int noOfFourWheelers) {
		this.noOfFourWheelers = noOfFourWheelers;
	}

	public double getTypesOfTwoWheelers() {
		return typesOfTwoWheelers;
	}

	public void setTypesOfTwoWheelers(double typesOfTwoWheelers) {
		this.typesOfTwoWheelers = typesOfTwoWheelers;
	}

	public double getTypesOfFourWheelers() {
		return typesOfFourWheelers;
	}

	public void setTypesOfFourWheelers(double typesOfFourWheelers) {
		this.typesOfFourWheelers = typesOfFourWheelers;
	}

	public boolean isAnimals() {
		return animals;
	}

	public void setAnimals(boolean animals) {
		this.animals = animals;
	}

	public int getTypesOfAnimals() {
		return typesOfAnimals;
	}

	public void setTypesOfAnimals(int typesOfAnimals) {
		this.typesOfAnimals = typesOfAnimals;
	}

	public int getNoOfVehicles() {
		return noOfVehicles;
	}

	public void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}

	public boolean isRivers() {
		return rivers;
	}

	public void setRivers(boolean rivers) {
		this.rivers = rivers;
	}

	public boolean isLakes() {
		return lakes;
	}

	public void setLakes(boolean lakes) {
		this.lakes = lakes;
	}

	public boolean isCannels() {
		return cannels;
	}

	public void setCannels(boolean cannels) {
		this.cannels = cannels;
	}

	public boolean isOcean() {
		return ocean;
	}

	public void setOcean(boolean ocean) {
		this.ocean = ocean;
	}

	public boolean isSoil() {
		return soil;
	}

	public void setSoil(boolean soil) {
		this.soil = soil;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isTrees() {
		return trees;
	}

	public void setTrees(boolean trees) {
		this.trees = trees;
	}

	public boolean isPlants() {
		return plants;
	}

	public void setPlants(boolean plants) {
		this.plants = plants;
	}

	public boolean isBirds() {
		return birds;
	}

	public void setBirds(boolean birds) {
		this.birds = birds;
	}

	public boolean isTiger() {
		return tiger;
	}

	public void setTiger(boolean tiger) {
		this.tiger = tiger;
	}

	public boolean isLion() {
		return lion;
	}

	public void setLion(boolean lion) {
		this.lion = lion;
	}

	public boolean isDog() {
		return dog;
	}

	public void setDog(boolean dog) {
		this.dog = dog;
	}

	public boolean isCat() {
		return cat;
	}

	public void setCat(boolean cat) {
		this.cat = cat;
	}

	public boolean isMonkey() {
		return monkey;
	}

	public void setMonkey(boolean monkey) {
		this.monkey = monkey;
	}

	public boolean isFriuts() {
		return friuts;
	}

	public void setFriuts(boolean friuts) {
		this.friuts = friuts;
	}

	public boolean isVegetables() {
		return vegetables;
	}

	public void setVegetables(boolean vegetables) {
		this.vegetables = vegetables;
	}

	public boolean isCheetha() {
		return cheetha;
	}

	public void setCheetha(boolean cheetha) {
		this.cheetha = cheetha;
	}

	public boolean isWood() {
		return wood;
	}

	public void setWood(boolean wood) {
		this.wood = wood;
	}

	public boolean isTruck() {
		return truck;
	}

	public void setTruck(boolean truck) {
		this.truck = truck;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}

	public boolean isCycle() {
		return cycle;
	}

	public void setCycle(boolean cycle) {
		this.cycle = cycle;
	}

	public boolean isBike() {
		return bike;
	}

	public void setBike(boolean bike) {
		this.bike = bike;
	}

	public boolean isLand() {
		return land;
	}

	public void setLand(boolean land) {
		this.land = land;
	}

	public boolean isSky() {
		return sky;
	}

	public void setSky(boolean sky) {
		this.sky = sky;
	}

	public boolean isLizard() {
		return lizard;
	}

	public void setLizard(boolean lizard) {
		this.lizard = lizard;
	}

	public boolean isClouds() {
		return clouds;
	}

	public void setClouds(boolean clouds) {
		this.clouds = clouds;
	}

	public boolean isRain() {
		return rain;
	}

	public void setRain(boolean rain) {
		this.rain = rain;
	}

	public boolean isSummer() {
		return summer;
	}

	public void setSummer(boolean summer) {
		this.summer = summer;
	}

	public boolean isWinter() {
		return winter;
	}

	public void setWinter(boolean winter) {
		this.winter = winter;
	}

	public boolean isRainy() {
		return rainy;
	}

	public void setRainy(boolean rainy) {
		this.rainy = rainy;
	}

	public boolean isSand() {
		return sand;
	}

	public void setSand(boolean sand) {
		this.sand = sand;
	}

	public boolean isCement() {
		return cement;
	}

	public void setCement(boolean cement) {
		this.cement = cement;
	}

	public boolean isHouse() {
		return house;
	}

	public void setHouse(boolean house) {
		this.house = house;
	}

}
