
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 3: Four Pattents (First)
*/

import java.util.Scanner;
public class Nested03_1{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int i = 1;
            while (i < 7){
                for(int j = 1; j < i; j++){
                   System.out.print(j + " "); 
                }
            System.out.println(i + " ");
            i++;    
            }
            
    }
}

