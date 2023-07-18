
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 8: Shipping Package
*/

import java.util.Scanner;
public class LabQ8{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	System.out.print("Enter the weight of packages purchased: ");
		int packageWeight = input.nextInt();

		if(packageWeight <= 1){
			System.out.println("The shipping charges would be: $3.50 ");
		}
	   	else if(packageWeight > 1 && packageWeight <= 3){
	   		System.out.println("The shipping charges would be: $5.50 ");
	   	}
	   	else if(packageWeight > 3 && packageWeight <= 10){
	   		System.out.print("The shipping charges would be: $8.50 ");
	   	}
	 	else if(packageWeight > 10 && packageWeight <= 20){
	   		System.out.print("The shipping charges would be: $10.5 ");
	   	}
	 	
	}	
}


