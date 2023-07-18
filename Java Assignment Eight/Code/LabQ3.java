/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: suming diagonal elements  
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class LabQ3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalEmployee1 = 0;
        int totalEmployee2 = 0;
        int totalEmployee3 = 0;
        int totalEmployee4 = 0;
        int totalEmployee5 = 0;
        int totalEmployee6 = 0;
        int totalEmployee7 = 0;

        String[][] matrix = new String[8][8];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(row == 0 && col == 0){
                    matrix[0][0] = " ";
                }
                else if(col == 0){
                    System.out.println("Enter employee's names");
                    String names = input.next();
                    matrix[row][col] = names;
                }
                else if(row == 0){
                    matrix[0][1] = "Su";
                    matrix[0][2] = "M";
                    matrix[0][3] = "T";
                    matrix[0][4] = "W";
                    matrix[0][5] = "Th";
                    matrix[0][6] = "F";
                    matrix[0][7] = "Sa";
                }
                else{
                    System.out.println("Enter weekly hours");
                    String hours = input.next();
                    matrix[row][col] = hours;
                }

            }
            System.out.println();
        }
        printMatrix(matrix);

        //System.out.println("idk" + Integer.parseInt(matrix[1][2]));

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){

                if(row == 1 && col > 0){
                    totalEmployee1 += Integer.parseInt(matrix[1][col]);
                }
                else if(row == 2 && col > 0){
                    totalEmployee2 += Integer.parseInt(matrix[2][col]);
                }
                else if(row == 3 && col > 0){
                    totalEmployee3 += Integer.parseInt(matrix[3][col]);
                }
                else if(row == 4 && col > 0){
                    totalEmployee4 += Integer.parseInt(matrix[4][col]);
                }
                else if(row == 5 && col > 0){
                    totalEmployee5 += Integer.parseInt(matrix[5][col]);
                }
                else if(row == 6 && col > 0){
                    totalEmployee6 += Integer.parseInt(matrix[6][col]);
                }
                else if(row == 7 && col > 0){
                    totalEmployee7 += Integer.parseInt(matrix[7][col]);
                }
            }
        }

        System.out.println("Total of employee 1 is: " + totalEmployee1);
        System.out.println("Total of employee 2 is: " + totalEmployee2);
        System.out.println("Total of employee 3 is: " + totalEmployee3);
        System.out.println("Total of employee 4 is: " + totalEmployee4);
        System.out.println("Total of employee 5 is: " + totalEmployee5);
        System.out.println("Total of employee 6 is: " + totalEmployee6);
        System.out.println("Total of employee 7 is: " + totalEmployee7);
        

    }
    public static void printMatrix(String[][] matrix){
        System.out.println("----------------------------------");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == null){
                    System.out.println();
                }
                else{
                    System.out.printf("%-5s" , matrix[row][col] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

}        
