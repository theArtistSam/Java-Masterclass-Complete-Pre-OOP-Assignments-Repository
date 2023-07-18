/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 10: index of the largest number of sequence
*/

import java.util.Scanner;
public class IndexLargest{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int start = 0;
		int count = 0;
		int previous = 0;
		int x = 1;
		int largest = 0;
		int largestCount = 0;

		while(start < x){
			System.out.print("Enter 'N' inputs: ");
			previous = x;
			previous = largest;
			x = input.nextInt();
			if (x == 0){
				break;
			}
			if (x > previous){
				largest = x;
				largestCount = count;
				previous = largest;
			}
			count++; 
		}
		System.out.println("The index of the largest number is: " + (largestCount + 1));

		
	}
}



/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 11: Determining the even numbers of sequence
*/

import java.util.Scanner;
public class EvenSequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = 1;
		int even = 0;
		int start = 0;
		int addEven = 0;
		while(start < x){
		System.out.print("Enter 'N' inputs: ");
		x = input.nextInt();
		if (x == 0){
			break;
		}
		if (x % 2 == 0){
			even = x;
			addEven++;
		} 
		}
		System.out.println("The even numbers in the sequence are: " + addEven);
		

	}
}



/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 12: Number greater than the previous one of a sequence
*/

import java.util.Scanner;
public class GreaterSequence{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int start = -1;
		int previous = 0;
		int x = 0;
		int greater = 0;

		while(start < x){
			System.out.print("Enter 'N' inputs: ");
			previous = x;
			x = input.nextInt();
			if (x == 0){
				break;
			}
			if (x > previous){
				greater++;
			} 
		}
		System.out.println("Numbers that are greater than the previous one are: " + (greater - 1));

	}
}