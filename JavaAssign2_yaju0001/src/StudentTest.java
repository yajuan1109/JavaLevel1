/**
* @author Yajuan Wang
* @section 310 
* @teacher Carolyn Maclasaac 
*/


import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
			
		Student.displayTitle();  	
		
		System.out.print("Enter number of students: ");	
		final int numStudents;
		
		Scanner input = new Scanner(System.in);
		
		numStudents = input.nextInt();
		
		Student []students = new Student[numStudents];
		
    	for (int i=0; i < numStudents; i++) {
    		students[i] = new Student();
   		    System.out.println("\nEnter details of Student " + (i+1) );		
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    		students[i].readStudentDetails();
    		students[i].calculateGpa();     		
    	}

    	Student.displayHeader();  
		for (int i=0; i < numStudents; i++) {
			students[i].displayStudentDetails();
		}
				
	}
}
