/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: method of finding the smallest element in an array  
*/
import java.util.*;
import java.lang.*;
public class sumArray{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            int rowSum = 0;
            int totalSum = 0;
            int[][] matrix = new int[3][3];

            // sum-ing 2-D array
            for(int row = 0; row < matrix.length; row++){
                rowSum = 0;
                for(int col = 0; col < matrix[row].length; col++){
                    int user = input.nextInt();
                    matrix[row][col] = user;
                    rowSum = rowSum + matrix[row][col];
                }
                totalSum += rowSum;
                    
            } 
            
            System.out.println("Total Sum is: " + totalSum);
            /*int sum = 0;
            int[] array = new int[5];
            for(int i = 0; i < array.length; i++){
                int user = input.nextInt();
                array[i] = user;
            }

            for(int j = 0; j < array.length; j++){
                sum = sum + array[j];
            }
            System.out.println("Total Sum is: " + sum);
*/
    }
}
