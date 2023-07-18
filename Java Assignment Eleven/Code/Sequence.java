/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 8: calculating sequence
*/

import java.util.Scanner;
public class Sequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of inputs");
		int n = input.nextInt();

		int count = 0;
		int sum = 0;
		int length = 0;

		while(count < n){
		System.out.print("Enter 'N' inputs: ");
		int x = input.nextInt();
		sum = sum + 1;
		if(x == 0){
			length = sum;
		}
		count++; 
		}
		System.out.println("The length of the sequence is: " + (length - 1));
		







	}
}