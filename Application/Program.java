package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.reuseTax;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<reuseTax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n;i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Legal or  Physical (P/L):");
			sc.nextLine();
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double income = sc.nextDouble();
			if(type == 'p') {
				System.out.print("Health expenditures ");
				Double health = sc.nextDouble();
				list.add(new PhysicalPerson(name, income, health));
			}else if( type =='l'){
				System.out.print("Number of Employees: ");
			Integer quantity = sc.nextInt();
			list.add(new LegalPerson(name, income, quantity));
			}
		}Double sum =  0.0;
		System.out.println();
		System.out.println("Taxes:");
		for(reuseTax x: list) {
			System.out.println(x.getName()+" $ "+String.format("%.2f", x.tax(null)));
			sum += x.tax(null);
		}		
		System.out.println();
		System.out.println("Total = $"+String.format("%.2f", sum));
	}
}
