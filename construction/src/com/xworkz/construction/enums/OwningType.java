package com.xworkz.construction.enums;

public enum OwningType {
	RENT("rent"),LEASE("lease"),OWN("own");

	private String values;

	private OwningType(String values) {
		this.values = values;
	}
	
	public String getValues() {
		return values;
	}
	
}
