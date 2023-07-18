/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: calculation occurrence of elements in an array 
*/
import java.util.*;
import java.lang.*;
public class ArrayQ14{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter numbers less than a 100");
            
            int[] list = new int[100];
            int occurence = 0;
            for(int i = 0; i < list.length; i++){
                int user = input.nextInt();
                if(user == 0){
                    break;
                }
                else{
                    list[i] = user;
                    occurence += 1;    
                }
            }
            int count = 0;
            for(int k = 1; k <=100; k++){
                count = 0;
                for(int j = 0; j < occurence; j++){
                    if(k == list[j]){
                        count += 1;
                    }

                }
                if(count > 1){
                    System.out.println(k + " occures " + count + " times");
                }
                else if (count == 1){
                    System.out.println(k + " occures " + count + " time");
                }
            }     


            

      }       
}

