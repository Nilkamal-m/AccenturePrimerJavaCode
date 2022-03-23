package com.neel.java.VehicleCapacityCalculator;

public class Validator {
	public static boolean validatePetrolUsage(int petrol) throws PetrolOverflowException{
		boolean flag =false;
		
		if(petrol <=120) {
			flag=true;
		}else {
			throw new PetrolOverflowException("Petrol Tank Overflow");
		}
		return flag;
	}
}
