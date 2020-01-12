
public class TestPurchase {
      public static void main( String [] args) {
    	    Purchase object= new Purchase(.13);
    	    
    	    do {
    	    	   object.menu();	
    	    }while(object.processMenu());
      }
}
