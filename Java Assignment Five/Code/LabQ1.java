
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 1: Stocks calculation   
*/

import java.util.Scanner;
public class LabQ1{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
	 	
	 	System.out.println("Enter the number of shares sold: ");
	 	double shares = input.nextInt();

	 	System.out.println("Enter the purchase price of each share: ");
	 	double purchasePrice = input.nextInt();

	 	System.out.println("Enter the selling price of each share: ");
	 	double sellingPrice = input.nextInt();

	 	double amountInvested = shares * purchasePrice;
	 	double amountEarned = shares * sellingPrice;

	 	System.out.println("The total amount invested is: " + amountInvested);

	 	double serviceProfit = amountEarned * 0.015;

	 	System.out.println("The total service charges (on buy and sell) are: " + (amountInvested * 0.015 + amountEarned * 0.015));

	 	double amountGainOrLost = amountEarned - amountInvested;

	 	System.out.println("The total amount gained or lost is: " + amountGainOrLost );


	 	System.out.println("The total amount after selling the stock is: " + ((amountInvested + amountGainOrLost) - serviceProfit)); // Also adding the service profit on it!

	 
	}	
}
