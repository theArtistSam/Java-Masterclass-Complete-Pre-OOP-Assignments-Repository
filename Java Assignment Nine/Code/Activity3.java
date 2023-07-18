/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 3: Amount Conversion
*/

import java.util.Scanner;

public class Activity3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount as decimal: ");
		double amount = input.nextDouble();
		System.out.println();
		double cents = amount * 100;
		System.out.println();
		
		double dollars = amount / 100; // Fidning number of cents
		cents = cents % 100;
		System.out.println("Number of cents: " + cents);
		

		double noOfQuaters = cents / 25; // Fidning number of Quaters
		double remainingCents = cents % 25;
		System.out.println("Number of Quaters: " + noOfQuaters);
		

		double noOfDimes = remainingCents / 10; // Fidning number of Dimes
		remainingCents = remainingCents % 10;
		System.out.println("Number of Dimes: " + noOfDimes);
		

		double noOfNickels = remainingCents / 5; // Fidning number of Nickels
		remainingCents = remainingCents % 5;
		System.out.println("Number of Nickels: " + noOfNickels);
		

		System.out.println("Number of pennes: " + remainingCents); // Fidning number of pennes



	}
}

