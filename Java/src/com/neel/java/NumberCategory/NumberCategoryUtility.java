package com.neel.java.NumberCategory;

import java.util.Scanner;

public class NumberCategoryUtility {

	public static NumberCategory checkAmicable() {
		NumberCategory nc = (a, b) -> {
			boolean check=false;
			int temp1 = 0;
			int temp2 = 0;
			for (int i = 1; i <= a / 2; i++) {
				if (a % i == 0) {
					temp1 += i;
				}
			}
			for (int i = 1; i <= b / 2; i++) {
				if (b % i == 0) {
					temp2 += i;
				}
			}
			if (temp1 == b && temp2 == a) {
				check=true;
			}
			return check;
		};
		return nc;

	}

	public static NumberCategory checkPalindrome() {
		NumberCategory nc = (a, b) -> {
			boolean check=false;
			int n = a * b;
			int temp=n;
			int r, sum = 0;
			while (n > 0) {
				r = n % 10;
				sum = (sum * 10) + r;
				n = n / 10;
			}
			if (temp == sum) {
				check= true;
			}
			return check;
		};

		return nc;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		if (checkAmicable().checkNumberCategory(n1, n2)) {
			System.out.println("The numbers are amicable");
		} else {

			System.out.println("The numbers are not amicable");
		}
		if (checkPalindrome().checkNumberCategory(n1, n2)) {
			System.out.println("Product do produces a Palindrome");
		} else {
			System.out.println("Product does not produce a Palindrome");
		}
	}

}
