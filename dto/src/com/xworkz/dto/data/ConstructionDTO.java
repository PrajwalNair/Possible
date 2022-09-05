package com.xworkz.dto.data;

import java.io.Serializable;

public class ConstructionDTO implements Serializable {
	private boolean cement;
	private boolean sand;
	private boolean admixtures;
	private boolean water;
	private boolean aggregate;
	private boolean steel;
	private boolean bricks;
	private boolean tiles;
	private boolean paint;
	private boolean wood;

	private boolean coverBlock;
	private boolean bindingWire;
	private boolean channels;
	private boolean scaffolding;
	private boolean hammer;
	private boolean nails;
	private boolean aacBlocks;
	private boolean adhesive;
	private boolean granite;
	private boolean kadapa;

	private boolean plastering;
	private boolean mortar;
	private boolean concrete;
	private boolean cuttingMachine;
	private boolean bendingMachine;
	private boolean weldingMachine;
	private boolean cementBlocks;
	private boolean flyAsh;
	private boolean bitumin;
	private boolean codeBook;

	private boolean redBricks;
	private double priceOfCement;
	private double priceOfBricks;
	private double priceOfSteel;
	private double priceOfaggregate;
	private double priceOfTiles;
	private double priceOfPaint;
	private double priceOfWood;
	private double priceOfAdmixtures;
	private double priceOfCoverBlock;

	private double priceOfgranite;
	private double priceOfBindingWire;
	private double priceOfKadapa;
	private double priceOfConcrete;
	private double priceOfadhesive;

