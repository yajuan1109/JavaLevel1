import java.text.DecimalFormat;
import java.util.Scanner;

public class Car {
      
	String plate;
	int time;
	double velocity;
	
	public Car() {
		this.plate = "AAA 111";
		this.time = 10;
		this.velocity = 98;
	}       //default constructor
	
	public Car(String plate, int time, double velocity) {
		this.plate = plate;
		this.time = time;
		this.velocity = velocity;
	}      // initial constructor
	
	public Car(Car c) {
		this.plate = c.plate;
		this.time = c.time;
		this.velocity = c.velocity;
	}   // copy constructor
	
	public void inputPlate() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the plate: ");
		plate = input.nextLine();
	}
	
	public void inputTime() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time: ");
		time = input.nextInt();
	}
			
	public void inputVelocity() {
		Scanner input =  new Scanner(System.in);
		System.out.print("Enter the velocity: ");
		velocity = input.nextDouble();
	}
	
	public double calcAcceleration() {
		return velocity/time;
    }
	
	DecimalFormat df =  new DecimalFormat("#0.00"); 
	
	public void displayCar() {
		System.out.println("Plate is " + plate +
				                        " with time of " + time +
				                        ", velocity of " + velocity +
				                        " and acceleration of " + df.format(calcAcceleration()));
	}
	
//		public void displayUpdatedCar() {
//			System.out.println("Plate is " + plate +
//					                        " with time of " + time +
//					                        ", velocity of " + velocity +
//					                        " and acceleration of " + df.format(calcAcceleration()));	
//	}
//	
}
