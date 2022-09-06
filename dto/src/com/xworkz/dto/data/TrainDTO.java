package com.xworkz.dto.data;

import java.io.Serializable;

public class TrainDTO implements Serializable {
	private String brand;
	private String type;
	private String TrainNo;
	private String typeOfWheel;
	private String wayOfTransport;
	private int noOfPassengers;
	private int noOfWheels;
	private double radiusOfWheels;
	private double widthOfWheels;
	private double internalDiameterOfWheels;

	private double outerDiameterOfWheels;
	private String source;
	private double priceOfWheels;
	private String destination;
	private double noOfMirrors;
	private double widthOfMirror;
	private double heightOfMirror;
	private double thicknessOfMirror;
	private int noOfCoaches;
	private boolean sleeperCoach;

	private int noOfSeats;
	private int noOfBolts;
	private int noOfNuts;
	private double widthOfTrain;
	private double lengthOfTrain;
	private boolean horn;
	private boolean electrical;
	private boolean food;
	private boolean switches;
	private int noOfGears;

	private boolean engine;
	private String typeOfEngine;
	private double priceOfEngine;
	private double priceOfMirror;
	private int noOfWhipers;
	private double priceOfWhipers;
	private boolean door;
	private boolean window;
	private boolean dashBoard;
	private boolean luggageCompartment;

	private double doorWidth;
	private double doorHeight;
	private double windowWidth;
	private double windowHeight;
	private double doorPrice;

