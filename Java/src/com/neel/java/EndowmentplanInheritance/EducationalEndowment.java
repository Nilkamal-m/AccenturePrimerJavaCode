package com.neel.java.EndowmentplanInheritance;

public class EducationalEndowment extends Endowment {

	private String educationalInstitution;
	private String educationalDivision;

	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public String getEducationalDivision() {
		return educationalDivision;
	}

	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}

	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String educationalInstitution, String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalInstitution = educationalInstitution;
		this.educationalDivision = educationalDivision;
	}

	@Override
	public double calculateEndowment() {
		double amount =0;
		if(getEducationalDivision().equalsIgnoreCase("School")) {
			amount=30000;
		}
		else if(getEducationalDivision().equalsIgnoreCase("UnderGraduate")) {
			amount=60000;
		}else if(getEducationalDivision().equalsIgnoreCase("PostGraduate")) {
			amount=90000;
		}
		return amount;
	}

}
