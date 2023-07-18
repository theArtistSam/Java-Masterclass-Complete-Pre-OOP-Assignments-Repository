
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 9: index addition
*/

import java.util.Scanner;

public class Activity10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int lessThan10 = number % 10; // obtaining 1's       
        number /= 10;                           
        int tens = number % 10;      // obtaining 10's       
        number /= 10;                           
        int hundreds = number % 10;  // obtaining 100's   
        number /= 10;                           
        int sum = hundreds + tens + lessThan10; 

        System.out.println("The sum of the digits is " + sum);
    }
}