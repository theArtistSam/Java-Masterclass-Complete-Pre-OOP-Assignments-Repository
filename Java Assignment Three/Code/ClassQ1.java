/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: multiplying 2 matrices  
*/
import java.util.*;
import java.lang.*;
public class ClassQ1{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter number of rows of 1st matrix");
            int row1 = input.nextInt();
            System.out.println("Enter number of columns of 1st matrix");
            int col1 = input.nextInt();
            System.out.println("Enter number of rows of 2nd matrix");
            int row2 = input.nextInt();
            System.out.println("Enter number of columns of 2nd matrix");
            int col2 = input.nextInt();

            int[][] mulMatrix = new int[row1][col2]; 
            int[][] matrix = new int[row1][col1];
            int[][] matrix2 = new int[row2][col2];

            int empty = 0;

            if(col1 == row2){
                // inserting elements of 1st matrix
                System.out.println("Enter the elements of 1st matrix");
                for(int row = 0; row < matrix.length; row++){
                    for(int col = 0; col < matrix[row].length; col++){
                        int user = input.nextInt();
                        matrix[row][col] = user;                                              
                    }
                        
                }

                // inserting elements of 2nd matrix
                System.out.println("Enter the elements of 2nd matrix");
                for(int row = 0; row < matrix2.length; row++){
                    for(int col = 0; col < matrix2[row].length; col++){
                        int user = input.nextInt();
                        matrix2[row][col] = user;                                              
                    }           
                }
                System.out.println("---------------------------");
                System.out.println("The first matrix is:");
                printMatrix(matrix);
                System.out.println("The second matrix is:");
                printMatrix(matrix2);
                // multiplying two matrices
                System.out.println("The multiplied matrix is");
                for(int row = 0; row < row1; row++){
                    for(int col = 0; col < col2; col++){
                        for(int detector = 0; detector < col1; detector++){
                            mulMatrix[row][col] += matrix[row][detector] * matrix2[detector][col];
                        }                                                                                              
                    }           
                }       
            }
            else{
                System.out.println("Matrix multiplication is not possible!");
            }

            printMatrix(mulMatrix);

    }


    public static void printMatrix(int[][] array){
        
        // printing sum-ed matrix
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}