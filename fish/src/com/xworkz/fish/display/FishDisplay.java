package com.xworkz.fish.display;

import com.xworkz.fish.child.Fish;

public class FishDisplay {

	public static void main(String[] args) {
		Fish fish = new Fish("Surumae", "sea fish");
		System.out.println(fish);
		fish.getBreed();
		fish.getType();

		Fish fish2 = new Fish("Surumae", "sea fish");
		System.out.println(fish.equals(fish2));

	}

}
