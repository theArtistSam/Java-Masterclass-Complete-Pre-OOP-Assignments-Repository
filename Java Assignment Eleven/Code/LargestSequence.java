/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 9: calculating largest number of sequence
*/

import java.util.Scanner;
public class LargestSequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of inputs");
		int n = input.nextInt();

		int count = 0;
		int previous = 0;
		int x = 0;
		int largest = 0;

		while(count < n){
		System.out.print("Enter 'N' inputs: ");
		previous = x;
		previous = largest;
		x = input.nextInt();
		if (x > previous){
			largest = x;
			previous = largest;
		}
		count++; 
		}
		System.out.println("The largest number is: " + largest);

		
		
		







	}
}