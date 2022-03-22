package com.neel.java.Auditing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

	private static Map<String, Double> employeeMap=new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}

	public void addEmployeeDetails(String employeeName, double salary) {
		
		employeeMap.put(employeeName, salary);
	}

	public static EmployeeAudit findEmployee() {
		
		EmployeeAudit ea = (s) -> {
			ArrayList<String> name = new ArrayList<>();
			for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
				
				if (entry.getValue() <= s) {
					name.add(entry.getKey());
				}
			}
			return name;
		};
		return ea;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean temp = true;
		Main main = new Main();

		while (temp) {
			System.out.println("1. Add Employee Details");
			System.out.println("2. Find Employee Details");
			System.out.println("3. Exit");
			System.out.println("Enter the choice");
			int option = sc.nextInt();
			if (option == 1) {
				System.out.println("Enter the Employee name");
				String name = sc.next();
				System.out.println("Enter the Employee Salary");
				double salary = sc.nextDouble();
				main.addEmployeeDetails(name, salary);
			} else if (option == 2) {
				System.out.println("Enter the salary to be searched");
				double salary = sc.nextDouble();
				EmployeeAudit findEmployee = findEmployee();
				ArrayList<String> fetchEmployeeDetails = findEmployee.fetchEmployeeDetails(salary);
				if (Objects.isNull(fetchEmployeeDetails) || fetchEmployeeDetails.isEmpty()) {
					System.out.println("No Employee Found");
				} else {
					fetchEmployeeDetails.stream().forEach(System.out::println);
				}
			} else if (option == 3) {
				sc.close();
				System.out.println("Let's complete the session");
				temp = false;
			}
		}

	}

}
