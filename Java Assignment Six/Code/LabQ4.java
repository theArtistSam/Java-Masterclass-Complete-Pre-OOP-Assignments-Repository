
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 1: Matrix
*/
import java.util.*;
public class LabQ4{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of matrix");        
        int size = input.nextInt();

        printMatrix(size);

        }   

        public static void printMatrix(int length){

            for(int i = 0; i < length; i++){
                System.out.println("");
                for(int j = 0; j < length; j++){
                    double random = Math.random() * 2;
                    if(j % 2 == 0){
                        System.out.print((int)random + " ");
                    }
                    else if(j % 2 == 1){
                        System.out.print((int)random + " ");
                    }
                                    
                }   
            }
        
    }    
}

