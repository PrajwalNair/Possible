package com.xworkz.classtest;



public class Palindrome {
	
	
	public static void main(String[] args) {
		
		String name = "ata";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		String data = buffer.toString();
		{

		if (name.equals(data)) {
			System.out.println("Given String is palindrome");
		} 
		else 
		{
			System.out.println("Given String is not palindrome");
		}

		
		}
	}
	
	

}
