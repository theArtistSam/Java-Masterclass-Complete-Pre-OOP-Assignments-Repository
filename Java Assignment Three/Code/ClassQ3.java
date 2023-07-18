/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: menu driven java program
*/
import java.util.*;
import java.lang.*;
public class ClassQ3{
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

        while(true){
            System.out.println("\n------------ Menu ------------");
            System.out.println("Your array is:");
            printArray(array);
            System.out.println("\n--------------------------------");
            System.out.println("Press 1 to counts the occurrences of a number");
            System.out.println("Press 2 to adjust the position of a number X");
            System.out.println("Press 3 to calculate the frequencies of all the numbers"); 
            System.out.println("Press 4 to replace a number by sum of next two numbers");
            System.out.println("Press 5 to shift an array by 2 numbers");
            System.out.println("Press 6 to Exit");
            
            int user2 = input.nextInt();
            if(user2 == 1){
                System.out.println();
                count(array);        
            }
            else if(user2 == 2){
                System.out.println();
                partition(array);        
            }
            else if(user2 == 3){
                System.out.println();
                duplicates(array);        
            }
            else if(user2 == 4){
                System.out.println();
                circular(array);        
            }
            else if(user2 == 5){
                System.out.println();
                shiftCircular(array);        
            }
            else if(user2 == 6){
                break;        
            }

        }
    }
    public static void printArray(int[] list){
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }   
    }
    public static void count(int[] count){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find its occurence! ");
        int user = input.nextInt();
        int occurence = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == user){
                occurence++;
            }
        }
        System.out.println(user + " occures " + occurence + " times ");

    }
    public static void partition(int[] count){
        int x = count[0];
        int temp = 0;
        for(int i = 0; i < count.length; i++){     
            for(int j = i+1; j < count.length; j++){     
               if(count[i] > count[j]) {    
                   temp = count[i];    
                   count[i] = count[j];    
                   count[j] = temp;    
               }          
            }     
        }
        System.out.println("The partioned array is: ");
        for(int i = 0; i < count.length; i++){
            System.out.print(count[i]);
        }
        System.out.println();


    }
    public static void duplicates(int[] count){
        System.out.println("-------------------------\nElements are: ");
        for(int i = 0; i < count.length; i++){
            System.out.print(count[i] + " ");                        
        }
        System.out.println("\n-------------------------\nOccurences are: ");  
        int[] newArray = new int[count.length];
        int check = -1;  
        int occurence = 0;  
        for(int i = 0; i < count.length; i++){  
            occurence = 1;
            for(int j = i+1; j < count.length; j++){  
                if(count[i] == count[j]){  
                    occurence++;    
                    newArray[j] = check;  
                }  
            }  
            if(newArray[i] != check)  
                newArray[i] = occurence;  
        }
        for(int i = 0; i < newArray.length; i++){  
            if(newArray[i] != check)  
                System.out.println(count[i] + " has occured " + newArray[i] + " time/s");  
        }    

    }
    public static void circular(int[] count){
        int[] newArray = new int[count.length];
        for(int i = 0; i != count.length; i++){     
            for(int j = i+1; j < count.length; j++){     
               newArray[j] = (count[i] + count[j]);            
            }     
        }
        System.out.println("The sum-ed array is: ");
        for(int i = 1; i < newArray.length; i++){
            System.out.print(newArray[i]);
        }
        System.out.println();
    }
    public static void shiftCircular(int[] count){
        int[] newArray = new int[count.length];
        int[] newArray2 = new int[2];
        for(int i = 0; i != count.length; i++){                 
            for(int j = i+2; j < count.length; j++){     
               newArray[j] = count[j];
            }     
        }
        for(int j = 0 ; j < 2; j++){
            newArray2[j] = count[j];
        }
        int[] finalArray = new int[(count.length) + 2];
        System.out.println("The shiffted array is 2: ");
        System.arraycopy(newArray, 0, finalArray, 0, count.length);  
        System.arraycopy(newArray2, 0, finalArray, count.length, newArray2.length);  
        for(int j = 2 ; j < finalArray.length; j++){
            System.out.print(finalArray[j]);
        }
        System.out.println();



    }
}