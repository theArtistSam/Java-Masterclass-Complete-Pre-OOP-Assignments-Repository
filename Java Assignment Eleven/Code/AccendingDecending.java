/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 2: Printing from A to B in Accending and Decending order
*/

import java.util.Scanner;
public class AccendingDecending{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number A");
		int a = input.nextInt();

		System.out.println("Enter a number B");
		int b = input.nextInt();

		
		if(a <= b){
			while(a <= b){
			System.out.println(a);
			a++;
			}
		}	
		else if(a >= b){
			while(a >= b){
			System.out.println(a);
			a--;
			}
		}
		








		}
	}