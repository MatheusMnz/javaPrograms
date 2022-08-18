package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsorced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsorcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			
			else {
				list.add(new Employee(name, hours, valuePerHour));

			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " -  $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
