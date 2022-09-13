package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AlcoholDTO implements Serializable {
	private String brand;
	private String name;
	private String type;
	private String materialOfBottle;
	private Double price;
	private Boolean flavour;
	private Double diameterOfBottle;
	private Double quantity;
	private LocalDate expiry;
	private Integer since;

	private String bar;
	private Double alcoholPercentage;
	private Double radiusOfBottle;
	private Boolean precaution;
	private Boolean injurious;

	public AlcoholDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", name=" + name + ", type=" + type + ", materialOfBottle="
				+ materialOfBottle + ", price=" + price + ", flavour=" + flavour + ", diameterOfBottle="
				+ diameterOfBottle + ", quantity=" + quantity + ", expiry=" + expiry + ", since=" + since + ", bar="
				+ bar + ", alcoholPercentage=" + alcoholPercentage + ", radiusOfBottle=" + radiusOfBottle
				+ ", precaution=" + precaution + ", injurious=" + injurious + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getMaterialOfBottle() {
		return materialOfBottle;
	}

	public void setMaterialOfBottle(String materialOfBottle) {
		this.materialOfBottle = materialOfBottle;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getFlavour() {
		return flavour;
	}

	public void setFlavour(Boolean flavour) {
		this.flavour = flavour;
	}

	public Double getDiameterOfBottle() {
		return diameterOfBottle;
	}

	public void setDiameterOfBottle(Double diameterOfBottle) {
		this.diameterOfBottle = diameterOfBottle;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public Integer getSince() {
		return since;
	}

	public void setSince(Integer since) {
		this.since = since;
	}

	public String getBar() {
		return bar;
	}

	public void setBar(String bar) {
		this.bar = bar;
	}

	public Double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	public void setAlcoholPercentage(Double alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}

	public Double getRadiusOfBottle() {
		return radiusOfBottle;
	}

	public void setRadiusOfBottle(Double radiusOfBottle) {
		this.radiusOfBottle = radiusOfBottle;
	}

	public Boolean getPrecaution() {
		return precaution;
	}

	public void setPrecaution(Boolean precaution) {
		this.precaution = precaution;
	}

	public Boolean getInjurious() {
		return injurious;
	}

	public void setInjurious(Boolean injurious) {
		this.injurious = injurious;
	}

}
