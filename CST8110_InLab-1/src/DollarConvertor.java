import java.util.Scanner;

public class DollarConvertor {

	public static void main(String[] args) {
		float usd;
		float rate;
		
		System.out.println("This program, written by Yajuan Wang, will calculate how many Canadian dollars you can get from \nsome US dollars.");
		System.out.print("Enter the number of US dollars you have: ");
		Scanner input = new Scanner(System.in);
		usd = input.nextFloat();
		
		System.out.print("Enter the current exchange rate: ");
		rate = input.nextFloat();
		
		System.out.println("$" + usd + 
				                        " US equals $" + usd*rate + 
				                        " CAN");
        input.close();
	}

}
