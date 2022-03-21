package com.neel.java.EndowmentplanInheritance;

public class HealthEndowment extends Endowment {

	private String healthCareCenter;
	private int holderAge;

	public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String healthCareCenter, int holderAge) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.healthCareCenter = healthCareCenter;
		this.holderAge = holderAge;
	}

	public String getHealthCareCenter() {
		return healthCareCenter;
	}

	public void setHealthCareCenter(String healthCareCenter) {
		this.healthCareCenter = healthCareCenter;
	}

	public int getHolderAge() {
		return holderAge;
	}

	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

	@Override
	public double calculateEndowment() {
		double amount =0;
		
		if(getHolderAge()<=30) {
			amount =120000;
		}
		else if(getHolderAge()>30 && getHolderAge()<60) {
			amount =200000;
		}
		else if(getHolderAge()>=60) {
			amount =500000;
		}
		return amount;
	}

}
