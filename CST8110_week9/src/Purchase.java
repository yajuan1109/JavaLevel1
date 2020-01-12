import java.util.Scanner;

public class Purchase {
      private double taxRate;
      
      Scanner input = new Scanner(System.in);
      
      public Purchase(double taxRate) {
    	  this.taxRate = taxRate;    
      }     
      //initial constructor
      
      public void menu() {
    	  System.out.println("\nSelect:");
    	  System.out.println("1) To purchase an item");
    	  System.out.println("2) To print receipt");
    	  System.out.println("3) To exit");
      }
      
      public int getOneIntegerInput(String msg) {
  		System.out.println(msg);
  		return input.nextInt();
  	}
      
      public boolean processMenu() {    //method type: boolean -> return true or false
    	  //System.out.println ("Select an action-->");
    	  //int select =  input.nextInt();
    	  int select = getOneIntegerInput("Select an action -->");
    	  if (select == 1) {
    		  System.out.println("Call your purchase item method here");
    		  return true;
    	  }else if  (select == 2) {
    		  System.out.println("Pring your receipt here");
    		  return true;
    	  }else if (select ==3) {
    		  System.out.println("Good Bye !");
    		  return false;
    	  }else {
    		  System.out.println("Wrong entry!");
    		  return true;
    	  }
    	        	  
      }
}
