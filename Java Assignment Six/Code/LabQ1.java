
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 1: Shape
*/
import java.util.Scanner;
public class LabQ1{
        public static void main(String[] args) {
        
        int num = 0;
            int i;
            int j;
            int k;

            for(i = 8; i > 0; i--){
                num = 1;
                for(j = 1; j < 9; j++){
                    if(j < i){
                        System.out.print("    ");
                    }
                    else{
                        System.out.printf("%4d" , num);
                        num = num + num;   
                    }
                
                }
                num = num / 2;
                for(k = 0; k < 8 - i; k++){
                        num = num / 2;
                        System.out.printf("%4d" , num);
                }
                System.out.println(" ");
                   
                
            }   

    }       
}

