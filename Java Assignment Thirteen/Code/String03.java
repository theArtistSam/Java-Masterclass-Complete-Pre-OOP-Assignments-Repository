
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 7: Letter of interest
*/


import java.util.Scanner;
public class String03{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a two strings with a space");
        String str = input.next();
        if(str.indexOf("f") < 0 || str.lastIndexOf("f") < 0){
                System.out.println("");
        }
        else{
                System.out.println(str.indexOf("f") + " " + str.lastIndexOf("f"));
        }
                

        



    
 }
        
}
