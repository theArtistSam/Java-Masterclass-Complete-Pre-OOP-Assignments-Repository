
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 21: BMI calculation   
*/

import java.util.Scanner;
public class Activity21{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the weight of a person in pounds: ");
		int weight = input.nextInt();

		System.out.print("Enter the height of a person in inches: ");
		int height = input.nextInt();
		height = height * height;

		int bmi = weight * 703 / height;
		
		if(bmi >= 18.5 && bmi <= 25){
			System.out.println("Your weight is optimal ");
		}
	   	else if(bmi < 18.5){
	   		System.out.println("You're underweight ");
	   	}
	   	else if(bmi > 25){
	   		System.out.println("You're overweight ");
	   	}
	
	 	
	}	
}
