package com.xworkz.dto;

import java.io.Serializable;

public class SpeakersDTO implements Serializable {
	private String name;
	private String type;
	private String brand;
	private Boolean wireless;
	private Boolean bluetooth;
	private Double powerOutput;
	private Integer batteryLife;
	private Integer wirelessRange;
	private Integer bluetoothVersion;
	private String modelNo;

	private String color;
	private Integer price;
	private Double rating;
	private Double width;
	private Double height;

	public SpeakersDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SpeakersDTO [name=" + name + ", type=" + type + ", brand=" + brand + ", wireless=" + wireless
				+ ", bluetooth=" + bluetooth + ", powerOutput=" + powerOutput + ", batteryLife=" + batteryLife
				+ ", wirelessRange=" + wirelessRange + ", bluetoothVersion=" + bluetoothVersion + ", modelNo=" + modelNo
				+ ", color=" + color + ", price=" + price + ", rating=" + rating + ", width=" + width + ", height="
				+ height + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Boolean getWireless() {
		return wireless;
	}

	public void setWireless(Boolean wireless) {
		this.wireless = wireless;
	}

	public Boolean getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(Boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public Double getPowerOutput() {
		return powerOutput;
	}

	public void setPowerOutput(Double powerOutput) {
		this.powerOutput = powerOutput;
	}

	public Integer getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(Integer batteryLife) {
		this.batteryLife = batteryLife;
	}

	public Integer getWirelessRange() {
		return wirelessRange;
	}

	public void setWirelessRange(Integer wirelessRange) {
		this.wirelessRange = wirelessRange;
	}

	public Integer getBluetoothVersion() {
		return bluetoothVersion;
	}

	public void setBluetoothVersion(Integer bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

}
