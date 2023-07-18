
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 3: Four Pattents (Fourth)
*/

import java.util.Scanner;
public class Nested03_4{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            for(int i = 1; i < 7; i++){
                System.out.println(" ");
                for(int j = 1; j < 7; j++){
                    if(i > j){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(j + " ");
                           
                    }   
                }
                
            }

                

            
    }
}

