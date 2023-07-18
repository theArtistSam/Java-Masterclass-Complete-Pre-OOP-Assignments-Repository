
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 9: checking the number is positive, negative or zero
*/

import java.util.Scanner;
public class Activity9{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter a number: ");
	 	int x = input.nextInt();
	 	 
	    if(x > 0){
	    	System.out.println("The number is positive: " + x );
	    }
	 	else if(x < 0){
	 		System.out.println("The number is negative: " + x );	
	 	}
	 	else if(x == 0){
	 		System.out.println("The number is equal to zero: " + x );
	 	}


	}
}
