package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> ref = new ArrayList<String>();
		ref.add("Baba Basavaraj");
		ref.add("Baba");
		ref.add("MS Dhoni");
		boolean a = ref.contains("B");

		System.out.println(ref);
		System.out.println(a);
		System.out.println(ref.isEmpty());
		System.out.println(ref.remove(1));

		ref.get(0);
		System.out.println(ref.toString());
		ref.clear();
		System.out.println(ref);
		int a1 = ref.lastIndexOf(ref);
		System.out.println(a1);

	}

}
