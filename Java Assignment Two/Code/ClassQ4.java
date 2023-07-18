
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Question 4: Printing Leap years
*/


public class ClassQ4{
        public static void main(String[] args) {

            int i;
            int j = 0;
            int count = 0;
            String s1 = "";
            for(i = 101; i <= 2100; i++){
                if(i % 4 == 0){
                    System.out.print(i + " ");
                    count++;
                    j++;    
                }
                if(j == 10){
                    System.out.print(" \n");
                    j = 0;
                }
                
                

                
            }
            System.out.println("The total number of leap years are: " + count);
            
    }
}

