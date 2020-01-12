import java.util.Scanner;

public class Cost {

	double itemCost;
	char itemType;
	char taxType;

	Scanner input = new Scanner(System.in);
	
	public void calcCost(){
		if (itemType == 's') {
			itemCost *= 0.75;
		} 
		
		if (taxType == 'h') {
			itemCost *= 1.13;
		} else if (taxType == 'g') {
			itemCost *= 1.07;
		}	
	}
	
	public void getItemCost() {
		System.out.print("Enter item cost: ");
		itemCost = input.nextDouble();
	}
	

}
