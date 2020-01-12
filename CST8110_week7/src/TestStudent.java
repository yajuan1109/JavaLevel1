
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student();  // create an object- using default constructor
		Student student2= new Student("Alex", 12345);  // create another object- using initial constructor
		
		
		System.out.println(student1);
		System.out.println(student2);
		
        student1.printResultSheet();
		student2.printResultSheet();
		
	}

}
