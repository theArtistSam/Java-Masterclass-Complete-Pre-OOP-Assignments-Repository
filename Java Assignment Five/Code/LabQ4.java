
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 4: Divisible number check   
*/

import java.util.Scanner;
public class LabQ4{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	System.out.println("Enter a number: ");
	 	int num = input.nextInt();

 		System.out.println("The number is divisible by both 5 and 6: " + (num % 5 == 0 && num % 6 == 0));

	 	System.out.println("The number is divisible by 5 or 6: " + (num % 5 == 0 || num % 6 == 0));
	 	
	 	System.out.println("The number is divisible by either 5 or 6 but not both: " + (num % 5 == 0 ^ num % 6 == 0));
	}	
}
