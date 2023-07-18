/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 3: Chess game
*/

import java.util.Scanner;
public class LabQ3{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 

	 	System.out.print("Enter a number (1-8) for the first row: ");
		int row1 = input.nextInt();

		System.out.print("Enter a number (1-8) for the first column: ");
		int column1 = input.nextInt();
		
		System.out.print("Enter a number (1-8) for the second row: ");
		int row2 = input.nextInt();

		System.out.print("Enter a number (1-8) for the second column: ");
		int column2 = input.nextInt();


		if((row1 - row2 <= 1) && (column1 - column2 <= 1) && ((row1 != column1 && row2 == column2) || (row1 == column1 && row2 != column2))){
			System.out.print("Yes! the movement is possible");
		}
		else{
			System.out.print("Nope! The movement is not possible");
		} 		
	 	
	}	
}
