package com.neel.java.TravelAgency;

import java.util.Scanner;

public class UserInterface {

	public static CommisionInfo generateCommissionObtained () {
		CommisionInfo cf = (a) -> {
			double amount=0;
			if(a.getClassType().equalsIgnoreCase("sl") || a.getClassType().equalsIgnoreCase("2s")) {
				amount =60;
			}else if(a.getClassType().equalsIgnoreCase("1a") || a.getClassType().equalsIgnoreCase("2a")||a.getClassType().equalsIgnoreCase("3a") ) {
				amount=100;
			}
			return amount;
		};
		return cf;
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of passengers");
		int noPas=sc.nextInt();
		double total=0;
		for(int i=1;i<=noPas;i++) {
			System.out.println("Details of Passenger "+i+":");
			System.out.println("Enter the pnr no:");
			long pnrNo=sc.nextLong();
			System.out.println("Enter passenger name:");
			String passengerName=sc.next();
			System.out.println("Enter seat no:");
			int seatNo=sc.nextInt();
			System.out.println("Enter class type:");
			String classType=sc.next();
			System.out.println("Enter ticket fare:");
			double ticketFare=sc.nextDouble();
			Ticket ticket = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare);
			total+=generateCommissionObtained().calculateCommissionAmount(ticket);
		}
		
		System.out.println("Commission Obtained");
		System.out.println("Commission obtained per each person: Rs."+String.format("%.2f", total));
	}

}
