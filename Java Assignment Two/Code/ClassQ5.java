
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 5: Binary
*/

import java.util.*;
public class ClassQ5{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = input.nextInt();
            String str = "";

            while (true){
                int binary = num % 2;
                num = num / 2;
                str += binary;


                
                if(num == 1){
                   str = str + num ;
                   
                    break;
                } 
            }
            
            String s2 = "";

            for (int i = str.length()-1; i >= 0; i--){
                s2 += str.charAt(i);
            }

            System.out.println(s2);
    }
}

