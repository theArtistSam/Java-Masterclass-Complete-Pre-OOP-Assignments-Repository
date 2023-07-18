
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 2: Syntex Change
*/

import java.util.Scanner;

public class Activity2{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter the width: ");
		int width = console.nextInt();
		System.out.println();
		System.out.print("Enter the length: ");
		int length = console.nextInt();
		System.out.println();
		int area = length * width;
		System.out.println("Area = " + area);
		int perimeter = 2 * (length + width);
		System.out.println("Perimeter = " + perimeter);
	}
}
