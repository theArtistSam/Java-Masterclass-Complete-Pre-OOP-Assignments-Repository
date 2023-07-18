
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 19: Discount calculation   
*/

import java.util.Scanner;
public class Activity19{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	System.out.print("Enter the number of packages purchased: ");
		int packageAmount = input.nextInt();

		int retailPrice = (packageAmount * 99);

		if(packageAmount >= 10 && packageAmount <= 19){
			System.out.println("You get 20% diccount: " + (retailPrice * 20) / 100 );
		}
	   	else if(packageAmount >= 20 && packageAmount <= 49){
	   		System.out.println("You get 30% diccount: " + (retailPrice * 30) / 100 );
	   	}
	   	else if(packageAmount >= 40 && packageAmount <= 99){
	   		System.out.print("You get 40% diccount: " + (retailPrice * 40) / 100);
	   	}
	 	else if(packageAmount >= 100){
	   		System.out.print("You get 50% diccount: " + (retailPrice * 50) / 100);
	   	}
	 	
	}	
}
