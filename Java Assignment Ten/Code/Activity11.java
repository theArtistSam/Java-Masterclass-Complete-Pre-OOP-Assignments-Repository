
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 11: Checking the equality of numbers
*/

import java.util.Scanner;
public class Activity11{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter an integer x: ");
	 	int x = input.nextInt();
	 	
	 	System.out.print("Enter an integer y: ");
	 	int y = input.nextInt();
	 	
	 	System.out.print("Enter an integer z: ");
	 	int z = input.nextInt();
	 	 
	    if(x == y && x == z && y == x && y == z && z == x && z == y){
	    	System.out.println("All the integers are equal to each other: 3");
	    }
	 	else if(x == y && x != z || x != y && x == z && y == x && y != z || y != x && y == z && z == x && z != y || z != x && z == y){
	 		System.out.println("Two integers are equal to each other: 2");	
	 	}
	 	else if(x != y && x != z && y != x && y != z && z != x && z != y){
	 		System.out.println("None of them are equal to each other: 0" );
	 	}
	}
}
