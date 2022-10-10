package com.xworkz.construction;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.construction.dto.HouseDTO;
import com.xworkz.construction.enums.OwningType;
import com.xworkz.construction.enums.Type;

public class HouseDisplay {

	public static void main(String[] args) {
		
		HouseDTO houseDTO1 = new HouseDTO(1, "Chiguru", "Honey", Type.VILLA, 2, true, OwningType.OWN, 2500.0);
		HouseDTO houseDTO2 = new HouseDTO(17, "Doddamane", "Chandru", Type.APPARTMENT, 4, false, OwningType.LEASE, 3000.0);
		HouseDTO houseDTO3 = new HouseDTO(3, "Ganapa", "Suhas", Type.VILLA, 2, true, OwningType.RENT, 2000.0);
		HouseDTO houseDTO4 = new HouseDTO(4, "Duniya Runa", "Dharshan", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1500.0);
		HouseDTO houseDTO5 = new HouseDTO(10, "Parimala nilaya", "Manoj", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1500.0);
		HouseDTO houseDTO6 = new HouseDTO(6, "Eshwarakrupa", "Malatesh", Type.VILLA, 2, true, OwningType.RENT, 2550.0);
		HouseDTO houseDTO7 = new HouseDTO(7, "Adarsha", "Abhishek", Type.APPARTMENT, 5, false, OwningType.RENT, 4500.0);
		HouseDTO houseDTO8 = new HouseDTO(8, "Aashirvada", "Basavaraj", Type.VILLA, 3, true, OwningType.RENT, 2000.0);
		HouseDTO houseDTO9 = new HouseDTO(9, "Bhagya", "Sachin", Type.INDIVIDUAL, 1, true, OwningType.RENT, 1200.0);
		HouseDTO houseDTO10 = new HouseDTO(5, "Bhavani", "Dada", Type.APPARTMENT, 8, false, OwningType.LEASE, 3600.0);
		HouseDTO houseDTO11 = new HouseDTO(11, "Chaya", "Dyamanna", Type.APPARTMENT, 15, false, OwningType.LEASE, 3150.0);
		HouseDTO houseDTO12 = new HouseDTO(12, "Daya", "Prajwal", Type.VILLA, 2, true, OwningType.OWN, 2300.0);
		HouseDTO houseDTO13 = new HouseDTO(13, "Kanasu", "Sunil", Type.VILLA, 3, true, OwningType.OWN, 2200.0);
		HouseDTO houseDTO14 = new HouseDTO(14, "Mamata", "Naresh", Type.APPARTMENT, 10, true, OwningType.OWN, 4000.0);
		HouseDTO houseDTO15 = new HouseDTO(15, "Nidhi", "Raghu", Type.INDIVIDUAL, 1, false, OwningType.OWN, 1310.0);
		HouseDTO houseDTO16 = new HouseDTO(16, "Shubh", "Santhosh", Type.INDIVIDUAL, 1, true, OwningType.LEASE, 1350.0);
		HouseDTO houseDTO17 = new HouseDTO(2, "Vishesha", "Parashuram", Type.INDIVIDUAL, 1, false, OwningType.RENT, 1200.0);
		HouseDTO houseDTO18 = new HouseDTO(18, "Vismaya", "Sanjay", Type.APPARTMENT, 6, true, OwningType.OWN, 3100.0);
		HouseDTO houseDTO19 = new HouseDTO(19, "Ananda", "Sharath", Type.VILLA, 3, true, OwningType.OWN, 2020.0);
		HouseDTO houseDTO20 = new HouseDTO(20, "Ashraya", "Manohar", Type.APPARTMENT, 4, false, OwningType.RENT, 3050.0);
		
		
		
		List<HouseDTO> houseDTOs = new ArrayList<HouseDTO>();
		houseDTOs.add(houseDTO1);
		houseDTOs.add(houseDTO2);
		houseDTOs.add(houseDTO3);
		houseDTOs.add(houseDTO4);
		houseDTOs.add(houseDTO5);
		houseDTOs.add(houseDTO6);
		houseDTOs.add(houseDTO7);
		houseDTOs.add(houseDTO8);
		houseDTOs.add(houseDTO9);
		houseDTOs.add(houseDTO10);
		houseDTOs.add(houseDTO11);
		houseDTOs.add(houseDTO12);
		houseDTOs.add(houseDTO13);
		houseDTOs.add(houseDTO14);
		houseDTOs.add(houseDTO15);
		houseDTOs.add(houseDTO16);
		houseDTOs.add(houseDTO17);
		houseDTOs.add(houseDTO18);
		houseDTOs.add(houseDTO19);
		houseDTOs.add(houseDTO20);
		
		System.out.println("----------------------------asc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getId().compareTo(e2.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by id----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------asc by name----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by type----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getType().compareTo(e1.getType())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------desc by sqft----------------------------------------");
		houseDTOs.stream().sorted((e1,e2)->e2.getSqft().compareTo(e1.getSqft())).forEach((e)->System.out.println(e));
		System.out.println("----------------------------with loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == true)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------without loan and desc by owner----------------------------------------");
		houseDTOs.stream().filter((e)->e.getLoan() == false)
		.sorted((e1,e2)->((e2.getOwner().compareTo(e1.getOwner())))).forEach((e)->System.out.println(e));
		System.out.println("----------------------------owning type by lease----------------------------------------");
		houseDTOs.stream().filter((e)->e.getOwningType() == OwningType.LEASE).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by appartment----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.APPARTMENT).forEach((e)->System.out.println(e));
		System.out.println("----------------------------type by villa----------------------------------------");
		houseDTOs.stream().filter((e)->e.getType() == Type.VILLA).forEach((e)->System.out.println(e));
		System.out.println("----------------------------order by type and asc by owningtype----------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
		int m=	r.getType().compareTo(r2.getType());
		if(m==0) {
		return	r.getOwningType().compareTo(r2.getOwningType());
			
		}	
		return m;		
		}).forEach((ref)->System.out.println(ref));
		System.out.println("--------------------------order by name and desc by id------------------------------------------");
		houseDTOs.stream().sorted((r,r2)->{
			int m=	r2.getName().compareTo(r.getName());
			if(m==0) {
			return	r2.getId().compareTo(r.getId());
				
			}	
			return m;		
			}).forEach((ref)->System.out.println(ref));




		
	}

}
