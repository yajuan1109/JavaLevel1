import java.util.Scanner;

public class Account {
	
	private long accountNumber;
	private String name;
	private double balance, interestPercent, interestAmount;
	
	Scanner input = new Scanner(System.in);
	
	public Account(){
		this.accountNumber = 1000;
		this.name = "Not Set";
		this.balance = 100;
		this.interestPercent = 0.01;	
	}
	
	public Account(long accountNumber, String name, double balance, double interestPercent){
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.interestPercent = interestPercent;
	}
	
	public void readInfo() {
		System.out.println("Enter account number: ");
		accountNumber = input.nextLong();
		System.out.println("Enter name: ");
		name = input.next();
		System.out.println("Enter balance: ");
		balance = input.nextDouble();
		System.out.println("Enter interest percentage: ");
		interestPercent = input.nextDouble();
		while(interestPercent<0) {
			System.out.println("Interest percent cannot be negative. Please re-enter: ");
			interestPercent = input.nextDouble();
		}
	}
	
	public void calculateInterest() {
		interestAmount = balance * interestPercent/100;
	}
	
	public void displayInfo(){
		System.out.printf("Account number: %6d\t  Name:%10s\t      Balance: %8.2f\t Interest Percentage: %5.2f\t Interest: %6.2f\t", 
				accountNumber, name, balance,interestPercent, interestAmount);
		if(balance>5000) {
			System.out.println(" Rich Account holder");
		} else if (balance<250) {
			System.out.println(" Struggling account holder");
		} else System.out.println();
	}
    
	

}
