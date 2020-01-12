
public class EmployeeTest {

	public static void main(String[] args) {
				
		Employee employee2 = new Employee("Joe", "Smith", 1000);
		Employee employee3 = new Employee();
		

		employee2.displayInfo();
		
//		System.out.print(employee2.getFirstName());
		System.out.print(employee3.getLastName());
		
		employee3.setFirstName("\nEnter first name: ");
//		employee3.getFirstName();		
//		employee3.setLastName("Enter last name ");
//		employee3.getLastName();
//		employee3.displayInfo();
		System.out.print(employee3.getFirstName());
	}

}
