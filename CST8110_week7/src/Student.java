import java.util.Scanner;

public class Student {
	
	   // use instance variables to identify object. 
	   // in this practice, we use two features of the object: name and student ID
       private String name;    // instance variable1: name
       private int SID;    // instance variable2: student ID
       
       Course course1, course2, course3;  //reference object
       Scanner input= new Scanner(System.in);
       
       public Student() {
    	   this.name = "No name";
    	   this.SID = -1;
       }
	
       public Student(String name, int SID) {
    	   this.name = name;
    	   this.SID = SID;  
       }
	
	  public String toString() {   // format method
		   
		   return String.format("Student's Name:   %10s  %nStudent's      ID:   %10s %n", name, SID);
				   //%10- no more than 10 character
				   //s- String
		           //%n- new line (format method)
	   } 

	  public void imputCourse1() {
		  System.out.print("Enter Course ID of course 1: ");
		  String id = input.next();
		  System.out.print("Enter obtain marks: ");
		  double m = input.nextDouble();
		  course1 = new Course (id, m);  //create an object using initial constructor
	  }
	  
	  public void imputCourse2() {
		  System.out.print("Enter Course ID of course 2: ");
		  String id = input.next();
		  System.out.print("Enter obtain marks: ");
		  double m = input.nextDouble();
		  course2 = new Course (id, m); 
	  }
	  
	  public void imputCourse3() {
		  System.out.print("Enter Course ID of course 3: ");
		  String id = input.next();
		  System.out.print("Enter obtain marks: ");
		  double m = input.nextDouble();
		  course3 = new Course (id, m);  
	  }
	  
	  public void printResultSheet() {
		  System.out.println("\tRestult Sheet"); // \t-tab
		  System.out.println("==========================");
		  System.out.println(toString());
		  System.out.println("Course ID\tMarks");
		  System.out.println("-----------------------------------------");
		  
	  }
	  
}
