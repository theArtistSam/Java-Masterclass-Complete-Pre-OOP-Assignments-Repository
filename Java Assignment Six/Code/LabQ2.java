
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 2: Day of the year
*/
import java.util.Scanner;
public class LabQ2{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String today = "";

        String january = "January";
        String february = "February";
        String march = "March";
        String april = "April";
        String may = "May";
        String june = "June";
        String july = "July";
        String august = "August";
        String september = "September";
        String october = "October";
        String november = "November";
        String december = "December";


        System.out.println("Enter year");
        int year = input.nextInt();


        System.out.println("Enter first day of the year");
        int day = input.nextInt();

        for(int i = 1; i < 13; i++){

            // Assigning days
            if(day % 7 == 0){
            today = "Sunday";
            } 
            else if(day % 7 == 1){
                today = "Monday";   
            }
            else if(day % 7 == 2){
                today = "Tuesday";  
            }
            else if(day % 7 == 3){
                today = "Wednesday";    
            }
            else if(day % 7 == 4){
                today = "Thursday"; 
            }
            else if(day % 7 == 5){
                today = "Friday";   
            }
            else if(day % 7 == 6){
                today = "Saturday"; 
            }
    
            // calculation and final display
            if(i == 1){
                System.out.println(january + " 1 " + year + " is " + today);
                day += 31;
            } 
            else if(i == 2){
                if(year % 4 == 0){
                    System.out.println(february + " 1 " + year + " is " + today);   
                    day += 29;    
                }
                else{
                    System.out.println(february + " 1 " + year + " is " + today);   
                    day += 28;    
                }
                
            }   
            else if(i == 3){
                System.out.println(march + " 1, " + year + " is " + today);  
                day += 31;
            }
            else if(i == 4){
                System.out.println(april + " 1, " + year + " is " + today);    
                day += 30;
            }
            else if(i == 5){
                System.out.println(may + " 1, " + year + " is " + today); 
                day += 31;
            }
            else if(i == 6){
                System.out.println(june + " 1, " + year + " is " + today);   
                day += 30;   
            }
            else if(i == 7){
                System.out.println(july + " 1, " + year + " is " + today); 
                day += 31;
            }
            else if(i == 8){
                System.out.println(august + " 1, " + year + " is " + today);   
                day += 31;
            }
            else if(i == 9){
                System.out.println(september + " 1, " + year + " is " + today);    
                day += 30;
            }
            else if(i == 10){
                System.out.println(october + " 1, " + year + " is " + today); 
                day += 31;
            }
            else if(i == 11){
                System.out.println(november + " 1, " + year + " is " + today);   
                day += 30;
            }
            else if(i == 12){
                System.out.println(december + " 1, " + year + " is " + today); 
                day += 31;
            }
        
               
        }

    }       
}

