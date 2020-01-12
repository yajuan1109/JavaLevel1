import java.security.SecureRandom;

public class PersonTest {

	public static void main(String[] args) {
		
		double []rowValue = new double[5];
		
		SecureRandom rnd = new SecureRandom();
		for(int i =0; i< 5; i++) {
			double randomNumber = rnd.nextDouble();
			rowValue[i] = randomNumber;
			System.out.println(rowValue[i]);
		}
		
		

	}

}
