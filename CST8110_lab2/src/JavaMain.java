
import java.text.DecimalFormat;
import java.util.Scanner; //program uses class Scanner

/**
 * This program prompts the user to enter a number and then display the entered number
 * 
 * @author Anu Thomas
 * @version 1.0
 * @since 2019-09-03 CST8110 Introduction to Programming
 */
public class JavaMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		System.out.print("This program reads a number and displays it. \nEnter the number: ");
		number1 = input.nextInt();
		System.out.println("The number is " + number1);
		
		System.out.print("Enter the number: ");
		number2 = input.nextInt();
		System.out.print("The number is "+number2);
		
		number3 = number1 + number2;
		System.out.print("\nThe sum of " +
		                  number1 +
		                  " and " +
		                  number2 +
		                  " is " +
		                  number3);

		input.close();
		System.out.println();
		double pi = 3.1415926;
		
		System.out.printf("%.2f\n", pi);
		System.out.printf("%.3f\n", pi);
		
		DecimalFormat formatter =  new DecimalFormat();   //required import; declare a new variable
		formatter.applyPattern("#.##");    
		System.out.printf(formatter.format(pi));
		
		
		
	} // end of main

} // end of class
