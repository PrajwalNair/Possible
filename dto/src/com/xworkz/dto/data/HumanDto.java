package com.xworkz.dto.data;

import java.io.Serializable;

public class HumanDto implements Serializable {
	private String name;
	private String gender;
	private String age;
	private boolean feelings;
	private String color;
	private String hairColor;
	private String hairType;
	private String skinType;
	private int noOfEars;
	private int noOfNose;

	private boolean nose;
	private boolean eyes;
	private boolean hands;
	private boolean fame;
	private boolean personality;
	private int noOfHands;
	private int noOfEyes;
	private int noOfLegs;
	private boolean legs;
	private boolean fingers;

	private int noOfFingers;
	private boolean toes;
	private int noOfToes;
	private boolean tissues;
	private boolean consumeFood;
	private String originFrom;
	private String biologicalName;
	private boolean heart;
	private boolean kidney;
	private boolean bilateral;

	private boolean mamals;
	private boolean omnivore;
	private boolean multiCellular;
	private String typeOfLiving;
	private boolean patience;
	private boolean think;
	private int noOfKidneys;
	private int noOfHeart;
	private boolean rest;
	private boolean smell;

	private boolean taste;
	private boolean bones;
	private boolean noOfBones;
	private String smallestBone;
	private String largestBone;

	public HumanDto() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 85;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof HumanDto) {
				HumanDto c = (HumanDto) obj;
				if (c.name.equals(this.name) && c.gender.equals(this.gender)) {
					System.out.println(this.name + " & " + this.gender);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public boolean isFeelings() {
		return feelings;
	}

	public void setFeelings(boolean feelings) {
		this.feelings = feelings;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getHairType() {
		return hairType;
	}

	public void setHairType(String hairType) {
		this.hairType = hairType;
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public int getNoOfEars() {
		return noOfEars;
	}

	public void setNoOfEars(int noOfEars) {
		this.noOfEars = noOfEars;
	}

	public int getNoOfNose() {
		return noOfNose;
	}

	public void setNoOfNose(int noOfNose) {
		this.noOfNose = noOfNose;
	}

	public boolean isNose() {
		return nose;
	}

	public void setNose(boolean nose) {
		this.nose = nose;
	}

	public boolean isEyes() {
		return eyes;
	}

	public void setEyes(boolean eyes) {
		this.eyes = eyes;
	}

	public boolean isHands() {
		return hands;
	}

	public void setHands(boolean hands) {
		this.hands = hands;
	}

	public boolean isFame() {
		return fame;
	}

	public void setFame(boolean fame) {
		this.fame = fame;
	}

	public boolean isPersonality() {
		return personality;
	}

	public void setPersonality(boolean personality) {
		this.personality = personality;
	}

	public int getNoOfHands() {
		return noOfHands;
	}

	public void setNoOfHands(int noOfHands) {
		this.noOfHands = noOfHands;
	}

	public int getNoOfEyes() {
		return noOfEyes;
	}

	public void setNoOfEyes(int noOfEyes) {
		this.noOfEyes = noOfEyes;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public boolean isLegs() {
		return legs;
	}

	public void setLegs(boolean legs) {
		this.legs = legs;
	}

	public boolean isFingers() {
		return fingers;
	}

	public void setFingers(boolean fingers) {
		this.fingers = fingers;
	}

	public int getNoOfFingers() {
		return noOfFingers;
	}

	public void setNoOfFingers(int noOfFingers) {
		this.noOfFingers = noOfFingers;
	}

	public boolean isToes() {
		return toes;
	}

	public void setToes(boolean toes) {
		this.toes = toes;
	}

	public int getNoOfToes() {
		return noOfToes;
	}

	public void setNoOfToes(int noOfToes) {
		this.noOfToes = noOfToes;
	}

	public boolean isTissues() {
		return tissues;
	}

	public void setTissues(boolean tissues) {
		this.tissues = tissues;
	}

	public boolean isConsumeFood() {
		return consumeFood;
	}

	public void setConsumeFood(boolean consumeFood) {
		this.consumeFood = consumeFood;
	}

	public String getOriginFrom() {
		return originFrom;
	}

	public void setOriginFrom(String originFrom) {
		this.originFrom = originFrom;
	}

	public String getBiologicalName() {
		return biologicalName;
	}

	public void setBiologicalName(String biologicalName) {
		this.biologicalName = biologicalName;
	}

	public boolean isHeart() {
		return heart;
	}

	public void setHeart(boolean heart) {
		this.heart = heart;
	}

	public boolean isKidney() {
		return kidney;
	}

	public void setKidney(boolean kidney) {
		this.kidney = kidney;
	}

	public boolean isBilateral() {
		return bilateral;
	}

	public void setBilateral(boolean bilateral) {
		this.bilateral = bilateral;
	}

	public boolean isMamals() {
		return mamals;
	}

	public void setMamals(boolean mamals) {
		this.mamals = mamals;
	}

	public boolean isOmnivore() {
		return omnivore;
	}

	public void setOmnivore(boolean omnivore) {
		this.omnivore = omnivore;
	}

	public boolean isMultiCellular() {
		return multiCellular;
	}

	public void setMultiCellular(boolean multiCellular) {
		this.multiCellular = multiCellular;
	}

	public String getTypeOfLiving() {
		return typeOfLiving;
	}

	public void setTypeOfLiving(String typeOfLiving) {
		this.typeOfLiving = typeOfLiving;
	}

	public boolean isPatience() {
		return patience;
	}

	public void setPatience(boolean patience) {
		this.patience = patience;
	}

	public boolean isThink() {
		return think;
	}

	public void setThink(boolean think) {
		this.think = think;
	}

	public int getNoOfKidneys() {
		return noOfKidneys;
	}

	public void setNoOfKidneys(int noOfKidneys) {
		this.noOfKidneys = noOfKidneys;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public boolean isRest() {
		return rest;
	}

	public void setRest(boolean rest) {
		this.rest = rest;
	}

	public boolean isSmell() {
		return smell;
	}

	public void setSmell(boolean smell) {
		this.smell = smell;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public boolean isBones() {
		return bones;
	}

	public void setBones(boolean bones) {
		this.bones = bones;
	}

	public boolean isNoOfBones() {
		return noOfBones;
	}

	public void setNoOfBones(boolean noOfBones) {
		this.noOfBones = noOfBones;
	}

	public String getSmallestBone() {
		return smallestBone;
	}

	public void setSmallestBone(String smallestBone) {
		this.smallestBone = smallestBone;
	}

	public String getLargestBone() {
		return largestBone;
	}

	public void setLargestBone(String largestBone) {
		this.largestBone = largestBone;
	}

}
