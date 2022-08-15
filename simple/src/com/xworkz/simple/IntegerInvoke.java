package com.xworkz.simple;

public class IntegerInvoke {

	public static void main(String[] args) {

		// Creating instances

		Integer integer = new Integer(15);

		Integer integer1 = new Integer("15");
		System.out.println(integer1);

		// Instance methods

		Integer value = integer.hashCode();
		System.out.println(value);

		// Integer name = integer.getInteger("1256");
		// System.out.println(name);

		Integer name2 = integer.intValue();
		System.out.println(name2);

		byte name3 = integer.byteValue();
		System.out.println(name3);

		double name4 = integer.doubleValue();
		System.out.println(name4);

		double name5 = integer.compareTo(15);
		System.out.println(name5);

		float name6 = integer.floatValue();
		System.out.println(name6);

		long name7 = integer.longValue();
		System.out.println(name7);

		short name8 = integer.shortValue();
		System.out.println(name8);

		// int name9 = integer.compareTo(integer1);
		// System.out.println(name9);

		String name10 = integer.toString(integer);
		System.out.println(name10);

		boolean name11 = integer1.equals(name10);
		System.out.println(name11);

		// Static methods

		Integer a = Integer.decode("125");
		System.out.println(a);

		Integer b = Integer.valueOf("1025");
		System.out.println(b);

		Integer c = Integer.getInteger("1487", 1);
		System.out.println(c);

		Integer d = Integer.getInteger("nmh");
		System.out.println(d);

		Integer e = Integer.valueOf("14");
		System.out.println(e);

		Integer f = Integer.compare(15, 10);
		System.out.println(f);

		Integer g = Integer.bitCount(25);
		System.out.println(g);

		Integer h = Integer.divideUnsigned(5, 4);
		System.out.println(h);

		Integer i = Integer.lowestOneBit(14);
		System.out.println(i);

		Integer j = Integer.max(2, 5);
		System.out.println(j);

	}

}
