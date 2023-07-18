
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 5: Plindrome
*/
import java.util.Scanner;
public class String01{
        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next();

        int low = 0;
        int high = str.length() - 1;
        while(low < high){
                if(str.charAt(low) == str.charAt(high)){
                        low ++;
                        high --;        
                }
                
                else{
                        System.out.println("Not Palindrome");
                        break;

                }

                if (low >= high)
                    System.out.println("Is Palindrome");
        }           
    



    }       
}

