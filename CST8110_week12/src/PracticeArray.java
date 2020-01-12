import java.security.SecureRandom;

public class PracticeArray {
	
	public static void main(String [] args) {
	    //create an array
		int myArray[] = new int[20];
		int frequency [] = new int [2]; //for positive and negative
		
		//generate random number between -10 and 10
		SecureRandom rnd = new SecureRandom();
		
		//create the range: using loop
		int maxV = 10, minV = -10;
		for (int index = 0; index < myArray.length; index++) {
			int randomNumber = rnd.nextInt(maxV - minV+1) +minV ;
			myArray[index] = randomNumber;
		}
		
		//print an array: using loop
		for (int index = 0; index < myArray.length; index++) {
			System.out.print(myArray[index] + " ");
		}
		System.out.println();
		
		//find max value
		int max = Integer.MIN_VALUE;
		for (int index = 0; index < myArray.length; index++) {
			if(myArray[index]>max)
			max = myArray[index];
		}
		System.out.println("MAX = " + max);
		
		//frequency of positive and negative number
		for (int index = 0; index < myArray.length; index++) {
			if(myArray[index] >= 0) {
				frequency[0] = frequency[0] + 1; //positive counter is updating	
			} else {
				frequency[1] = frequency[1] + 1; //negative counter is updating	
			}			
		}
		System.out.println("Number of Positive values: " + frequency[0]);
		System.out.println("Number of Negative values: " + frequency[1]);		
		
		//test print stars
		printStars("Positive: ", frequency[0]);
		printStars("Negative: ", frequency[1]);
		
		printStars("Test 1: ", 10);
	}	
	
	public static void printStars(String msg, int numberOfStars) {
		System.out.print(msg);
		for (int i=1; i <= numberOfStars; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
