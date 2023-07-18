
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 13: Area calculation
*/

import java.util.Scanner;
public class Activity13{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the length of rectangle 1: ");
	 	int length1 = input.nextInt();
	 
	 	System.out.print("Enter the width of rectangle 1: ");
	 	int width1 = input.nextInt();
	 	
	 	int area = length1 * width1;

	 	System.out.print("Enter the length of rectangle 2: ");
	 	int length2 = input.nextInt();
	 	 
	 	System.out.print("Enter the width of rectangle 2: ");
	 	int width2 = input.nextInt();
	 
	 	int area2 = length2 * width2; 

	    if(area == area2){
	    	System.out.println("Both rectagnles have same area");
	    }
	 	else if(area > area2){
	    	System.out.println("Rectangle 1 has more area than rectangle 2");	
	 	}
	 	else if(area < area2){
	    	System.out.println("Rectangle 2 has more area than rectangle 1");
	    }
	}	
}
