/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: Menu for students 
*/
import java.util.*;
import java.lang.*;
public class LabQ2{
        public static Scanner input = new Scanner(System.in);
        public static void main(String[] args){

        System.out.println("Enter the number of students");
        int students = input.nextInt();

        System.out.println("Enter the number of subjects");
        int subjects = input.nextInt();

        String[][] array = new String[students + 1][subjects + 1];
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(row == 0 && col == 0){
                    array[0][0] = " ";
                }
                else if(row == 0 && col != 0){
                    System.out.println("Enter the subjects[" + col + "]");
                    String user = input.next();
                    array[0][col] = user;
                }
                else if(row != 0 && col==0){
                    System.out.println("Enter the student name[" + row + "]");
                    String user2 = input.next();
                    array[row][col] = user2;
                }
                else{
                    System.out.println("Enter the grades");
                    String user3 = input.next();
                    array[row][col] = user3;
                }


            }
        }
        while(true){
            System.out.println("\n------------ Menu ------------");
            System.out.println("The [] Represents Index of Specfied Term\nInput starts with [1]");
            System.out.println("Your Grades Table is:");
            System.out.println("--------------------------------");
            printArray(array);
            System.out.println();
            System.out.println("Press 1 to Calculate sum of specfied student ");
            System.out.println("Press 2 to Calculate average of specfied subjects");
            System.out.println("Press 3 to Calculate highest value in a row"); 
            System.out.println("Press 4 to Calculate lowest value in a row");
            System.out.println("Press 5 to Exit");
            
            int user = input.nextInt();
            if(user == 1){
                System.out.println();
                Total_marks(array);        
            }
            else if(user == 2){
                System.out.println();
                Avg_Subject(array);        
            }
            else if(user == 3){
                System.out.println();
                Stud_Highest(array);        
            }
            else if(user == 4){
                System.out.println();
                Stud_Lowest(array);        
            }
            else if(user == 5){
                break;        
            }

        }
    }
    public static void printArray(String[][] list){
        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[row].length; col++){
                /*String student = input.next();
                System.out.printf("%1s" , student);*/
                System.out.printf("%-10s" , list[row][col]);
            }
            System.out.println();
        }   
    }
    public static void Total_marks(String[][] list){
        System.out.println("Enter the student index ");
        int user = input.nextInt();
        int sum = 0;
        for(int row = 1; row < list.length;row++){
            for(int col = 1; col < list[row].length; col++){
                if(row == user){
                    sum = sum + Integer.parseInt(list[row][col]);
                }
            }   
        }
        System.out.println(sum);
       
    }
    public static void Avg_Subject(String[][] list){
        System.out.println("Enter the subject index ");
        int user = input.nextInt();
        int sum = 0;
        for(int row = 1; row < list.length;row++){
            for(int col = 1; col < list[row].length; col++){
                if(col == user){
                    sum = sum + Integer.parseInt(list[row][col]);
                }
            }   
        }
        System.out.println(sum);
       
    }
    public static void Stud_Highest(String[][] list){
        System.out.println("Enter the student index ");
        int user = input.nextInt();
        int max = 0;
        int index = 0;
        for (int row = 1; row < list.length; row++) {
            for (int col = 1; col < list[row].length; col++) {
                if(Integer.parseInt(list[user][col]) > max) {
                    max = Integer.parseInt(list[user][col]);
                    index = col; 
                }
            }
        }
        System.out.println("The highest value in the row is: " + max + " and its index is: " + index);
       
    }
    public static void Stud_Lowest(String[][] list){
        System.out.println("Enter the student index ");
        int user = input.nextInt();
        int low = 1000;
        int index = 0;
        for (int row = 1; row < list.length; row++) {
            for (int col = 1; col < list[row].length; col++) {
                if(Integer.parseInt(list[user][col]) < low) {
                    low = Integer.parseInt(list[user][col]);
                    index = col; 
                }
            }
        }
        System.out.println("The lowest value in the row is: " + low + " and its index is: " + index);
       
    }
}