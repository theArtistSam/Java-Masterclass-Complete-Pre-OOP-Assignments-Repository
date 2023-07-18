
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 18: Books and points 
*/

import java.util.Scanner;
public class Activity18{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the number of books you purchased last month: ");
		int books = input.nextInt();

		if(books == 0){
			System.out.println("You earned 0 points");
		}
	   	else if(books == 1){
	   		System.out.println("You earned 5 points");
	   	}
	   	else if(books == 2){
	   		System.out.print("You earned 15 points");
	   	}
	 	else if(books == 3){
	   		System.out.print("You earned 30 points");
	   	}
	 	else if(books == 4){
	   		System.out.print("You earned 60 points");
	   	}
	 	
	}	
}
