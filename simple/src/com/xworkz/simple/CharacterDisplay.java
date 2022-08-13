package com.xworkz.simple;

public class CharacterDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating instance
		
		Character ch = new Character('H');
		
		// Instance methods
		
		Character c=ch.charValue();
		System.out.println(c);
		
		int c1=ch.compareTo('5');
		System.out.println(c1);
		
		int c2=ch.hashCode();
		System.out.println(c2);
		
		boolean c3=ch.equals(ch);
		System.out.println(c3);
		
		String c4=ch.toString();
		System.out.println(c4);
		
		//Static methods
		
		Character d = Character.forDigit(125, 5);
		System.out.println(d);
		
	    int d1 = Character.charCount(4);
		System.out.println(d1);
		
		Character d2= Character.toLowerCase('A');
		System.out.println(d2);
		
		Character d3 = Character.toUpperCase('b');
		System.out.println(d3);
		
		Character d4 = Character.forDigit(5, 8);
		System.out.println(d4);
		
		Character d5= Character.highSurrogate(14);
		System.out.println(d5);
		
		Character d6= Character.reverseBytes('C');
		System.out.println(d6);
		
		int d7 = Character.compare('A','D');
		System.out.println(d7);
		
		boolean d8 = Character.isDefined(4);
		System.out.println(d8);
		
		int d9 = Character.getType('F');
		System.out.println(d9);
		
		boolean d10 = Character.isLetter('M');
		System.out.println(d10);
		

	}

}
