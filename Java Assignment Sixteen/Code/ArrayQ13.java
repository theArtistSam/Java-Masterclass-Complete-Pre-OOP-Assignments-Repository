/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Displaying Distinct numbers 
*/
import java.util.*;
import java.lang.*;
public class ArrayQ13{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            
            int[] myList = new int[10];
            
            int user = 0;
            System.out.println("Enter 10 numbers: ");
            int count = 0;
            /*int k = 0;
            int j = 0;
            int i = 0;*/
            int occurence = 0;

            for(int x = 0; x < myList.length; x++){
                user = input.nextInt();
                myList[x] = user;

            }
            int[] newList = new int[10];
            for(int k = 1; k <= myList.length; k++){
                for(int j = 0; j < myList.length; j++){
                    if(k == myList[j]){
                        occurence += 1;
                        continue;
                        
                    }
                    else{
                        for(int i = 0; i < occurence; i++){
                            newList[i] = k;
                            //System.out.print(newList[i]);
                        }    
                    }
                                        
                    
                }

                
            }
            System.out.print("occurences are: " + occurence);
            for(int l = 0; l < newList.length; l++){
                System.out.print(newList[l]); 
            }
      }       
}

