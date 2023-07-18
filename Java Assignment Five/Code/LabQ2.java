
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 2: Calculation cost of painting and installing carpet   
*/

import java.util.Scanner;
public class LabQ2{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);

	 	// Taking room dimensions 
	 	
	 	System.out.println("Enter the length of the room (in feet): ");
	 	double length = input.nextInt();

	 	System.out.println("Enter the width of the room (in feet): ");
	 	double width = input.nextInt();

	 	System.out.println("Enter the height of the room (in feet): ");
	 	double height = input.nextInt();

	 	double volumeRoom = ((length * height) * 2) + ((width * height) * 2);
	 	double areaRoom = length * width;

	 	// Taking door dimensions

	 	System.out.println("Enter the width of the Door (in feet): ");
	 	double widthDoor = input.nextInt();

	 	System.out.println("Enter the height of the Door (in feet): ");
	 	double heightDoor = input.nextInt();

	 	double volumeDoor = widthDoor * heightDoor;

 		// Taking window 1 dimensions
	 	
	 	System.out.println("Enter the width of the Window (in feet): ");
	 	double widthWindow = input.nextInt();

	 	System.out.println("Enter the height of the Window (in feet): ");
	 	double heightWindow = input.nextInt();

	 	double volumeWindow = widthWindow * heightWindow;

	 	// Taking window 2 dimensions
	 	System.out.println("Enter the width of the Window 2 (in feet): ");
	 	double widthWindow2 = input.nextInt();

	 	System.out.println("Enter the height of the Window 2 (in feet): ");
	 	double heightWindow2 = input.nextInt();

	 	double volumeWindow2 = widthWindow2 * heightWindow2;

		// Taking Book shelf dimensions

	 	System.out.println("Enter the width of the Book Shelf (in feet): ");
	 	double widthShelf = input.nextInt();

	 	System.out.println("Enter the height of the Book Shelf (in feet): ");
	 	double heightShelf = input.nextInt();

	 	double volumeShelf = widthShelf * heightShelf;

		// inputing cost of paint
	 	System.out.println("Enter the cost (per square foot) of painting walls: ");
	 	double costWalls = input.nextInt();

	 	// inputing cost of carpet
	 	System.out.println("Enter the cost (per square foot) of carpet: ");
	 	double costCarpet = input.nextInt();

	 	// calculating cost of paint
	 	double costPaint = (volumeRoom - (volumeDoor + volumeShelf + volumeWindow + widthWindow2 + areaRoom));

	 	System.out.println("Cost of paining room would be $: " + (costPaint * costWalls));

	 	// calculating cost of carpet
	 	System.out.println("Cost of carpet for room would be $: " + (areaRoom * costCarpet));



	 	
	}	
}
