
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 9: Zeller's congruence
*/

import java.util.Scanner;
public class LabQ9{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	int h; 

	 	System.out.print("Enter month: ");
		int m = input.nextInt();

		System.out.print("Enter day of month: ");
		int q = input.nextInt();

		System.out.print("Enter the year: ");
		int year = input.nextInt();
		int j = year / 100;

		int k = year % 100;

		if(m == 1){
			m = m + 12;
			k = k - 1;
		}
		else if(m == 2){
			m = m + 13;
			k = k - 1;
		}

		h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

		if(h == 0){
			System.out.println("Day of the week is: Saturday");
		}
		else if(h == 1){
			System.out.println("Day of the week is: Sunday");
		}
		else if(h == 2){
			System.out.println("Day of the week is: Monday");
		}
		else if(h == 3){
			System.out.println("Day of the week is: Tuesday");
		}
		else if(h == 4){
			System.out.println("Day of the week is: Wednesday");
		}
		else if(h == 5){
			System.out.println("Day of the week is: Thursday");
		}
		else if(h == 6){
			System.out.println("Day of the week is: Friday");
		}

	 	
	}	
}


