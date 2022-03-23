package com.neel.java.VehicleCapacityCalculator;

public class UserInterface {
	public static void main(String[] args) throws PetrolOverflowException {
		int petrol = 123;
		boolean temp = Validator.validatePetrolUsage(petrol);
		
		if(temp) {
			System.out.println("Petrol Tank will be sufficient");
		}
//		else {
//			throw new PetrolOverflowException(null)
//		}
	}
}
