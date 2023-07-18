/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 12: Number greater than the previous one of a sequence
*/

import java.util.Scanner;
public class GreaterSequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int start = -1;
		int previous = 0;
		int x = 0;
		int greater = 0;

		while(start < x){
			System.out.print("Enter 'N' inputs: ");
			previous = x;
			x = input.nextInt();
			if (x == 0){
				break;
			}
			if (x > previous){
				greater++;
			} 
		}
		System.out.println("Numbers that are greater than the previous one are: " + (greater - 1));

		
		
		







	}
}