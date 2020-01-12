
public class CarTest {
	

	public static void main(String[] args) {
		
		Car carDefault = new Car();
		Car car1 = new Car("ABCD 123", 10, 50);
		Car car2 = new Car(car1);
		Car car3 = new Car();
		
		System.out.print("Default car attributes are: ");
		carDefault.displayCar();
		System.out.print("Initial car attributes are: ");
		car1.displayCar();
	    System.out.print("Copied car attributes are: ");
	    car2.displayCar();
	    car3.displayCar();
	    
	    System.out.println("\nUpdated car attributes are: ");
	    car3.inputPlate();
		car3.inputTime();
		car3.inputVelocity();
		car3.displayCar();	
		
		
        	
		
	}      	    	  
}
