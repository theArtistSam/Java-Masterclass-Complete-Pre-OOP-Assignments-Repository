
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 17: Dollar Game
*/

import java.util.Scanner;
public class Activity17{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter number of pennes: ");
		double pennes = input.nextDouble();

		System.out.print("Enter number of Nickels: ");
		double nickels = input.nextDouble();

		System.out.print("Enter number of Dimes: ");
		double dimes = input.nextDouble();

		System.out.print("Enter number of Quaters: ");
		double quarters = input.nextDouble();


		double totalAmount = (pennes * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);

		if(totalAmount == 1){
			System.out.println("Congratulations! you won the game");
		}
	   	else if(totalAmount > 1){
	   		System.out.println("The total amount is more than a dollar");
	   	}
	   	else{
	   		System.out.print("The total amount is less than a dollar");
	   	}
	 	
	}	
}
