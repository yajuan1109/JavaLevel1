
public class Course {
	
       private String courseID;
       private double marks;
       
       public Course() {
    	   this.courseID = "No ID";
    	   this.marks = -1.0;
       }
       
       public Course(String courseID, double marks) {
    	   this.courseID = courseID;
    	   this.marks = marks;
       }
       

	public String toString() {
    	   return String.format("%8\t%.2f", courseID, marks);
       }
       
}
