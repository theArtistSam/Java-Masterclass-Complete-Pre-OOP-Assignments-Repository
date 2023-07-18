
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 7: Milk profit calculation
*/

import java.util.Scanner;

public class Activity7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double cartonPrice = 3.78;
		double oneLitterMilk = 0.38; // Declaring prices of different products
		double oneGallonMilk = 0.38 * 3.78;
		double cartonProfit = 0.27;

		System.out.print("Enter the total amount of milk (weigh) in gallons: "); // Calculating the weigh of milk in gallons
		int amount = input.nextInt();
		
		double noOfCartons = amount / cartonPrice;
		System.out.println("No. of cartons producing milk are: " + (int) noOfCartons); // Calculating number of cartons
		
		double price = noOfCartons * oneGallonMilk;
		System.out.println("Cost of producing milk is $: " + price); // calculating cost of Milk
		
		double profit = noOfCartons * cartonProfit;
		System.out.print("Profit of producing milk is $: " + profit); // Calculating Profit
		


	}
}
