
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 7: Checking palindrome
*/

import java.util.Scanner;
public class LabQ7{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	System.out.println("Enter a three digit integer: ");
	 	int integer = input.nextInt();

	 	int firstInteger = integer / 100;
	 	int secondInteger = integer / 10;
	 	secondInteger = secondInteger % 10;
	 	int thirdInteger = integer % 10;

		int setInt3 = thirdInteger * 100;
		int setInt2 = secondInteger * 10;
		int setInt1 = firstInteger * 1;
		int allSet = setInt1 + setInt2 + setInt3;
	 	System.out.println(allSet);

	 	if(integer == allSet){
	 		System.out.println("You win");
	 	}
	 	else{
	 		System.out.println("You lose");	
	 	}

	}	

}
