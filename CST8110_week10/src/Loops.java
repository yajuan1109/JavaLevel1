import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//lesson: invalid entry
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 10: ");
		int start = input.nextInt();
		
		//check if the integer input is more than 0, using while loop
		// ||- or 
		while (start < 1 || start >10) {
			System.out.println("Error: Eenter an integer between 1 and 10: ");
			start = input.nextInt();	
		}
		
		System.out.println("Valid entry: " + start);
		
		for (int i = start; i >=0; i --) {
			 System.out.print(i+" ");
		}
		System.out.println();
		// step down loop

	}

}
