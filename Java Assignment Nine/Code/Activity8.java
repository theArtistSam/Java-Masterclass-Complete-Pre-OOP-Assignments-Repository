
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 8: Milk profit calculation
*/

import java.util.Scanner;

public class Activity8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double payPerHour = 15.50;
		double totalTax = 14/100;
		
		System.out.println("Enter the pay rate rate for an hour: ");
		double payRate = input.nextDouble();
		
		System.out.println("Enter the number of hours worked each week: ");	
		int noOfHrs = input.nextInt();
		
		double incomeBeforeTax = payRate * 35; // 35 = 5 weeks
		System.out.println("Payment before tax $: " + (int) incomeBeforeTax);

		double incomeAfterTax = incomeBeforeTax * 0.625; // 0.625 includes all taxes
		System.out.println("Payment Afters tax $: " + (int) incomeAfterTax);

		double incomeSchool = incomeBeforeTax * 1/100; 
		System.out.println("Payment After school tax $: " + (int) incomeSchool);

		double incomeSavingFunds = incomeBeforeTax * 25/100; 
		System.out.println("Payment After saving Funds tax $: " + (int) incomeSavingFunds);

		double incomeAdditionalFunds = incomeBeforeTax * 0.125; 
		System.out.println("Payment After school tax $: " + (int) incomeAdditionalFunds);

	}
}
