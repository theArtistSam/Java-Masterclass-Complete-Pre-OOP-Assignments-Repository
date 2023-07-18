/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: method of finding the smallest element in an array  
*/
import java.util.*;
import java.lang.*;
public class arrayQ1_2D{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            /*// Q6: Suming all the elements of Array
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
                    
            }*/

            // Q7: Finding the row with greatest sum 
            /*int firstRowSum = 0;
            int secondRowSum = 0;
            int thirdRowSum = 0;
            int[][] matrix = new int[3][3];

            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col++){
                    int user = input.nextInt();
                    matrix[row][col] = user;
                    if(row == 0){
                        firstRowSum = firstRowSum + matrix[row][col];
                    }
                    else if(row == 1){
                        secondRowSum = secondRowSum + matrix[row][col];
                    }
                    else if(row == 2){
                        thirdRowSum = thirdRowSum + matrix[row][col];
                    }
                                        
                }
                
                    
            }
            if(firstRowSum > secondRowSum && firstRowSum > thirdRowSum){
                System.out.println("First row has the greatest sum and Index is [0] " + firstRowSum);    
            }
            else if(secondRowSum > firstRowSum && secondRowSum > thirdRowSum){
                System.out.println("Second row has the greatest sum and Index is [1] " + secondRowSum);    
            }
            else if(thirdRowSum > secondRowSum && thirdRowSum > firstRowSum){
                System.out.println("Third row has the greatest sum and Index is [2] " + thirdRowSum);    
            }
*/
            /*// sum-ing elements columns wise
            int colsum = 0; 
            int[][] matrix = new int[3][3];

            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col++){
                    int user = input.nextInt();
                    matrix[col][row] = user;
                    colsum += matrix[col][row];                          
                }
                    
            }

            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col++){
                    System.out.print(matrix[col][row] + " ");
                }
                System.out.println();
            }
            System.out.println("Sum of matrix columns wise is: " + colsum);*/


            /*// 1-D array sum
            int sum = 0;
            int[] array = new int[5];
            for(int i = 0; i < array.length; i++){
                int user = input.nextInt();
                array[i] = user;
            }

            for(int j = 0; j < array.length; j++){
                sum = sum + array[j];
            }
            System.out.println("Total Sum is: " + sum);*/

            /*// suming 2 matrices 
            int[][] sumMatrix = new int[3][3]; 
            int[][] matrix = new int[3][3];
            int[][] matrix2 = new int[3][3];

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
            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col++){
                    int user = input.nextInt();
                    matrix2[row][col] = user;                                              
                }
                    
            }

            // suming both matrices
            for(int row = 0; row < matrix.length; row++){
                for(int col = 0; col < matrix[row].length; col++){
                    sumMatrix[row][col] = matrix[row][col] + matrix2[row][col];
                                                                  
                }
                    
            }

            // printing 1st matrix
            System.out.print("The first matrix is: ");
            printMatrix(matrix);
            // printing 2nd matrix
            System.out.print("The second matrix is: ");
            printMatrix(matrix2);
            // printing sum-ed matrix
            System.out.print("The sum-ed matrix is: ");
            printMatrix(sumMatrix);*/

            /*// suming diagonal elements in 4x4 array
            int[][] matrix4x4 = new int[4][4];
            int sumMatrix4x4 = 0;

            
            System.out.println("Enter the elements of 1st matrix");
            for(int row = 0; row < matrix4x4.length; row++){
                for(int col = 0; col < matrix4x4[row].length; col++){
                    int user = input.nextInt();
                    matrix4x4[row][col] = user; 
                }                                              
            }


            for(int row = 0; row < matrix4x4.length; row++){
                for(int col = 0; col < matrix4x4[row].length; col++){
                    if(matrix4x4[row][col] < 0){
                        System.out.println("And the sum is: " + sumMatrix4x4);
                    }
                    else{
                        sumMatrix4x4 += (matrix4x4[0][0] + matrix4x4[1][1] + matrix4x4[2][2] + matrix4x4[3][3]);
                        
                    }
                    break;
                }
                break;
            }                
            System.out.print("The 4x4 matrix is: ");
            printMatrix(matrix4x4);
            System.out.print("And the sum of diagonal is: " + sumMatrix4x4);*/



    
    }
    public static void printMatrix(int[][] array){
        System.out.println();
        // printing sum-ed matrix
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
