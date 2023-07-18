/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 7: calculating number of zeros
*/

import java.util.Scanner;
public class NumofZeros{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of inputs");
		int n = input.nextInt();

		int count = 0;
		int sum = 0;
		
		while(count < n){
		int x = input.nextInt();
		if(x == 0){
			sum = sum + 1;
		}
		count++; 
		}
		System.out.println("Number of zeros are: " + sum);
		







	}
}