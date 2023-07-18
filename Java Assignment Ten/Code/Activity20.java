
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 20: shipping charging calculation   
*/

import java.util.Scanner;
public class Activity20{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the weight of packages purchased: ");
		int packageWeight = input.nextInt();

		if(packageWeight <= 2){
			System.out.println("The shipping charges would be: $1.10 ");
		}
	   	else if(packageWeight > 2 && packageWeight <= 6){
	   		System.out.println("The shipping charges would be: $2.20 ");
	   	}
	   	else if(packageWeight > 6 && packageWeight <= 10){
	   		System.out.print("The shipping charges would be: $3.70 ");
	   	}
	 	else if(packageWeight > 10){
	   		System.out.print("The shipping charges would be: $3.80 ");
	   	}
	 	
	}	
}
