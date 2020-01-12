
public class TeacherTest {
	
	public static void main(String[] args) {
	    
		Teacher teacher1 = new Teacher();
		
		teacher1.inputName();
		teacher1.inputTID();
		teacher1.inputSalary();
		
		teacher1.printInfo();
		
		Teacher teacher2 = new Teacher("Hellen", 123, 1000) ;
		teacher2.printInfo();	
		
		
		
		
	}
	
	
	
	
	
}
