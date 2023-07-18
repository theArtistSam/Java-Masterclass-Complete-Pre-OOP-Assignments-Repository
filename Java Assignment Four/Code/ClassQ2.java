/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: Suming desired column elements  
*/

import java.util.*;
import java.lang.*;
public class ClassQ2{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];
        System.out.println("Enter elements row by row:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                double user = input.nextDouble();
                matrix[row][col] = user;  
            }
        }
        System.out.println("Enter the column index: ");
        int index = input.nextInt();
        System.out.println("Matrix is: ");
        printMatrix(matrix);
        System.out.println("Sum of elements at column " + index + " is: ");
        System.out.println(sumColumn(matrix,index));

    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                if(col == columnIndex){  
                    sum += m[row][col]; 
                }
            }
        }
        return sum;
    }
    public static void printMatrix(double[][] matrix){
        System.out.println("--------------------------");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

}        
