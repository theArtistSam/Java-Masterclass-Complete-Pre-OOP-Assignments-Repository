
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Arrays
*/
import java.util.*;
import java.lang.*;
public class Array1{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            
          /*  // declaration of different data types
            int[] array1 = new int[5];
            double[] array2 = new double[5];
            char[] array3 = new char[5];
            String[] array4 = new String[5];
            boolean[] array5 = new boolean[5]; 
            
            System.out.println();

            // initialization
            // default value of int type
            System.out.println("Int Value before initialization");
            for(int i = 0; i < array1.length; i++){
                System.out.println(array1[i]); 
            }
            System.out.println("Int Value after initialization");
            array1[0] = 1;
            array1[1] = 2;
            array1[2] = 3;
            array1[3] = 4;
            array1[4] = 5;
            
            for(int i = 0; i < array1.length; i++){
                System.out.println(array1[i]); 
            }

            System.out.println();
            System.out.println("Double Value before initialization");
            // default value of int type
            for(int i = 0; i < array2.length; i++){
                System.out.println(array2[i]); 
            }
            System.out.println("Double Value after initialization");
            array2[0] = 1.0;
            array2[1] = 2.0;
            array2[2] = 3.0;
            array2[3] = 4.0;
            array2[4] = 5.0;
            for(int i = 0; i < array2.length; i++){
                System.out.println(array2[i]); 
            }
            System.out.println();
            System.out.println("Char Value before initialization");
            // default value of int type
            for(int i = 0; i < array3.length; i++){
                System.out.println(array3[i]); 
            }
            System.out.println("Char Value after initialization");
            array3[0] = 'A';
            array3[1] = 'B';
            array3[2] = 'C';
            array3[3] = 'D';
            array3[4] = 'E';
            for(int i = 0; i < array3.length; i++){
                System.out.println(array3[i]); 
            }
            System.out.println();
            // default value of int type
            System.out.println("String Value before initialization");
            for(int i = 0; i < array4.length; i++){
                System.out.println(array4[i]); 
            }
            System.out.println("String Value after initialization");
            array4[0] = "Hello";
            array4[1] = "Hola";
            array4[2] = "Okay";
            array4[3] = "camo estas";
            array4[4] = "sarangae";
            for(int i = 0; i < array4.length; i++){
                System.out.println(array4[i]); 
            }
            System.out.println();
            // default value of int type
            System.out.println("Boolean Value before initialization");
            for(int i = 0; i < array5.length; i++){
                System.out.println(array5[i]); 
            }
            array5[0] = true;
            array5[1] = false;
            array5[2] = true;
            array5[3] = false;
            array5[4] = true;
            System.out.println("Boolean Value after initialization");
            for(int i = 0; i < array5.length; i++){
                System.out.println(array5[i]); 
            }

            //initializing and declaring by user
            int[] arrayUser = new int[5];
            System.out.println("Enter the values of Array");
            for(int i = 0; i<arrayUser.length; i++){ // storing the values
                int user = input.nextInt();
                arrayUser[i] = user;    
            }
            
            for(int i = 0; i < arrayUser.length; i++){ // printing the values
                System.out.print(arrayUser[i]);
            }

            // initializing by random number
            int[] arrayRandom = new int[5];
            for(int i = 0; i<arrayUser.length; i++){ // storing the values
                int user = (int)(Math.random() * 10);
                arrayRandom[i] = user;    
            }
            System.out.println();
            System.out.println("Random values of array are:");
            for(int i = 0; i < arrayRandom.length; i++){ // printing the values
                System.out.print(arrayRandom[i]);
            }

            int[] arrayLargest = new int[5];
            int previous = 0;
            int largestValue = 0;
            System.out.println("Enter the values of Array");
            for(int i = 0; i < arrayLargest.length; i++){
                int user = input.nextInt();
                arrayLargest[i] = user;
                int largest = arrayLargest[i];
                // System.out.println(largest);
                if(largest > previous){
                    largestValue = largest;
                }
                previous = largestValue;
            }
            System.out.println("The largest value of the array is: " + largestValue);

            // index of the largest value of the array
            int[] arrayLargest = new int[5];
            int previous = 0;
            int largestValue = 0;
            int index = 0;
            System.out.println("Enter the values of Array");
            for(int i = 0; i < arrayLargest.length; i++){
                int user = input.nextInt();
                arrayLargest[i] = user;
                int largest = arrayLargest[i];
                // System.out.println(largest);
                if(largest > previous){
                    largestValue = largest;
                    index = i;
                }
                previous = largestValue;
            }

            System.out.println("Index of latgest value of the array is: " + index);

            // smallest value of the array
            int[] arraySmallest = new int[5];
            int previous = 0;
            int smallestValue = -1;
            System.out.println("Enter the values of Array");
            for(int i = 0; i < arraySmallest.length; i++){
                int user = input.nextInt();
                arraySmallest[i] = user;
                int smallest = arraySmallest[i];
                if(smallest < previous){
                    smallestValue = smallest;
                }
                previous = smallest;
            }
            System.out.println("The smallest value of the array is: " + smallestValue);
          
            // Calculating the average of array elements!
            int[] averageArraySize = new int[5];
            int average = 0;
            System.out.println("Enter the values of Array");
            for(int i = 0; i < averageArraySize.length; i++){
                int user = input.nextInt();
                averageArraySize[i] = user;
                average = average + averageArraySize[i]; 
            }
            System.out.println("The average of array elements is: " + average);
            System.out.println("The average of array elements is: " + (double)(average / averageArraySize.length) );
*/
            /*int[] randomArraySize = new int[7];
            int temp;
            System.out.println("Before shuffling the array");
            for(int i = 0; i < randomArraySize.length; i++){
                Random random = new Random(); 
                int randomDigits = random.nextInt(randomArraySize.length);
                // before shuffling
                randomArraySize[i] = randomDigits;
                System.out.print(randomArraySize[i]);
                temp = randomArraySize[randomDigits];
                randomArraySize[randomDigits] = randomArraySize[i];
                temp = randomArraySize[i];
            }
            System.out.println();
            System.out.println("After shuffling the array");
            for(int i = 0; i < randomArraySize.length; i++){
                System.out.print(randomArraySize[i]);
            }*/

            // linear search
            /*int[] myList = {1, 9, 5, 4, 2, 6};
            System.out.println("Enter the value you want the index of: ");
            int userKey = input.nextInt();
            for(int i = 0; i < myList.length; i++){
                if(myList[i] == userKey){
                    System.out.print("The index of the matching value is: " + i);
                }

            }    

            System.out.println();

            // binary search
            int low = 0;
            int high = myList.length - 1;
            int mid = 0;
            while(high >= low){
                mid = (low + high) / 2;
                if(userKey == myList[mid]){
                    userKey = mid;
                    break;
                }
                else if(userKey < myList[mid]){
                    high = mid - 1;
                }
                else if(userKey > myList[mid]){
                    low = mid + 1;
                }
                else{
                    userKey = -1;
                }
                
            }
            System.out.println("The index of the matching value is: " + mid);
*/
           /* // selection sort
            double[] myList = {1, 9, 4.5, 6.6, 5.7, -4.5};
            for(int i = 0; i < myList.length; i++){
                double currentMin = myList[i];
                int currentMinIndex = i;

                for(int j = i + 1; j < myList.length; j++){
                    if(currentMin > myList[j]){
                        currentMin = myList[j];
                        currentMinIndex = j;
                    }
                }
            if(currentMinIndex != i){
                myList[currentMinIndex] = myList[i];
                myList[i] = currentMin;
            }
            System.out.println(myList[i]);    
            }*/
    }       
}

