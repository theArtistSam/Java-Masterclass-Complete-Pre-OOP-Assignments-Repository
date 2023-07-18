
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 10: Multiple varients of a given string
*/
import java.util.Scanner;
public class String06{
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();

        System.out.println(str.charAt(3));
        System.out.println(str.charAt(str.length()-3));
        System.out.println(str.substring(0, str.length()));
        System.out.println(str.substring(0, str.length()-2));

        for(int i = 0; i < str.length(); i++){
                if(i % 2 == 0){
                        System.out.print(str.charAt(i));
                }       
        }

        System.out.println();
        
        for(int i = 1; i < str.length(); i++){
                if(i % 2 == 1){

                        System.out.print(str.charAt(i));
                }                
        }

        System.out.println();

        for(int i = str.length()-1; i >= 0; i--){
                System.out.print(str.charAt(i));
        }

        System.out.println();

        for(int i = str.length()-1; i >= 0; i--){
                if(i % 2 == 0){
                        System.out.print(str.charAt(i));
                }
        }
        System.out.println();
        System.out.println(str.length());
                     


        



    }
        
}

