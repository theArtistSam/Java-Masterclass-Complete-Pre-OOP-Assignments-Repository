
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 2: Printing ASCII characters
*/

import java.util.Scanner;
public class Nested02{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int i;
            int j = 1;
            String s1 = "";
            for(i = 33; i < 127; i++){
                System.out.print(i + " " + (char)i + " ");
                j++;
                if(j == 10){
                    System.out.print(" \n");
                    j = 1;

                }
            }

            
    }
}

