
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 4: Multiplication Table
*/

import java.util.Scanner;
public class MultTable{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("        Multiplication Table");
            System.out.print("");

            int tableSize = 9;

            for(int i = 1; i <= tableSize; i++ ) {
                System.out.format("%4d", i);
            }
            System.out.println();
            System.out.println("------------------------------------------");
             
            for(int i = 1 ;i <= tableSize; i++) {
                System.out.format("%4d |",i);
                for(int j = 1; j <= tableSize; j++) {
                    System.out.format("%4d", i * j);
                }
                System.out.println();
            }
    }


}