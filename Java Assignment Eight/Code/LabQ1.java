/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: suming diagonal elements  
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class LabQ1{
        public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        File students = new File("students.txt");
        students.createNewFile();

        FileWriter enter = new FileWriter(students);


        String names = "";
        String grades = "";
        int occurence = 0;

        while(true){
            System.out.println("Enter names: ");
            String name = input.next();
            System.out.println("Enter grades: ");
            String grade = input.next();
            if(Integer.parseInt(grade) < 0){
                break;
            }
            else{    
                enter.write(name + " ");
                enter.write(grade + "\n"); 
            }
        }
        enter.close();
        


    }

}        
