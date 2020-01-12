/**
* @author Yajuan Wang
* @section 310 
* @teacher Carolyn Maclasaac 
*/

import java.util.Scanner;

public class Student {
    private long studNumber;
    private String firstName, lastName;
    private double marks[];
    private double totalMarks, totalBonus, gpa;
    private static final int NUMBER_MARKS = 3;
    private double percent;
    private String gradeLetter;
    private Scanner input;
    private String fullName;
    
    
    
    public Student() {
    	marks  = new double[ NUMBER_MARKS];
    	totalMarks = 0.0;
    	totalBonus = 0.0;
		gpa = 0.0;
    	input = new Scanner(System.in);
    	for (int i= 0; i < NUMBER_MARKS; i++) {
    		marks[i] = 0.0;
    	}
    }    // initialization
    
	public void readStudentDetails(){
		System.out.println();
	    System.out.print("Enter Student Number: ");
	    studNumber = input.nextLong();
	    System.out.print("Enter first name: ");
	    firstName = input.next();
	    System.out.print("Enter last name: ");
	    lastName = input.next();
	    fullName = firstName + " " + lastName;
	    readMarks();
	    readBonuses();		   
    }  //get info from user
    
    private void readMarks(){
    	for (int i=0; i<marks.length; i++) {  		
			System.out.print("Enter mark " + (i+1) +": ");
        	marks[i] = input.nextDouble();
    	    while (marks[i]<0 || marks[i]>100) {
    			System.out.print("Marks should be within 0 and 100. Please renter.");
    			System.out.print("\nEnter mark " + (i+1) +": ");
    			marks[i] = input.nextDouble();  
    		}
    		totalMarks += marks [i];   		
    	}
    }  //get info from user
	
	private void readBonuses() {	
		System.out.print("Enter number of bonuses (should not be greater than 5): ");
		int x = input.nextInt(); //x is the number of bonus
		while (x>5) {
			System.out.print("Number of bonuses should not be greater than 5!!!\n\n"
					+ "Enter number of bonuses (should not be greater than 5):");
			x = input.nextInt();
		}
		for (int i=0; i<x; i++) {
			double bonus[] = new double [i];
			System.out.print("Enter bonus " + (i+1) + " : ");
			bonus[i] = input.nextDouble();
			totalBonus += bonus[i];
		}		
	}
	

	
	public void calculateGpa() {
		    convertBonus();
			totalMarks += totalBonus;
			gpa = (totalMarks / (NUMBER_MARKS * 100)) * 4;
			if (gpa> 4) {
				gpa =4;
			}
			if (checkEligibility() == false) {
				gpa = 0;
			}
			findGradeLetter(); 
	}
	
	
	private double convertBonus() {
		if (totalBonus <= 15) {
			 totalBonus = (totalBonus/15)*2;
		} else {
			totalBonus = 2;
		} return totalBonus;
	}
	
	
	private double calculatePercentage() {
		percent =  (totalMarks / (NUMBER_MARKS * 100)) * 100;
		return percent;
	}
	
	
	private  String findGradeLetter() {			
		calculatePercentage(); 	
		if (checkEligibility() == false) {
			gradeLetter = "F";
		} else {
		    if (percent >=90) {
			    gradeLetter = "A+"; 
		    } else if (percent >= 85 && percent <=89) {
			    gradeLetter = "A"; 
		    } else if (percent >= 80 && percent <85) {
			    gradeLetter = "A-"; 
		    } else if (percent >= 77 && percent <80) {
			    gradeLetter = "B+"; 
		    } else if (percent >= 73 && percent <77) {
			    gradeLetter = "B"; 
		    } else if (percent >= 70 && percent <73) {
			    gradeLetter = " B-"; 
		    } else if (percent >= 67 && percent <70) {
			    gradeLetter = "C+"; 
		    } else if (percent >= 63 && percent <67) {
			    gradeLetter = "C"; 
		    } else if (percent >= 60 && percent <63) {
				gradeLetter = "C-"; 
			} else if (percent >= 57 && percent <60) {
				gradeLetter = "D+"; 
			}  else if (percent >= 53 && percent <57) {
				gradeLetter = "D"; 
			} else if (percent >= 50 && percent <53) {
				gradeLetter = "D-"; 
			}		
		}
			return gradeLetter;		
	}
	
	private boolean checkEligibility() {
		boolean result = true;  
		for (int i =0; i<NUMBER_MARKS; i++) {
			if (marks[i]<50) {
				result = false;
			}
		} return result;		
	}
	
	private String output() {
		return String.format("\n%10d     |%15s     |%12.2f    |%5.2f |%9s      |", studNumber, fullName, totalMarks, gpa, findGradeLetter());
	}
	
	public void displayStudentDetails() {	 
		    System.out.print(output());     
			if (checkEligibility() == false) {
			System.out.print("\tNOTE: Failed one or more courses");			
		}		
			System.out.println();
	}
	
	public static void displayTitle() {
		System.out.println("GPA CALCULATOR");
		System.out.println("==============");
	}
	
	private static void printStar() {
		int starNumb = 77;
		System.out.println();
		for (int i = 0; i< starNumb; i++) {			
			System.out.print("*");
		}
	}
	
	private static void printDash() {
		int dashNumb = 77;
		System.out.println();
		for (int i = 0; i< dashNumb; i++) {
			System.out.print("-");
		}
	}
	
	public static void displayHeader() {	
		System.out.println();
		printStar();
		System.out.printf("\n%42s", "MARK LIST");
		printStar();
		System.out.printf("\n%15s|%12s        |%13s   | %4s |%13s  |", "Student Number", "Name", "Toal Marks", "GPA", "Grade Letter");
		printDash();
		System.out.println();
	}
	
}

