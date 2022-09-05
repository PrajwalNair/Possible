package com.xworkz.dto.data;

import java.io.Serializable;

public class BusDTO implements Serializable {
	private String brand;
	private String type;
	private String noPlate;
	private String tyreBrand;
	private String wayOfTransport;
	private int noOfPassengers;
	private int noOfWheels;
	private double radiusOfWheels;
	private double widthOfWheels;
	private double internalDiameterOfWheels;

	private double outerDiameterOfWheels;
	private int noOfRims;
	private double priceOfWheels;
	private double priceOfRim;
	private double noOfMirrors;
	private double widthOfMirror;
	private double heightOfMirror;
	private double thicknessOfMirror;
	private int noOfGripsInWheel;
	private double onRoadPrice;

	private int noOfSeats;
	private int noOfBolts;
	private int noOfNuts;
	private double widthOfBus;
	private double heightOfBus;
	private boolean stairing;
	private boolean gears;
	private boolean clutch;
	private boolean breakLiner;
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
	private boolean airBag;

	private double doorWidth;
	private double doorHeight;
	private double windowWidth;
	private double windowHeight;
	private double doorPrice;

	public BusDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 4;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof BusDTO) {
				BusDTO c = (BusDTO) obj;
				if (c.brand.equals(this.brand) && c.type.equals(this.type) && c.noPlate.equals(this.noPlate)
						&& c.tyreBrand == (this.tyreBrand) && c.wayOfTransport.equals(this.wayOfTransport)
						&& c.noOfPassengers == (this.noOfPassengers)) {
					System.out.println(this.brand + " & " + this.type + " & " + this.noPlate + " & " + this.tyreBrand
							+ " & " + this.wayOfTransport + " & " + this.noOfPassengers);
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

	public String getNoPlate() {
		return noPlate;
	}

	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}

	public String getTyreBrand() {
		return tyreBrand;
	}

	public void setTyreBrand(String tyreBrand) {
		this.tyreBrand = tyreBrand;
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

	public int getNoOfRims() {
		return noOfRims;
	}

	public void setNoOfRims(int noOfRims) {
		this.noOfRims = noOfRims;
	}

	public double getPriceOfWheels() {
		return priceOfWheels;
	}

	public void setPriceOfWheels(double priceOfWheels) {
		this.priceOfWheels = priceOfWheels;
	}

	public double getPriceOfRim() {
		return priceOfRim;
	}

	public void setPriceOfRim(double priceOfRim) {
		this.priceOfRim = priceOfRim;
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

	public int getNoOfGripsInWheel() {
		return noOfGripsInWheel;
	}

	public void setNoOfGripsInWheel(int noOfGripsInWheel) {
		this.noOfGripsInWheel = noOfGripsInWheel;
	}

	public double getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
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

	public double getWidthOfBus() {
		return widthOfBus;
	}

	public void setWidthOfBus(double widthOfBus) {
		this.widthOfBus = widthOfBus;
	}

	public double getHeightOfBus() {
		return heightOfBus;
	}

	public void setHeightOfBus(double heightOfBus) {
		this.heightOfBus = heightOfBus;
	}

	public boolean isStairing() {
		return stairing;
	}

	public void setStairing(boolean stairing) {
		this.stairing = stairing;
	}

	public boolean isGears() {
		return gears;
	}

	public void setGears(boolean gears) {
		this.gears = gears;
	}

	public boolean isClutch() {
		return clutch;
	}

	public void setClutch(boolean clutch) {
		this.clutch = clutch;
	}

	public boolean isBreakLiner() {
		return breakLiner;
	}

	public void setBreakLiner(boolean breakLiner) {
		this.breakLiner = breakLiner;
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

	public boolean isAirBag() {
		return airBag;
	}

	public void setAirBag(boolean airBag) {
		this.airBag = airBag;
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
