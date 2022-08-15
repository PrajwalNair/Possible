package com.xworkz.inheritance.task;

public class Programming {
	boolean language;
	String nameOfLanguage;
	double version;
	int inventedYear;
	String platform;

	public Programming(boolean language, String nameOfLanguage, double version, int inventedYear, String platform) {
		this.language = language;
		this.nameOfLanguage = nameOfLanguage;
		this.version = version;
		this.inventedYear = inventedYear;
		this.platform = platform;
	}

	public void torisu() {
		System.out.println(language);
		System.out.println(nameOfLanguage);
		System.out.println(version);
		System.out.println(inventedYear);
		System.out.println(platform);
	}

}
