
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 14: weight calculation
*/

import java.util.Scanner;
public class Activity14{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter object's mass in kilograms: ");
	 	int mass = input.nextInt();
	 
	 	double weight = mass * 9.8;

	    if(weight > 1000){
	    	System.out.println("The object is way too heavy");
	    }
	 	else if(weight < 10){
	    	System.out.println("The object is way too light");	
	    }
	}	
}
