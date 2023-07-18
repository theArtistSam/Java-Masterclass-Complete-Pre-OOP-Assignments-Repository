/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: Checking the valid integer inputs  
*/

import java.util.*;
import java.lang.*;
public class ClassQ1{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int temp = 0;
        int sum = 0;
        while(temp < 10){
            System.out.println("Enter values: ");
            try{    
                int user = input.nextInt();
                temp++;
            }
            catch(Exception ex){
                String str = input.next();
                System.out.println("Input is in-valid. Try Again!");

            }

        }
    }
}        
