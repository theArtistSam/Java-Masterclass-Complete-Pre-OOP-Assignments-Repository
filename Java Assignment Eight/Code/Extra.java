/*
Regstration No: SP21-BCS-OO2
Lab Assignment: suming diagonal elements  
*/
import java.io.*;
import java.util.*;
import java.lang.*;
public class Extra{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String a = "shoe";
        String b = "cold";
        String c = ""; 


        for(int i = 0; i < a.length(); i++){
            c += a.charAt(i);
            c += b.charAt(i);   
        }

        System.out.println(c);
    }

}        
