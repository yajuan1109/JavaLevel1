import java.util.Scanner;

public class Teacher {
    private long teacherID;
    private String teacherName;
    private double salary, incomeTaxRate, netSalary;
    
    Scanner input = new Scanner(System.in);
    
    public Teacher() {
    	teacherID = 11111;
    	teacherName = "No Name";
    	salary = 2000;
    	incomeTaxRate = 5;
    }
    
    public Teacher(long teacherID, String teacherName, double salary, double incomeTaxRate) {
    	this.teacherID = teacherID;
    	this.teacherName = teacherName;
    	this.salary = salary;
    	this.incomeTaxRate = incomeTaxRate;
    }
    
    public void getInfo() {
    	System.out.print("Enter Teacher ID: ");
    	teacherID = input.nextLong();
    	System.out.print("Enter Teacher name: ");
    	teacherName = input.next();
    	System.out.print("Enter salary: ");
    	salary = input.nextDouble();
    	while (salary<0) {
    		System.out.print("salary cannot be negative. Please reneter: ");
    		salary = input.nextDouble();
    	}
    	System.out.print("Enter Income tax in percentage: ");
    	incomeTaxRate = input.nextDouble();
    	while (incomeTaxRate<0) {
    		System.out.print("Interest percent cannot be negative. Please reneter: ");
    		incomeTaxRate = input.nextDouble();
    	}
    }
    
    public void calcNetSalary() {
    	netSalary = salary - salary*incomeTaxRate/100;
    }
    
    public void displayInfo() {
    	System.out.printf("ID: %10d\t  Name: %+10s\t  Salary: %8.2f\t  Income Tax: %5.2f\t  Net-salary: %8.2f\t", 
    			                     teacherID, teacherName, salary, incomeTaxRate, netSalary);
    	if(netSalary>5000) {
    		System.out.println("Academic Chair");
    	}else if (netSalary<=5000 && netSalary >4000) {
    		System.out.println("Full-time Teacher");
    	}else {
    		System.out.println("Part-Time Teacher");
    	}
    }
}
