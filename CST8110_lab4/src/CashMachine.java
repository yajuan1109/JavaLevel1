import java.util.Scanner;

public class CashMachine {
	
      private int itemCount;
      private double tax, sum;
      private String receipt;
      private String itemName;
      private double itemPrice;
      private Scanner consoleInput;
      
      
      //consoleInput= new Scanner(System.in);
      
      public CashMachine(double tax) {
    	  this.tax = tax;
    	  this.consoleInput = new Scanner(System.in);
    	  this.itemCount= 0;
    	  this.receipt= "";
      }
      
      public String getOneStringInput(String msg) {
    	  System.out.print(msg);
    	  return consoleInput.next();
      }
           
      public double getOneDoubleInput(String msg) {
    	  System.out.print(msg);
    	  return consoleInput.nextDouble();
      }
      
      public int getItemCount() {
    	  return itemCount;
      }
      
      public double caculateTax() {
    	  return sum*tax;
      }
      
      public double caculateTaxPlusSum() {
    	  return sum+ caculateTax();
      }
      
      public void purchaseItem() {
    	  itemName= getOneStringInput("item name (no spaces) >>");
    	  itemPrice= getOneDoubleInput("item price ( no spaces) >>");
    	  itemCount ++;    // itemCount = itemCount + 1;
    	  sum += itemPrice;
    	  receipt += toString();
      }
      
      public String toString() {
    	  return String.format("%-15s %.2f%n", itemName, itemPrice);
      }
      
      
      
      public void printReceipt() {
    	  System.out.println();
    	  if (itemCount == 0) {
    		  System.out.println("Empty!!");
    	  } else {
    		  System.out.printf("\nReceipt for %d items:\n",  itemCount);
    		  System.out.println(receipt);
    		  System.out.printf("%-15s$%.2f%n", "Tax:", caculateTax());
    		  System.out.printf("%-15s$%.2f%n", "Total:", caculateTaxPlusSum());  
    	  }  
    	 
      }
      
      public void printMenu() {
    	  System.out.println();
    	  System.out.println("1)purchase Item");
    	  System.out.println("2)Print Receipt");
    	  System.out.println("3)Quit");
    	  System.out.println();
      }
      
      public boolean processMenu() {
    	  double action = getOneDoubleInput("Action>>");
    	  if (action == 1) {
    		  this.purchaseItem();
    		  return true;
    	  } else if (action == 2) {
    		  this.printReceipt();
    	    	itemCount= 0;
    	    	receipt= "";
    	    	sum = 0;
    		  return true;
    	  } else if (action == 3) {
    		  return false;
    	  } else {
    		  return true;
    	  }
		
      }
}