	public TrainDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof TrainDTO) {
				TrainDTO c = (TrainDTO) obj;
				if (c.brand == (this.brand) && c.type == (this.type) && c.TrainNo == (this.TrainNo)
						&& c.wayOfTransport == (this.wayOfTransport) && c.noOfPassengers == (this.noOfPassengers)
						&& c.noOfWheels == (this.noOfWheels) && c.source == (this.source)
						&& c.destination == (this.destination) && c.noOfMirrors == (this.noOfMirrors)
						&& c.widthOfMirror == (this.widthOfMirror) && c.heightOfMirror == (this.heightOfMirror)
						&& c.thicknessOfMirror == (this.thicknessOfMirror) && c.noOfCoaches == (this.noOfCoaches)
						&& c.sleeperCoach == (this.sleeperCoach) && c.noOfSeats == (this.noOfSeats)
						&& c.widthOfTrain == (this.widthOfTrain)) {
					System.out.println(
							this.brand + " & " + this.type + " & " + this.TrainNo + " & " + this.wayOfTransport + " & "
									+ this.noOfPassengers + " & " + this.noOfWheels + " & " + this.source + " & "
									+ this.destination + " & " + this.noOfMirrors + " & " + this.noOfMirrors + " & "
									+ this.widthOfMirror + " & " + this.heightOfMirror + " & " + this.thicknessOfMirror
									+ " & " + this.noOfCoaches + " & " + this.sleeperCoach + " & " + this.noOfSeats);
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTrainNo() {
		return TrainNo;
	}

	public void setTrainNo(String trainNo) {
		TrainNo = trainNo;
	}

	public String getTypeOfWheel() {
		return typeOfWheel;
	}

	public void setTypeOfWheel(String typeOfWheel) {
		this.typeOfWheel = typeOfWheel;
	}

	public String getWayOfTransport() {
		return wayOfTransport;
	}

	public void setWayOfTransport(String wayOfTransport) {
		this.wayOfTransport = wayOfTransport;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public double getRadiusOfWheels() {
		return radiusOfWheels;
	}

	public void setRadiusOfWheels(double radiusOfWheels) {
		this.radiusOfWheels = radiusOfWheels;
	}

	public double getWidthOfWheels() {
		return widthOfWheels;
	}

	public void setWidthOfWheels(double widthOfWheels) {
		this.widthOfWheels = widthOfWheels;
	}

	public double getInternalDiameterOfWheels() {
		return internalDiameterOfWheels;
	}

	public void setInternalDiameterOfWheels(double internalDiameterOfWheels) {
		this.internalDiameterOfWheels = internalDiameterOfWheels;
	}

	public double getOuterDiameterOfWheels() {
		return outerDiameterOfWheels;
	}

	public void setOuterDiameterOfWheels(double outerDiameterOfWheels) {
		this.outerDiameterOfWheels = outerDiameterOfWheels;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getPriceOfWheels() {
		return priceOfWheels;
	}

	public void setPriceOfWheels(double priceOfWheels) {
		this.priceOfWheels = priceOfWheels;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getNoOfMirrors() {
		return noOfMirrors;
	}

	public void setNoOfMirrors(double noOfMirrors) {
		this.noOfMirrors = noOfMirrors;
	}

	public double getWidthOfMirror() {
		return widthOfMirror;
	}

	public void setWidthOfMirror(double widthOfMirror) {
		this.widthOfMirror = widthOfMirror;
	}

	public double getHeightOfMirror() {
		return heightOfMirror;
	}

	public void setHeightOfMirror(double heightOfMirror) {
		this.heightOfMirror = heightOfMirror;
	}

	public double getThicknessOfMirror() {
		return thicknessOfMirror;
	}

	public void setThicknessOfMirror(double thicknessOfMirror) {
		this.thicknessOfMirror = thicknessOfMirror;
	}

	public int getNoOfCoaches() {
		return noOfCoaches;
	}

	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}

	public boolean isSleeperCoach() {
		return sleeperCoach;
	}

	public void setSleeperCoach(boolean sleeperCoach) {
		this.sleeperCoach = sleeperCoach;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfBolts() {
		return noOfBolts;
	}

	public void setNoOfBolts(int noOfBolts) {
		this.noOfBolts = noOfBolts;
	}

	public int getNoOfNuts() {
		return noOfNuts;
	}

	public void setNoOfNuts(int noOfNuts) {
		this.noOfNuts = noOfNuts;
	}

	public double getWidthOfTrain() {
		return widthOfTrain;
	}

	public void setWidthOfTrain(double widthOfTrain) {
		this.widthOfTrain = widthOfTrain;
	}

	public double getLengthOfTrain() {
		return lengthOfTrain;
	}

	public void setLengthOfTrain(double lengthOfTrain) {
		this.lengthOfTrain = lengthOfTrain;
	}

	public boolean isHorn() {
		return horn;
	}

	public void setHorn(boolean horn) {
		this.horn = horn;
	}

	public boolean isElectrical() {
		return electrical;
	}

	public void setElectrical(boolean electrical) {
		this.electrical = electrical;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isSwitches() {
		return switches;
	}

	public void setSwitches(boolean switches) {
		this.switches = switches;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public boolean isEngine() {
		return engine;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public String getTypeOfEngine() {
		return typeOfEngine;
	}

	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}

	public double getPriceOfEngine() {
		return priceOfEngine;
	}

	public void setPriceOfEngine(double priceOfEngine) {
		this.priceOfEngine = priceOfEngine;
	}

	public double getPriceOfMirror() {
		return priceOfMirror;
	}

	public void setPriceOfMirror(double priceOfMirror) {
		this.priceOfMirror = priceOfMirror;
	}

	public int getNoOfWhipers() {
		return noOfWhipers;
	}

	public void setNoOfWhipers(int noOfWhipers) {
		this.noOfWhipers = noOfWhipers;
	}

	public double getPriceOfWhipers() {
		return priceOfWhipers;
	}

	public void setPriceOfWhipers(double priceOfWhipers) {
		this.priceOfWhipers = priceOfWhipers;
	}

	public boolean isDoor() {
		return door;
	}

	public void setDoor(boolean door) {
		this.door = door;
	}

	public boolean isWindow() {
		return window;
	}

	public void setWindow(boolean window) {
		this.window = window;
	}

	public boolean isDashBoard() {
		return dashBoard;
	}

	public void setDashBoard(boolean dashBoard) {
		this.dashBoard = dashBoard;
	}

	public boolean isLuggageCompartment() {
		return luggageCompartment;
	}

	public void setLuggageCompartment(boolean luggageCompartment) {
		this.luggageCompartment = luggageCompartment;
	}

	public double getDoorWidth() {
		return doorWidth;
	}

	public void setDoorWidth(double doorWidth) {
		this.doorWidth = doorWidth;
	}

	public double getDoorHeight() {
		return doorHeight;
	}

	public void setDoorHeight(double doorHeight) {
		this.doorHeight = doorHeight;
	}

	public double getWindowWidth() {
		return windowWidth;
	}

	public void setWindowWidth(double windowWidth) {
		this.windowWidth = windowWidth;
	}

	public double getWindowHeight() {
		return windowHeight;
	}

	public void setWindowHeight(double windowHeight) {
		this.windowHeight = windowHeight;
	}

	public double getDoorPrice() {
		return doorPrice;
	}

	public void setDoorPrice(double doorPrice) {
		this.doorPrice = doorPrice;
	}

}
