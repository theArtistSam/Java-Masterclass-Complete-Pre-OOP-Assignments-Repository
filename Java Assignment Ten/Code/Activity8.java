
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 8: if-else statement
*/

import java.util.Scanner;
public class Activity8{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.println("Enter a number");
	 	int x = input.nextInt();
	 	System.out.println("Enter another number");
	 	int y = input.nextInt();
	 	 
	     
	    if(x > y){
	    	System.out.println("y is smaller than x: " + y );
	    }
	 	else if(x < y){
	 		System.out.println("x is smaller than y: " + x );	
	 	}


	}
}
