/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 5: Sum-ing n cubes
*/

import java.util.Scanner;
public class AddNcubes{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		System.out.println("Enter a number N");
		int x = input.nextInt();
		
		while(count < x){	
		int n = input.nextInt();

		sum = sum + n*n*n;
		count++; 
		}

		System.out.println(sum);








		}
	}