
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 22: Time Calculator   
*/

import java.util.Scanner;
public class Activity22{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();

		int minutes = seconds / 60;
		int hours = seconds / 3600;
		int days = seconds / 86400;

		if(seconds >= 60 && seconds < 3600){
			System.out.println("The number of minutes are: " + minutes + " minutes.");
		}
	   	else if(seconds >= 3600 && seconds < 86400){
	   		System.out.println("The number of hours are : " + hours + " hours.");
	   	}
	   	else if(seconds >= 86400){
	   		System.out.println("The number of days in these seconds are: " + days + " days.");
	   	}
	
	 	
	}	
}
