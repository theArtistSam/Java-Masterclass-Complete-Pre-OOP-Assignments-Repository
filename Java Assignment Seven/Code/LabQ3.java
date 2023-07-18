/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: finding the difference of pairs
*/
import java.util.*;
import java.lang.*;
public class LabQ3{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array! ");
        int user = input.nextInt();
        int[] array =  new int[user];

        System.out.println("Enter the array elements! ");
        for(int i = 0; i < array.length; i++){
            int user1 = input.nextInt();
            array[i] = user1;
        }

        int difference2 = Integer.MIN_VALUE;
        int difference = Integer.MAX_VALUE; 
        int iPairSmall = 0;
        int jPairSmall = 0;
        int iPairLarge = 0;
        int jPairLarge = 0;
        System.out.println("----- All the pairs are -----");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                System.out.println("Pair " + array[i] + "," + array[j] + " has difference " + Math.abs(array[i] - array[j]));
            }
        }
        System.out.println("------------------------------");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(Math.abs(array[i] - array[j]) < difference){
                    difference = Math.abs(array[i] - array[j]);
                    iPairSmall = array[i];
                    jPairSmall = array[j];
                }
            }
        }        
        System.out.println(iPairSmall + "," + jPairSmall + " has smallest difference " + difference);
        System.out.println("------------------------------");
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(Math.abs(array[i] - array[j]) > difference2){
                    difference2 = Math.abs(array[i] - array[j]);
                    iPairLarge = array[i];
                    jPairLarge = array[j];
                }
            }
        }        
        System.out.println(iPairLarge + "," + jPairLarge + " has largest difference " + difference2);
        System.out.println("------------------------------");



    }

    
}