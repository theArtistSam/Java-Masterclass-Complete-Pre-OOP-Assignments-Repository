
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 10: printing the smallest numeber
*/

import java.util.Scanner;
public class Activity10{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter a number x: ");
	 	int x = input.nextInt();
	 	
	 	System.out.print("Enter a number y: ");
	 	int y = input.nextInt();
	 	
	 	System.out.print("Enter a number z: ");
	 	int z = input.nextInt();
	 	 
	    if(x < y && x < z){
	    	System.out.println("X is the smallest number: " + x );
	    }
	 	else if(y < x && y < z){
	 		System.out.println("Y is the smallest number: " + y );	
	 	}
	 	else if(z < x && z < y){
	 		System.out.println("Z is the smallest number: " + z );
	 	}


	}
}
