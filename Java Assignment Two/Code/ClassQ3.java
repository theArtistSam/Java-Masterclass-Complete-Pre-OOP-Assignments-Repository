
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 3: Number Plate
*/
import java.util.*;
public class ClassQ3{
        public static void main(String[] args) {
        
        Random input = new Random();
        
        for(int i = 0; i < 3; i++){
            int str = input.nextInt(26) + 65;
            System.out.print((char)str);
        }
        for(int j = 0; j < 4; j++){
            int str2 = input.nextInt(10);
            System.out.print(str2);
        }
        
    }       
}

