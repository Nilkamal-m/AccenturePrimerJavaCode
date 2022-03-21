package com.neel.java.EndowmentplanInheritance;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Endowment Id");
		String endowmentId=sc.next();
		System.out.println("Enter Holder Name");
		String holderName=sc.next();
		System.out.println("Enter Endowment Type");
		String endowmentType=sc.next();
		System.out.println("Enter Registration Date");
		String registrationDate=sc.next();
		
		if(endowmentType.equalsIgnoreCase("Educational")) {
			System.out.println("Enter Educational Institution");
			String educationalInstitution=sc.next();
			System.out.println("Enter Educational Division");
			String educationalDivision=sc.next();
			double amount=new EducationalEndowment(endowmentId, holderName, endowmentType, registrationDate, educationalInstitution, educationalDivision).calculateEndowment();
			System.out.println("Endowment Amount "+String.format("%.2f", amount));
		}else if(endowmentType.equalsIgnoreCase("health")) {
			System.out.println("Enter Health Care Center");
			String healthCareCenter =sc.next();
			System.out.println("Enter Holder Age");
			int holderAge=sc.nextInt();
			double amount= new HealthEndowment(endowmentId, holderName, endowmentType, registrationDate, healthCareCenter, holderAge).calculateEndowment();
			System.out.println("Endowment Amount "+String.format("%.2f", amount));
		}
		

	}

}
