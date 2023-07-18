
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 6: Bank Transaction 
*/

import java.util.Scanner;
public class LabQ6{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	System.out.println("Enter amount for transaction: ");
	 	int amount = input.nextInt();

	 	System.out.println("Enter the total amount: ");
	 	double totalAmount = input.nextDouble();

	 	double amountTax = amount - 0.05;

	 	if(amount % 5 == 0 && amount <= totalAmount){
	 		System.out.printf("%5.2f\n", amountTax);
	 		System.out.printf("%5.2f", totalAmount);
	 	}
	 	else{
	 		System.out.println("You can not proceed the transaction");	
	 	}

	}	

}
