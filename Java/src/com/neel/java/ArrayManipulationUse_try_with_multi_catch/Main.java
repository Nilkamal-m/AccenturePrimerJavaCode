package com.neel.java.ArrayManipulationUse_try_with_multi_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public String getDuplicateElement() {
		Scanner sc = new Scanner(System.in);
		
		String msg = null;
		try {
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the array elements");
			for (int i = 0; i < size; i++) {
				int temp = sc.nextInt();
				arr[i] = temp;
			}
			System.out.println("Enter the position of the element to be replicated");
			int position = sc.nextInt();
			int temp = arr[position];
			int arr2[] = new int[size + 1];
			for (int i = 0; i < size; i++) {
				arr2[i] = arr[i];
			}
			arr2[arr2.length - 1] = temp;
			String s = "";
			for (int i = 0; i < arr2.length; i++) {
				s += (" " + arr2[i]);
			}
			msg = "The array elements are" + s;

		} catch (InputMismatchException e) {
			return msg = "Input was not in the correct format";
		} catch (NegativeArraySizeException e) {
			return msg = "Array size should be positive";
		} catch (ArrayIndexOutOfBoundsException e) {
			return msg = "Array index is out of range";
		}

		return msg;
	}

	public static void main(String[] args) {

		Main m = new Main();

		System.out.println(m.getDuplicateElement());
	}

}
