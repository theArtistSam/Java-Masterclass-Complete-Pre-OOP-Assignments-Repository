
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 10: Checking Point
*/

import java.lang.Math;
import java.util.Scanner;
public class LabQ10{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 


	 	int x1 = 0;
	 	int y1 = 0;
	 	int radius = 10;

	 	System.out.print("Enter the x point: ");
		int x2 = input.nextInt();

		System.out.print("Enter the y point: ");
		int y2 = input.nextInt();

		double distance = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

		distance = Math.sqrt(distance);

		if(distance <= radius){
			System.out.print("The point: " + x2 + " and " + y2 + " is in the circle");

		}
		else if(distance > radius){
			System.out.print("The point: " + x2 + " and " + y2 + " is not in the circle");
		} 		
	 	
	}	
}


