
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 1: Positive and Negative values
*/

import java.util.Scanner;
public class Nested01{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double positive = 0;
            double negative = 0;
            double average = 0;
            int total = 0;
            double divide;   

            System.out.println("Enter an integer, the input ends if it is 0: ");
            for(int i = 0; i < 100; i++){
            int x = input.nextInt();
            if(x == 0){
                break;
            } 
            else if(x >= 0){
                positive++;
            }
            else if(x < 0){
                negative++;
            }
            x++;
            total = x + 1;
                 
                    
        }
        divide = (positive + negative);
        average = total / divide;
        System.out.println("The number of positives is: " + (int) positive);
        System.out.println("The number of negatives is: " + (int) negative);
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);
        
    }
}

