package com.xworkz.trainer.child;

import com.xworkz.trainer.parent.Trainer;

public class Omkar extends Trainer {
	public Omkar() {
		super("Omkar", 14, "Coding");

		System.out.println(super.name);
		System.out.println(super.exp);
		System.out.println(super.specialization);
		System.out.println("Default constructor in child class");
	}

	@Override
	public boolean training() {
		System.out.println("Training in child class");
		return true;
	}

	@Override
	public boolean conductInterview() {
		if (super.conductInterview() == false) {
			System.out.println("conducting interview in child class");
			return true;
		}
		return super.conductInterview();
	}

	@Override
	public boolean coding() {
		System.out.println("Training in child class");
		return true;
	}

	public String getName() {
		System.out.println("Name in the child class");
		return "Sunil";
	}

	public double getExp() {
		System.out.println("Exp in the child class");
		return 2;
	}

	public String getSpecialization() {
		System.out.println("Specialization in the child class");
		return "Coding";
	}

}
