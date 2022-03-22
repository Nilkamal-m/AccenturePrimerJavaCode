package com.neel.java.WaterDistributor;

import java.util.Scanner;

public class UserInterface {

	public static DiscountInfo generateBillAmount () {
		DiscountInfo df = (a) -> {
			double amount =0;
			if(a.getCount()>=100 && a.getVolume()==10) {
				double total=20.0*(double)a.getCount();
				amount=total-(0.1*total);
				return amount;
			}else if(a.getCount()>=100 && a.getVolume()==25) {
				double total=50*(double)a.getCount();
				amount=total-(0.15*total);
				return amount;
			}
			if(a.getVolume()==10) {
				return (double)(a.getCount()*20);
			}else {
				return (double)(a.getCount()*50);
			}
		};
		return df;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the distributor");
		String dName=sc.next();
		System.out.println("Enter the volume of the container(in litre)");
		int vContainer=sc.nextInt();
		System.out.println("Enter the no of containers");
		int noContainer=sc.nextInt();
		if(vContainer ==10 || vContainer==25) {
		Container container = new Container(dName, vContainer, noContainer);
		double amount = generateBillAmount().calculatePayableAmount(container);
		
		System.out.println("Generated Bill Amount");
		System.out.println("Distributor name: "+dName);
		System.out.println("Amount to be paid: Rs."+String.format("%.2f", amount));
		}else {
			System.out.println("There is no Discount");
		}
	}

}
