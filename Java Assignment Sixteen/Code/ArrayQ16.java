/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: method of finding the smallest element in an array  
*/
import java.util.*;
import java.lang.*;
public class ArrayQ16{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            double[] array = new double[10];
             
            for(int i = 0; i < array.length; i++){
                double user = input.nextDouble();
                array[i] = user;
            }
            
            System.out.println("The smallest value of array is: " + min(array));
      }

      public static double min(double[] array){
            double smallest = array[0];
            for(int j = 0; j < array.length; j++){
                if(array[j] < smallest){
                    smallest = array[j];
                            
                }
            }
            return smallest;
      }


}

