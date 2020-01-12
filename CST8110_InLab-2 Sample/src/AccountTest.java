
public class AccountTest {
     
	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account(1001, "John", 5000, 3.5);
		Account account3 = new Account();
		
		account3.readInfo();
		System.out.println();
		
		account1.calculateInterest();
		account1.displayInfo();
		
		account2.calculateInterest();
		account2.displayInfo();
		
		account3.calculateInterest();
		account3.displayInfo();
		
	}
	
      
}
