/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: calculating average 
*/
import java.util.*;
import java.lang.*;
public class ArrayQ15{
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the numbers: ");
        int[] list = new int[100];
        int average = 0;
        int scoresNumeber = 0;
        for(int i = 0; i < list.length; i++){
            int user = input.nextInt();
            if(user < 0){
                break;
            }
            else{
                list[i] = user;
                average += user;
                scoresNumeber += 1;    
            }
        }

        int finalAverage = average / scoresNumeber;
        int belowAverage = 0;
        int aboveAverage = 0;
        int equalToAverage = 0;

        for(int j = 0; j < scoresNumeber; j++){
            if(list[j] > finalAverage){
                aboveAverage += 1;
            }
            else if(list[j] < finalAverage){
                belowAverage += 1;
            }
            else if(list[j] == finalAverage){
                equalToAverage += 1;
            }
        }

        System.out.println("Number of scores that are below average is/are: " + belowAverage);
        System.out.println("Number of scores that are above average is/are: " + aboveAverage);
        System.out.println("Number of scores that are equal to average is/are: " + equalToAverage);









        }

               
}       

