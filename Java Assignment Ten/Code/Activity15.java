
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 15: Magic dates
*/

import java.util.Scanner;
public class Activity15{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the month (In numbers): ");
	 	int month = input.nextInt();
	 
	 	System.out.print("Enter the date: ");
	 	int date = input.nextInt();
	 
	 	System.out.print("Enter the year: ");
	 	int year = input.nextInt();
	 
	 	int lastDigitsYear = year % 100;
	 	
	  	if(month * date == lastDigitsYear){
	    	System.out.println("The date is magical: " + month + "/" + date + "/" + lastDigitsYear);
	    }
	 	else {
	    	System.out.println("The date is not magical");	
	    }


	   
	}	
}
