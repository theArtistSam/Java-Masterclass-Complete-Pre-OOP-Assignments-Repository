
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 9: Milk profit calculation
*/

import java.util.Scanner;

public class Activity9{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int seatA = 20;
		int seatB = 15;
		int seatC = 10;
		int seatD = 5;
		
		System.out.println("Enter the number of seat A: ");	 // Obtaing number of seats of class A
		int seatsA = input.nextInt();
		int seatACost = seatsA * seatA;
		
		System.out.println("Enter the number of seat B: ");	// Obtaing number of seats of class B
		int seatsB = input.nextInt();
		int seatBCost = seatsB * seatB;

		System.out.println("Enter the number of seat C: ");	// Obtaing number of seats of class C
		int seatsC = input.nextInt();
		int seatCCost = seatsC * seatC;

		System.out.println("Enter the number of seat D: ");	// Obtaing number of seats of class D
		int seatsD = input.nextInt();
		int seatDCost = seatsD * seatD;
		
		int income = seatACost + seatBCost + seatCCost + seatDCost;
		System.out.println("The Toatl income is $: " + income);
		
	}
}
