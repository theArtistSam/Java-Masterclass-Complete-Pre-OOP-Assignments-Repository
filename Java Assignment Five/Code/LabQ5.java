
/*
Name: Abdullah Mehdi	
Regstration No: SP21-BCS-OO2
Question 5: Tax Calculation   
*/

import java.util.Scanner;
public class LabQ5{
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in); 
	 	
	 	System.out.println("Enter your pay: ");
	 	double pay = input.nextDouble();

 		System.out.println("Enter your Name: ");
	 	String name = input.next();

	 	double fedralTax = pay * 0.15;
	 	double stateTax = pay * 0.035;
	 	double socialSecurity = pay * 0.0575;
	 	double medicalTax = pay * 0.0275;
	 	double pensionPlan = pay * 0.05;
	 	double healthInsurance = 75;
	 	double netPay = fedralTax + stateTax + socialSecurity + medicalTax + pensionPlan + healthInsurance;

	 	System.out.println("\n" + name);
	 	System.out.printf("%-25s $ %5.2f\n","Gross Amount:", pay);
	 	System.out.printf("%-25s $ %7.2f\n","Federal Tax:", fedralTax);
	 	System.out.printf("%-25s $ %7.2f\n","State Tax:", stateTax);
	 	System.out.printf("%-25s $ %7.2f\n","Social Security Tax:", socialSecurity);
	 	System.out.printf("%-25s $ %7.2f\n","Medicare/Medicaid Tax:", medicalTax);
	 	System.out.printf("%-25s $ %7.2f\n","Pension Plan:", pensionPlan);
	 	System.out.printf("%-25s $ %7.2f\n","Health Insurance:", healthInsurance);
	 	System.out.printf("%-25s $ %7.2f\n","Net Pay:", netPay);

	}	

}