	public ConstructionDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof ConstructionDTO) {
				ConstructionDTO c = (ConstructionDTO) obj;
				if (c.cement == (this.cement) && c.sand == (this.sand) && c.admixtures == (this.admixtures)
						&& c.water == (this.water) && c.aggregate == (this.aggregate) && c.steel == (this.steel)) {
					System.out.println(this.cement + " & " + this.sand + " & " + this.admixtures + " & " + this.water
							+ " & " + this.aggregate + " & " + this.steel);
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

	public boolean isCement() {
		return cement;
	}

	public void setCement(boolean cement) {
		this.cement = cement;
	}

	public boolean isSand() {
		return sand;
	}

	public void setSand(boolean sand) {
		this.sand = sand;
	}

	public boolean isAdmixtures() {
		return admixtures;
	}

	public void setAdmixtures(boolean admixtures) {
		this.admixtures = admixtures;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isAggregate() {
		return aggregate;
	}

	public void setAggregate(boolean aggregate) {
		this.aggregate = aggregate;
	}

	public boolean isSteel() {
		return steel;
	}

	public void setSteel(boolean steel) {
		this.steel = steel;
	}

	public boolean isBricks() {
		return bricks;
	}

	public void setBricks(boolean bricks) {
		this.bricks = bricks;
	}

	public boolean isTiles() {
		return tiles;
	}

	public void setTiles(boolean tiles) {
		this.tiles = tiles;
	}

	public boolean isPaint() {
		return paint;
	}

	public void setPaint(boolean paint) {
		this.paint = paint;
	}

	public boolean isWood() {
		return wood;
	}

	public void setWood(boolean wood) {
		this.wood = wood;
	}

	public boolean isCoverBlock() {
		return coverBlock;
	}

	public void setCoverBlock(boolean coverBlock) {
		this.coverBlock = coverBlock;
	}

	public boolean isBindingWire() {
		return bindingWire;
	}

	public void setBindingWire(boolean bindingWire) {
		this.bindingWire = bindingWire;
	}

	public boolean isChannels() {
		return channels;
	}

	public void setChannels(boolean channels) {
		this.channels = channels;
	}

	public boolean isScaffolding() {
		return scaffolding;
	}

	public void setScaffolding(boolean scaffolding) {
		this.scaffolding = scaffolding;
	}

	public boolean isHammer() {
		return hammer;
	}

	public void setHammer(boolean hammer) {
		this.hammer = hammer;
	}

	public boolean isNails() {
		return nails;
	}

	public void setNails(boolean nails) {
		this.nails = nails;
	}

	public boolean isAacBlocks() {
		return aacBlocks;
	}

	public void setAacBlocks(boolean aacBlocks) {
		this.aacBlocks = aacBlocks;
	}

	public boolean isAdhesive() {
		return adhesive;
	}

	public void setAdhesive(boolean adhesive) {
		this.adhesive = adhesive;
	}

	public boolean isGranite() {
		return granite;
	}

	public void setGranite(boolean granite) {
		this.granite = granite;
	}

	public boolean isKadapa() {
		return kadapa;
	}

	public void setKadapa(boolean kadapa) {
		this.kadapa = kadapa;
	}

	public boolean isPlastering() {
		return plastering;
	}

	public void setPlastering(boolean plastering) {
		this.plastering = plastering;
	}

	public boolean isMortar() {
		return mortar;
	}

	public void setMortar(boolean mortar) {
		this.mortar = mortar;
	}

	public boolean isConcrete() {
		return concrete;
	}

	public void setConcrete(boolean concrete) {
		this.concrete = concrete;
	}

	public boolean isCuttingMachine() {
		return cuttingMachine;
	}

	public void setCuttingMachine(boolean cuttingMachine) {
		this.cuttingMachine = cuttingMachine;
	}

	public boolean isBendingMachine() {
		return bendingMachine;
	}

	public void setBendingMachine(boolean bendingMachine) {
		this.bendingMachine = bendingMachine;
	}

	public boolean isWeldingMachine() {
		return weldingMachine;
	}

	public void setWeldingMachine(boolean weldingMachine) {
		this.weldingMachine = weldingMachine;
	}

	public boolean isCementBlocks() {
		return cementBlocks;
	}

	public void setCementBlocks(boolean cementBlocks) {
		this.cementBlocks = cementBlocks;
	}

	public boolean isFlyAsh() {
		return flyAsh;
	}

	public void setFlyAsh(boolean flyAsh) {
		this.flyAsh = flyAsh;
	}

	public boolean isBitumin() {
		return bitumin;
	}

	public void setBitumin(boolean bitumin) {
		this.bitumin = bitumin;
	}

	public boolean isCodeBook() {
		return codeBook;
	}

	public void setCodeBook(boolean codeBook) {
		this.codeBook = codeBook;
	}

	public boolean isRedBricks() {
		return redBricks;
	}

	public void setRedBricks(boolean redBricks) {
		this.redBricks = redBricks;
	}

	public double getPriceOfCement() {
		return priceOfCement;
	}

	public void setPriceOfCement(double priceOfCement) {
		this.priceOfCement = priceOfCement;
	}

	public double getPriceOfBricks() {
		return priceOfBricks;
	}

	public void setPriceOfBricks(double priceOfBricks) {
		this.priceOfBricks = priceOfBricks;
	}

	public double getPriceOfSteel() {
		return priceOfSteel;
	}

	public void setPriceOfSteel(double priceOfSteel) {
		this.priceOfSteel = priceOfSteel;
	}

	public double getPriceOfaggregate() {
		return priceOfaggregate;
	}

	public void setPriceOfaggregate(double priceOfaggregate) {
		this.priceOfaggregate = priceOfaggregate;
	}

	public double getPriceOfTiles() {
		return priceOfTiles;
	}

	public void setPriceOfTiles(double priceOfTiles) {
		this.priceOfTiles = priceOfTiles;
	}

	public double getPriceOfPaint() {
		return priceOfPaint;
	}

	public void setPriceOfPaint(double priceOfPaint) {
		this.priceOfPaint = priceOfPaint;
	}

	public double getPriceOfWood() {
		return priceOfWood;
	}

	public void setPriceOfWood(double priceOfWood) {
		this.priceOfWood = priceOfWood;
	}

	public double getPriceOfAdmixtures() {
		return priceOfAdmixtures;
	}

	public void setPriceOfAdmixtures(double priceOfAdmixtures) {
		this.priceOfAdmixtures = priceOfAdmixtures;
	}

	public double getPriceOfCoverBlock() {
		return priceOfCoverBlock;
	}

	public void setPriceOfCoverBlock(double priceOfCoverBlock) {
		this.priceOfCoverBlock = priceOfCoverBlock;
	}

	public double getPriceOfgranite() {
		return priceOfgranite;
	}

	public void setPriceOfgranite(double priceOfgranite) {
		this.priceOfgranite = priceOfgranite;
	}

	public double getPriceOfBindingWire() {
		return priceOfBindingWire;
	}

	public void setPriceOfBindingWire(double priceOfBindingWire) {
		this.priceOfBindingWire = priceOfBindingWire;
	}

	public double getPriceOfKadapa() {
		return priceOfKadapa;
	}

	public void setPriceOfKadapa(double priceOfKadapa) {
		this.priceOfKadapa = priceOfKadapa;
	}

	public double getPriceOfConcrete() {
		return priceOfConcrete;
	}

	public void setPriceOfConcrete(double priceOfConcrete) {
		this.priceOfConcrete = priceOfConcrete;
	}

	public double getPriceOfadhesive() {
		return priceOfadhesive;
	}

	public void setPriceOfadhesive(double priceOfadhesive) {
		this.priceOfadhesive = priceOfadhesive;
	}

}
