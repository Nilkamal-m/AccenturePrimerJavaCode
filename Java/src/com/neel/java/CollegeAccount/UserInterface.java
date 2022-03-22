package com.neel.java.CollegeAccount;

import java.util.Scanner;

public class UserInterface {
	public static TuitionFee generateFeeReceipt() {
		TuitionFee tf = (c,b,n) -> {
			int fee=0;
			if(c.equalsIgnoreCase("Regular")) {
				fee=b*n;
			}else if (c.equalsIgnoreCase("SelfFinance")) {
				fee=b*n+50000;
			}
			return fee;
		};
		return tf;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registration number");
		String regNo = sc.next();
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter no of semesters");
		int noSem=sc.nextInt();
		System.out.println("Enter basic fee");
		int bFee=sc.nextInt();
		System.out.println("Course type");
		String cType = sc.next();
		
		int totalFee = generateFeeReceipt().calculateTuitionFees(cType, bFee, noSem);
		System.out.println("Fees Receipt");
		System.out.println("Registration number: "+regNo);
		System.out.println("Student name: "+name);
		System.out.println("Tuition fee for "+cType+" student: "+totalFee);
		
	}
}
