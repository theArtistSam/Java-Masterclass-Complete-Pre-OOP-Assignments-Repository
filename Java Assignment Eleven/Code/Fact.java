/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 6: Finding factorial
*/

import java.util.Scanner;
public class Fact{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value of a number");
		int num = input.nextInt();

		int times = num;

		int factorial = 1;
		int count = 0;

		if(num == 0)
		   	System.out.println("The factorial of 0 is 1");
		else{
			while(count < times){
				factorial = factorial * num;
				num--;
				count++;
			}
		}
		System.out.println(factorial);





	}
}