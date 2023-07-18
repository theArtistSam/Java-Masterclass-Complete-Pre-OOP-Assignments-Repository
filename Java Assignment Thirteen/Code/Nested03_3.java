
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 3: Four Pattents (Third)
*/

import java.util.Scanner;
public class Nested03_3{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int num = 0;
            int i;
            int j;
            for(i = 6; i > 0; i--){
                num = 1;
                for(j = 1; j < 7; j++){
                    if(j < i){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(num + " ");
                        num = num + 1;   
                    }

                }
                System.out.println(" ");
            }
                

            
    }
}

