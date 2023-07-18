
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 4: Counting Number of Apples
*/

import java.util.Scanner;

public class Activity4{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of Students: "); // Obtaining Number of Students
		int n = input.nextInt();
		System.out.print("Enter number of Apples: "); // Obtaining Number of Apples
		int k = input.nextInt();
		
		int distribution = k / n;
		System.out.println("Number of Apples distributed to each student is: " + distribution); // Distributing Apples

		int remaining = k % n;
		System.out.print("The remaining Apples in the basket are: " + remaining); // Remaining Apples

	}
}
