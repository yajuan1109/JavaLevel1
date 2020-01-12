
public class StudentTest {
    public static void main(String[] msg) {
    	
    	//create an array of Student type
    	Student students[] = new Student[3]; 
    	
    	for (int index=0; index < students.length; index++) {
    		students[index] = new Student(); // create the objects
    	}
    	
    	for (int index=0; index < students.length; index++) {
    		System.out.println(students[index]);
    	}
    	
    	
    }
}
