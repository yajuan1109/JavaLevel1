
public class TeacherTest {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		Teacher teacher2 = new Teacher(1001, "John", 7000, 20);
		Teacher teacher3 = new Teacher();

		teacher3.getInfo();
		System.out.println();
		
		teacher1.calcNetSalary();
		teacher1.displayInfo();
		
		teacher2.calcNetSalary();
		teacher2.displayInfo();
		
		teacher3.calcNetSalary();
		teacher3.displayInfo();
	}

}
