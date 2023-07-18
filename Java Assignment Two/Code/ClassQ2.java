
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 2: CHECKING SUBSTRING
*/
import java.util.Scanner;
public class ClassQ2{
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();

        System.out.println("Enter another string");
        String str2 = input.next();


        char chr = 'a';
        char chr2 = 'a';

        for(int i = 0; i < str.length(); i++){
            chr = str.charAt(i);
            for(int j = 0; j < str2.length(); j++){
                chr2 = str2.charAt(j);
            }
                
        }

        if(chr2 <= chr){
            System.out.println(str2 + " is a substring of " + str);
            }
        else{
            System.out.println(str2 + " is not a substring of " + str);
        }    
        

        

        


    }       
}

