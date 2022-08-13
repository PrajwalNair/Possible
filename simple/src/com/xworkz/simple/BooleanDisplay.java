package com.xworkz.simple;

public class BooleanDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating instance
		
		Boolean bool = new Boolean(true);
		
		// Instance methods
		
		Boolean a1=bool.booleanValue();
		System.out.println(a1);
		
		Boolean a2=bool.equals(bool);
		System.out.println(a2);
		
		int a3=bool.compareTo(true);
		System.out.println(a3);
		
		int a4=bool.hashCode();
		System.out.println(a4);
		
		String a5=bool.toString();
		System.out.println(a5);
		
		//Static methods
		
		Boolean b = Boolean.valueOf(true);
		System.out.println(b);
		
		Boolean b1 = Boolean.valueOf("true");
		System.out.println(b1);
		
		Boolean b2 = Boolean.getBoolean("b");
		System.out.println(b2);
		
		Boolean b3 = Boolean.logicalAnd(true, false);
		System.out.println(b3);
		
		Boolean b4 = Boolean.logicalXor(false, true);
		System.out.println(b4);
		
		Boolean b5 = Boolean.logicalOr(true, false);
		System.out.println(b5);
		
		Boolean b6 = Boolean.parseBoolean("nh4");
		System.out.println(b6);
		
		int b7 = Boolean.hashCode(true);
		System.out.println(b7);
		
		Boolean b8 = Boolean.FALSE;
		System.out.println(b8);
		
		Boolean b9 = Boolean.TRUE;
		System.out.println(b9);
		
		
		
		

	}

}
