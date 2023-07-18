/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 4: Sum-ing n numbers
*/

import java.util.Scanner;
public class AddNnum{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		System.out.println("Enter a number N");
		int x = input.nextInt();
		
		while(count < x){	
		int n = input.nextInt();

		sum = sum + n;
		count++; 
		}

		System.out.println(sum);








		}
	}