/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 11: Determining the even numbers of sequence
*/

import java.util.Scanner;
public class EvenSequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = 1;
		int even = 0;
		int start = 0;
		int addEven = 0;
		while(start < x){
		System.out.print("Enter 'N' inputs: ");
		x = input.nextInt();
		if (x == 0){
			break;
		}
		if (x % 2 == 0){
			even = x;
			addEven++;
		} 
		}
		System.out.println("The even numbers in the sequence are: " + addEven);
		
		
		







	}
}