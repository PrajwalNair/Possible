package com.xworkz.dto;

import java.io.Serializable;
import java.util.Arrays;

public class TabletDTO implements Serializable {
	private String name;
	private String type;
	private Double price;
	private String color;
	private String shape;
	private Boolean warning;
	private Boolean painKiller;
	private Boolean fever;
	private String[] sideEffects;
	private Integer doseagePerDay;

	private Boolean children;
	private String wrapperColor;
	private Integer noOfTabletsPerStrip;
	private Boolean cold;
	private Boolean kuff;

	public TabletDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TabletDTO [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape="
				+ shape + ", warning=" + warning + ", painKiller=" + painKiller + ", fever=" + fever + ", sideEffects="
				+ Arrays.toString(sideEffects) + ", doseagePerDay=" + doseagePerDay + ", children=" + children
				+ ", wrapperColor=" + wrapperColor + ", noOfTabletsPerStrip=" + noOfTabletsPerStrip + ", cold=" + cold
				+ ", kuff=" + kuff + "]";
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Boolean getWarning() {
		return warning;
	}

	public void setWarning(Boolean warning) {
		this.warning = warning;
	}

	public Boolean getPainKiller() {
		return painKiller;
	}

	public void setPainKiller(Boolean painKiller) {
		this.painKiller = painKiller;
	}

	public Boolean getFever() {
		return fever;
	}

	public void setFever(Boolean fever) {
		this.fever = fever;
	}

	public String[] getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String[] sideEffects) {
		this.sideEffects = sideEffects;
	}

	public Integer getDoseagePerDay() {
		return doseagePerDay;
	}

	public void setDoseagePerDay(Integer doseagePerDay) {
		this.doseagePerDay = doseagePerDay;
	}

	public Boolean getChildren() {
		return children;
	}

	public void setChildren(Boolean children) {
		this.children = children;
	}

	public String getWrapperColor() {
		return wrapperColor;
	}

	public void setWrapperColor(String wrapperColor) {
		this.wrapperColor = wrapperColor;
	}

	public Integer getNoOfTabletsPerStrip() {
		return noOfTabletsPerStrip;
	}

	public void setNoOfTabletsPerStrip(Integer noOfTabletsPerStrip) {
		this.noOfTabletsPerStrip = noOfTabletsPerStrip;
	}

	public Boolean getCold() {
		return cold;
	}

	public void setCold(Boolean cold) {
		this.cold = cold;
	}

	public Boolean getKuff() {
		return kuff;
	}

	public void setKuff(Boolean kuff) {
		this.kuff = kuff;
	}

}
