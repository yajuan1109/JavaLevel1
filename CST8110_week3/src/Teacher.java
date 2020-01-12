/**
 * 
 * @author yaju0001
 * @version 1.0
 * since 9/30/2019
 * 
 */

import java.util.Scanner;

public class Teacher {
	
	String name;
	int TID;
	double salary;
	
	public void inputName() {
		/*
		Scanner input;
		input = new Scanner(System.in);
		*/		
		System.out.print("Enter the name: ");
		Scanner inputName = new Scanner(System.in);
		name = inputName.next();	
		
	    }
	
		public void inputTID() {			
		System.out.print("Enter the TID: ");
		Scanner inputTID =  new Scanner(System.in);
		TID = inputTID.nextInt();	
		
		}
		
		
		public void inputSalary() {	
		System.out.print("Enter the salary: ");
		Scanner inputSalary = new Scanner(System.in);
		salary = inputSalary.nextDouble();		
		
		}
		
	public void printInfo(){
		System.out.println("The name is " + name + "," +" the TID is " + TID + " and the salary is " + salary);
	}
	    
  
	public Teacher() {
		this.name = "No name";
		this.TID = 0;
		this.salary = 1;
	}
	
	public Teacher(String name, int TID, double salary) {
		this.name = name;
		this.TID = TID;
		this.salary = salary;
	}
	
	public Teacher(Teacher t) {
		this.name = t.name;
		this.TID = t.TID;
		this.salary = t.salary;
	}
	    
	
	
	}
    
    
    
    
    
