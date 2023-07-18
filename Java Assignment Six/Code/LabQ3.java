
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 1: Timing
*/

import java.util.Scanner;
public class LabQ3{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String abc = "";
        String abc2 = "";
        String abc3 = "";

        System.out.println("Enter a sentence");        
        String str3 = input.nextLine();
        int space = str3.indexOf(" ");

        abc = capitalize(str3.substring(0, str3.indexOf(" "))) + " ";
        abc3 = capitalize(str3.substring(str3.lastIndexOf(" ") + 1, str3.length()));
        for(int i = 0; i< str3.length(); i++){
            if(str3.substring(i, i + 1).equals(" ") && i > space){
                abc2 = abc2 + capitalize(str3.substring(space + 1, i)) + " ";
                space = i;
                
            }
                    
        }
        System.out.println(abc + abc2 + abc3);        
        
        System.out.println("Enter a string");        
        String str = input.next();
        System.out.println(capitalize(str));

    }   

    public static String capitalize(String s){
        String str1 = s.substring(0, 1);
        String str2 = s.substring(1, s.length());
        String s2 = str1.toUpperCase() + str2;
        return s2;
    }    
}

