
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 3: Four Pattents (Second)
*/

import java.util.Scanner;
public class Nested03_2{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int i = 6;
            while (i > 0){
                for(int j = 1; j < i; j++){
                   System.out.print(j + " "); 
                }
            System.out.println(i + " ");
            i--;    
            }
            
    }
}

