/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 3: Sum-ing 10 inputs
*/

import java.util.Scanner;
public class Add10{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		int sum = 0;
		
		while(count < 10){
		System.out.println("Enter a number N");
		int n = input.nextInt();

		sum = sum + n;
		count++; 
		}

		System.out.println(sum);








		}
	}