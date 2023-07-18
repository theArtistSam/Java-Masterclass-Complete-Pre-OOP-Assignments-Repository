
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 16: Color Mixing
*/

import java.util.Scanner;
public class Activity16{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter any primary color (1: red, 2: blue and 3: yellow): ");
	 	int color1 = input.nextInt();
	 	

	  	System.out.print("Enter another primary color (1: red, 2: blue and 3: yellow): ");
	 	int color2 = input.nextInt();
	 	
	 	if(color1 != 1 && color1 != 2 && color1 != 3){
	    	System.out.println("You didn't enter the primary colors");
	    }
	    else if(color2 != 1 && color2 != 2 && color2 != 3){
	    	System.out.println("You didn't enter the primary colors");
	    }

	 	if(color1 == 1 && color2 == 2){
	    	System.out.println("You get purple");	
	    }
	    else if(color1 == 1 && color2 == 3){
	    	System.out.println("You get orange");	
	    }
    	else if(color1 == 2 && color2 == 3){
	    	System.out.println("You get Green");	
	    }


	   
	}	
}
