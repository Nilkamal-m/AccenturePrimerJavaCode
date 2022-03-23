package com.neel.java.StockList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<String> al= new ArrayList<String>();
	System.out.println("Enter number of stocks to add");
	int n = sc.nextInt();
	sc.nextLine();
	for(int i =0;i<n;i++) {
		String temp=sc.nextLine();
		al.add(temp);
	}
	
	System.out.println(al.toString());
	
	}

}
