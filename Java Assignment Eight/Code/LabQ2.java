/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: Reading the written data given in the question one  
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class LabQ2{
        public static void main(String[] args) throws Exception{
        
        try{
            File file = new File("students.txt");
            file.createNewFile();
            //Object Creation
            Scanner counter = new Scanner (file);
            //line count
            int count = 0;
            while(counter.hasNextLine()){
                count++;
                counter.nextLine();
            }
            counter.close();

        //object creation for reader
        Scanner ip = new Scanner(file);
        String[] names = new String[count];
        int[] grades = new int[count];
        try{
            for (int i = 0; i < count; i++){
            names[i] = ip.next();
            grades[i] = ip.nextInt();
            }
            ip.close();
        }   
        catch(Exception ex){
            System.out.println("Error Occured!");
            ex.printStackTrace();

        }

        for(int i = 0 ; i<grades.length-1;i++){
            int min_index = i;
            for(int j = i+1;j<grades.length;j++){
                if (grades[j]  > grades[i]){
                    min_index = j;
                }

            }
            if (grades[i] != i ){
                int temp1 = grades[i];
                grades[i] = grades[min_index];
                grades[min_index] = temp1;
                String temp2 = names[i];
                names[i] = names[min_index];
                names[min_index] = temp2;
            }
            
        }
        for (int i = 0; i < grades.length; i++){
            System.out.println(names[i] + " has gotten " + grades[i] + " grades ");
        
        }
        }
        catch(Exception ex){
            System.out.println("Error Occured!");
            ex.printStackTrace();
        }


    }
}