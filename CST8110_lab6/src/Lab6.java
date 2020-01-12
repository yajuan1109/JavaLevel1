import java.security.SecureRandom;

public class Lab6 {
	
	private static final int TOTAL_NUMBERS = 100;
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 0;
	private static final int NUMBER_OF_RANGES = 6;
    static int temperatureData[ ] = new int [TOTAL_NUMBERS];
    static int frequencyOfTemp[ ] = new int [NUMBER_OF_RANGES];
    int maxTemp = MIN_VALUE;
    int minTemp = MAX_VALUE;
    static int sum = 0;
    static double averageTemp = 0.0;
    
    private static void print(String msg, int numberOfStars) {
    	System.out.print(msg);
    	for (int i = 0; i < numberOfStars; i++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
    	
    	SecureRandom rnd = new SecureRandom();
    	
		int maxV = 40, minV = -40;
		for (int i = 0; i <TOTAL_NUMBERS; i++) {
			int randomNumber = rnd.nextInt(maxV - minV+ 1) + minV;
			temperatureData[i] = randomNumber;		
		} //generate random numbers
		
		for (int i = 0; i < TOTAL_NUMBERS; i++) {
			sum = sum + temperatureData[i];
		}
		averageTemp = sum/TOTAL_NUMBERS;
		//average
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < TOTAL_NUMBERS; i++) {
			if (temperatureData[i] > max) {
				max = temperatureData[i];
			}
		}
		System.out.println("Maximum temperature: " + max);
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < TOTAL_NUMBERS; i++) {
			if (temperatureData[i] < min) {
				min = temperatureData[i];
			}
		}
		System.out.println("Minimum temperature: " + min);
		System.out.println("Average temperature: " + averageTemp);
		
		for (int i = 0; i < TOTAL_NUMBERS; i++) {
			if (temperatureData[i] < -10) {
				frequencyOfTemp[0] = frequencyOfTemp[0]+1;				
			} else if (temperatureData[i]>=-10 && temperatureData[i] <0 ) {
				frequencyOfTemp[1] = frequencyOfTemp[1]+1;	
			}else if  (temperatureData[i]>=0 && temperatureData[i] <10 ) {
				frequencyOfTemp[2] = frequencyOfTemp[2]+1;	
			}else if  (temperatureData[i]>=10 && temperatureData[i] <20 ) {
				frequencyOfTemp[3] = frequencyOfTemp[3]+1;	
			} else if  (temperatureData[i]>=20 && temperatureData[i] <30) {
				frequencyOfTemp[4] = frequencyOfTemp[4]+1;	
			} else  {
				frequencyOfTemp[5] = frequencyOfTemp[5]+1;	
			}
		}
		
		System.out.println();
		System.out.print("Frequency of Temperature Ranges: ");
		System.out.println();
		print("Less than -10 ", frequencyOfTemp[0] );
		print("-10 to 0 ", frequencyOfTemp[1] );
		print("0 to 10 ", frequencyOfTemp[2] );
		print("10 to 20 ", frequencyOfTemp[3] );
		print("20 to 30 ", frequencyOfTemp[4] );
		print("Greater than 30 ", frequencyOfTemp[5] );
	}	
}
