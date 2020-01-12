
public class Student {
	  
    int id;
    String name;
    
    public Student() {
    	id = -99;
    	name = "No Name";	
    }
    
    public String toString() {
    	return String.format("|%8s    |%5d  |", name, id); 
    }
        
    
    
}
