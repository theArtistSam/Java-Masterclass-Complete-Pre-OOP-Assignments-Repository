
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 5: Area of a pentagon 
*/
import java.util.*;
import java.lang.Math;
public class LabQ5{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");        
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));

        }   

        public static double area(double side){
            
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
        return area;
    }    
}

