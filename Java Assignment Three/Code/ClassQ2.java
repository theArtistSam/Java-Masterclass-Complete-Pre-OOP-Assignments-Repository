/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: arranging a b and c  
*/
import java.util.*;
import java.lang.*;
public class ClassQ2{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b or c: (input ends with 0)");
        String string = "";
        int size = 0;
        while(true){
            String character = input.next();
            if(character.equals("0")){
                break;
            }
            else{
                string += character ;    
                size++;    
            }
                        
        }
        // inserting string elements in an array
        char[] array = new char[size];
        char temp = 'a';
        for(int i = 0; i < size; i++){
            array[i] = string.charAt(i);
        }
        for(int i = 0; i < array.length; i++){     
            for(int j = i+1; j < array.length; j++){     
               if(array[i] > array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }          
            }     
        }    

        // sorting characters in an Array 
        System.out.println("--------- The result is ---------");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);            
        }


    }
}