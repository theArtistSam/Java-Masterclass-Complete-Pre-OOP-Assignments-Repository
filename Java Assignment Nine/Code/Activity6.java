
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 6: number of hours
*/

import java.util.Scanner;

public class Activity6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");
		double minutes = input.nextDouble();
		double hours = minutes / 60;
		System.out.println("Number of hours are: " + (int)hours);
		double minutesAfter = minutes % 60;
		System.out.println("Number of minutes are: " + minutesAfter);
		System.out.println("Number of hours and minutes are: " + (int) hours + ":" + (int) minutesAfter);


	}
}
