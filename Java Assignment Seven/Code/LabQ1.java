/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Assignment: string array menu
*/
import java.util.*;
import java.lang.*;
public class LabQ1{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array! ");
        int length = input.nextInt();
        String[] array =  new String[length + 1];

        System.out.println("Enter the array elements! ");
        for(int i = 0; i < array.length; i++){
            String user1 = input.nextLine();
            array[i] = user1;
        }

        while(true){
            System.out.println("\n------------ Menu ------------");
            System.out.println("Your string array is:");
            printArray(array);
            System.out.println();
            System.out.println("    Press 1 to Calculate length of string");
            System.out.println("    Press 2 to Count number of words in string");
            System.out.println("    Press 3 to Check a string is palindrome");
            System.out.println("    Press 4 to Convert a string in lowercase.");
            System.out.println("    Press 5 to Convert a string in uppercase.");
            System.out.println("    Press 6 to Exit");
            
            int user = input.nextInt();
            if(user == 1){
                System.out.println();
                length(array);        
            }
            else if(user == 2){
                System.out.println();
                words(array);        
            }
            else if(user == 3){
                System.out.println();
                palindrome(array);        
            }
            else if(user == 4){
                System.out.println();
                lowercase(array);        
            }
            else if(user == 5){
                System.out.println();
                uppercase(array);        
            }
            else if(user == 6){
                break;        
            }
        }

        
    }
    public static void printArray(String[] list){
        for(int i = 0; i < list.length; i++){
            if(i == 0){
                System.out.println();    
            }
            else{
                System.out.println("    Index[" + (i) + "] " + list[i]);
            }
        }   
    }
    public static void length(String[] list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Index of the Array to find its total length");
        int user = input.nextInt();
        int length = 0;
        for(int i = 0; i < list.length; i++){
            if(i == user){
                length = list[i].length();
            }
        }
        System.out.print("The length of[" + user + "] is " + length);
    }
    public static void words(String[] list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Index to find the word count");
        int user = input.nextInt();
        int length0 = 0;
        int length1 = 0;

        for(int i = 0; i < list[user].length(); i++){
            if(list[user].charAt(0) == ' ' && list[user].charAt(i) == ' '){
                length0++;               
            }
            else if(list[user].charAt(i) == ' '){
                length1++;
            }
        }
        if(list[user].charAt(0) == ' '){
            System.out.print("The length of words is: " + length0);
        }
        else{
            System.out.print("The length of words is: " + (length1 + 1));   
        }
    }
    public static void palindrome(String[] list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Index to check the palindrome of String");
        int user = input.nextInt();
        String orignal = "";
        String reversed = "";
        
        // Storing String in orignal manner 
        for(int i = 0; i < list[user].length(); i++){
            orignal += list[user].charAt(i);
        }

        // Storing String in reversed manner
        for(int i = list[user].length() - 1; i > -1 ; i--){
            reversed += list[user].charAt(i);
        }

        // checking if it is palindrome
        if(orignal.equals(reversed)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
    public static void lowercase(String[] list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Index of the array for lowercase conversion ");
        String orignal = "";
        int user = input.nextInt();
        for(int i = 0; i < list[user].length(); i++){
            orignal += list[user].charAt(i);
        }
        System.out.println("Lowercase String is: " + orignal.toLowerCase());    
    
    }
    public static void uppercase(String[] list){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Index of the array for lowercase conversion ");
        String orignal = "";
        int user = input.nextInt();
        for(int i = 0; i < list[user].length(); i++){
            orignal += list[user].charAt(i);
        }
        System.out.println("Uppercase String is: " + orignal.toUpperCase());    
    
    }
}