package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #"+ i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(ch=='i') {
				System.out.print("Health expenditure: ");
				double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenses));
			}
			else {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Person p : list) {
			System.out.println(p.taxPaid());
		}
		
		System.out.println();
		double sum = 0.0;
		for(Person p : list) {
			sum += p.tax();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}
}