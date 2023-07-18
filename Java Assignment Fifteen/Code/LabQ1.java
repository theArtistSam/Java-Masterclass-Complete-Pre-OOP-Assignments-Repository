/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Recurrsion   
*/
import java.util.*;
import java.lang.*;
public class LabQ1{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter a Number");
        int num = input.nextInt();

        System.out.println("Enter the power");
        int pow = input.nextInt();

        System.out.println(powerMethod(num, pow));



    }
    public static int powerMethod(int a, int n){
        if(a == 0){
            return 1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return a * powerMethod(a,n-1);

        }
    }
    
    
}