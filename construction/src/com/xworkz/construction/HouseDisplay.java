package com.xworkz.construction;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.construction.dto.HouseDTO;
import com.xworkz.construction.enums.OwningType;
import com.xworkz.construction.enums.Type;

public class HouseDisplay {

	public static void main(String[] args) {
		
		HouseDTO houseDTO1 = new HouseDTO(1, "nilkamal", "Honey", Type.INDIVIDUAL, 1, true, OwningType.OWN, 1200.0);
		HouseDTO houseDTO2 = new HouseDTO(2, "brahmakamal", "Chandru", Type.APPARTMENT, 2, false, OwningType.LEASE, 1300.0);
		HouseDTO houseDTO3 = new HouseDTO(3, "ambari", "Suhas", Type.APPARTMENT, 3, true, OwningType.RENT, 1500.0);

		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getType().compareTo(e1.getType())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getSqft().compareTo(e1.getSqft())).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == true)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == false)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getOwningType() == OwningType.LEASE).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.APPARTMENT).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.VILLA).forEach((e)->System.out.println(e));
		System.out.println("--------------------------------------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
		int m=	r.getType().compareTo(r2.getType());
		if(m==0) {
		return	r.getOwningType().compareTo(r2.getOwningType());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
		
		houseDTOs.stream().sorted((r,r2)->{
			int m=	r2.getName().compareTo(r.getName());
			if(m==0) {
			return	r2.getId().compareTo(r.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));




		
	}

}
