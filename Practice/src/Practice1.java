import java.security.SecureRandom;
import java.util.Scanner;

public class Practice1 {
	
	static Scanner input = new Scanner(System.in);
	
	static void print(String msg) {
		System.out.println(msg);
	}
	
	
	
	public static void main(String[] args) {
		SecureRandom rnd;
		rnd = new SecureRandom();

		final int MAX_RANDOM_NUMBERS = 3;

		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;
    
        
		for (int i =0; i < MAX_RANDOM_NUMBERS; i++){
		    int number = rnd.nextInt();
		    if (number == 0){
		       countZero++;
		    } else if (number ==1) {
		       countOne++;
		    } else {
		       countTwo++;
		    }
		    System.out.println(number);
		}
		
        print("\n0: " + countZero + "\n1: " + countOne + "\n2: "+ countTwo);
		
	}


	
}