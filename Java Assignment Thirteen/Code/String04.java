
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 8: Removing Letters
*/

import java.util.Scanner;
public class String04{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence like in a String");
        String str = input.nextLine();

        String reduced = str.substring(0, str.indexOf("h")) + str.substring(str.lastIndexOf("h") + 1, str.length());
        System.out.println(reduced);   
                

        



    
 }
        
}


