
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 1: Social security numebr
*/
import java.util.Scanner;
public class ClassQ1{
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your SSN");
        String str = input.next();

        String fHyphen = str.substring(3, 4);
        String sHyphen = str.substring(6, 7);

        if(str.length() == 11 && fHyphen.equals("-") && sHyphen.equals("-")){
            System.out.println(str + " is a valid social security number");
        }
        else{
            System.out.println(str + " is not a valid social security number");
        }

        

        


    }       
}

