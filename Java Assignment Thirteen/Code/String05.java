
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 8: Replacing Letters
*/

import java.util.Scanner;
public class String05{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence like in a String");
        String str = input.nextLine();

        String replace = str.replaceAll("h", "H");
        String s1 = str.substring(0, str.indexOf("h") + 1);
        String s2 = str.substring(str.lastIndexOf("h"), str.length());

        String r1 = replace.substring(replace.indexOf("H") + 1, replace.lastIndexOf("H"));

        String reduced = s1 + r1 + s2;
        System.out.println(reduced);

           
                

        



    
 }
        
}


