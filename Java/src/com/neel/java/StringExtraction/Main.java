package com.neel.java.StringExtraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		System.out.println("Enter the String");
		String sentence=sc.nextLine();
		
		System.out.println("Enter First Index");
		int number1=sc.nextInt();
		System.out.println("Enter Second Index");
		int number2=sc.nextInt();
		sc.nextLine();
		
		String s=main.extractString(sentence, number1, number2);
		System.out.println(s);
	}
	public String extractString(String sentence,int number1,int number2) {
		String str="";
		try {
			str=sentence.substring(number1, number2)+".";
		} catch (StringIndexOutOfBoundsException e) {
			str="Extraction of String using the given index is not possible.";
		}finally {
			str +="Thanks for using the application.";
		}
		return str;
	}
}
