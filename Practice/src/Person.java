
public class Person {
	
	private String firstName;
	private String lastName;
	private int birthDate;
	
	public Person(String firstName, String lastName, int birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate =  birthDate;
	}
	
	public Person() {
		this("unknown", "unknown", -9); 
		}
	public Person(int birthDate) { 
		this("unknown", "unknown", birthDate); 
		}
	public Person(String firstName, String lastName) {
		this(firstName, lastName, -1);	
		}
	
	public void displayPerson() {
		System.out.print("First Name: " + firstName + "\nLast Name: "
				+ lastName + "\nBirthday: " + birthDate);
	}
}
