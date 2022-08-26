package com.xworkz.fish.child;

public class Fish {
	private String breed;
	private String type;

	protected Fish() {
		System.out.println("Default constructor");
	}

	public Fish(String breed, String type) {
		this.breed = breed;
		this.type = type;
	}

	public String getBreed() {
		return this.breed;
	}

	public String getType() {
		return this.type;
	}

	public String toString() {
		return "Breed " + this.breed + " Type" + this.type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("the object is not null");
			if (obj instanceof Fish) {
				System.out.println("Object is a fish");
				Fish c = (Fish) obj;
				String a = c.breed;
				String b = c.type;
				if (this.breed.equals(a) && this.type.equals(b)) {
					System.out.println("two are same");
					return true;
				} else {
					System.out.println("Object is not a fish");
				}

			} else {
				System.out.println("Object is null");
			}

		}
		return super.equals(obj);

	}

}
