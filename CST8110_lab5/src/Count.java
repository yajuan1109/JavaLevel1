import java.util.Scanner;

public class Count {
	
	private int startNum;
	private int startSize;
	int option;
	Scanner input = new Scanner(System.in);
	

	Count(){
		this.startNum = 0;
		this.startSize = 0;
	}
	
	public void getValuesFromUser(){
		System.out.print("\nEnter the start value: ");
		startNum = input.nextInt();
		while(startNum <=0) {
			System.out.print("Invalid entry...Enter the start value: ");
			startNum = input.nextInt();	
		}
		System.out.print("Enter the countdown step size: ");
		startSize = input.nextInt();
		while(startSize <=0) {
			System.out.print("Invalid entry...Enter the countdown step size: ");
			startSize = input.nextInt();	
		}	
	}
	
	public void displaySteps() {
		System.out.println("The numbers are: " );
		for(int i = startNum; i>=0; i -= startSize) {
			System.out.print(i + "  ");
		}
	}
	
	public void displayMenu() {
		System.out.println("\n\n1) Display Count" + "\n2) Exit");
		System.out.print("\nEnter your selection: ");
	}
	
	public boolean processMenu() {
		option = input.nextInt();
		if(option ==1) {
			getValuesFromUser();
			displaySteps();
			return true;
		} else if (option ==2) {
			System.out.println("\nGoodbye!");
			return false;
		} else {
			System.out.println("\n*** INVALID ENTRY ***");
			return true;
		}
	}


}
