package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		System.out.println("Enter name and gross salary and tax: ");
		employee.name = sc.nextLine();
		employee.gross_salary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		System.out.println("Employee : " + employee.name);
		System.out.println("Gross Salary: " + employee.gross_salary);
		System.out.println("Tax: " + employee.tax);
		System.out.println();
		System.out.println("Employee: " + employee.name, employee.netSalary());
		System.out.printf("Net Salary = %.2f%n ", employee.netSalary());
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
