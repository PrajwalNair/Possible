package com.xworkz.dto;

import com.xworkz.dto.data.CricketDto;

public class CricketDtoDisplay {

	public static void main(String[] args) {
		CricketDto dto=new CricketDto();
		dto.setCapatinName("MSD");
		dto.setAllRouderName1("Yuvraj");
		
		CricketDto dto1=new CricketDto();
		dto1.setCapatinName("KapilDev");
		dto1.setAllRouderName1("KapilDev");
		
		System.out.println(dto.hashCode());
		System.out.println(dto1.hashCode());
		
		System.out.println(System.identityHashCode(dto));
		System.out.println(System.identityHashCode(dto1));
		
		if(dto.hashCode()==dto1.hashCode()) {
			Boolean b=dto.equals(dto1);
			System.out.println(b);
		}
		else {
			System.out.println("HashCode is not equal");
		}
	}

}
