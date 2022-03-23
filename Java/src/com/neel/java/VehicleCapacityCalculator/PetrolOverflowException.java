package com.neel.java.VehicleCapacityCalculator;

public class PetrolOverflowException extends Exception {
	public PetrolOverflowException(String msg) {
		//super(msg);
		System.out.println(msg);
	}
}
