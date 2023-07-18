
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 3: Fixing and Showing the outputs of the statements
*/

public class Activity3{
	public static void main(String[] args) {

		// System.out.printf("%5d %d", 1, 2, 3); (Here three variables are given while the formatting is of only 2) 
		// System.out.printf("%5d %f", 1); (Here only one variable is given while the formatting is of 2! Also the number is integer not float)
		// System.out.printf("%5d %f", 1, 2); (This one works prefectly fine! Also the numbers are integer not float)
		

		System.out.printf("%-1d %d %d\n", 1, 2, 3); 
		System.out.printf("%-1d\n", 1);
		System.out.printf("%-1d %d\n", 1, 2);
	}
}
