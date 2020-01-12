import java.util.Scanner;

public class Employee {
	
	String firstName, lastName;
	double salary;
	
	Scanner input = new Scanner(System.in)
			;
	public Employee() {
		this.firstName = "Unknown";
		this.lastName = "Unknown";
		this.salary = 100;
	}
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public String getFirstName() {
		//System.out.print(msg);
		return firstName; //= input.next();
	}
	
	public String getLastName() {
		//System.out.print(msg);
		return lastName; //= input.next();
		
	}
	
	public void setFirstName(String msg) {
		System.out.print(msg);
		this.firstName = input.next();
	}
	
	public void setLastName(String msg) {
		System.out.print(msg);
		this.lastName = input.next();
	}

	public void displayInfo() {
		System.out.print("First name is " + this.firstName + 
				"\nLast name is " + this.lastName +
				"\nSalary is " + this.salary);				
	}
}
