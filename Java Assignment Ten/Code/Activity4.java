
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Activity 2: Fixing and Showing the outputs of degrees and radians
*/

public class Activity4{
	 public static void main(String[] args) {


	 	 String s1 = "Degrees";
	 	 String s2 = "Radians";
	 	 String s3 = "Sine";
	 	 String s4 = "Cosine";
	 	 String s5 = "Tangent";

		 // Display the header of the table using System.out.printf()
		 int degrees = 30;
		 double radians = Math.toRadians(degrees);
		 double sin = Math.sin(radians);
		 double cos = Math.cos(radians);
		 double tan = Math.tan(radians);
		 // Display the Data of the table using System.out.printf()
	 	
	 	 System.out.printf("%-1s %-1s %-1s %9s %8s\n", s1, s2, s3, s4, s5);
	     System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f\n", degrees, radians, sin, cos, tan);
		 
		 degrees = 60;
		 radians = Math.toRadians(degrees);
		 sin = Math.sin(radians);
		 cos = Math.cos(radians);
		 tan = Math.tan(radians);
	     // Display the Data of the table using System.out.printf()

	     System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f\n", degrees, radians, sin, cos, tan);
	     
 
	 }
}
