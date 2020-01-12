import java.util.Scanner;


public class Practice{
	
	static Scanner input= new Scanner(System.in);
	
	static void log(double a) {
		System.out.println(a);
	}
	
	static void log(String msg) {
		System.out.println(msg);
	}
	
	static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		double itemCost;
		String saleType, taxType;
		log("Enter an item cost: ");
		itemCost = input.nextDouble();
		log("Enter the sale type: ");
		saleType=input.next();
//		log("Enter the tax type: ");
//		taxType=input.next();
		
		if(saleType == "s") {
			itemCost = itemCost*0.75;
			
//			if(taxType =="h") {
//				itemCost = itemCost*(1+0.13);			
//		    } else if (taxType == "g") {
//		    	itemCost = itemCost*(1+0.07);
//		    }
//			log(itemCost);
//		}  else {
//			if(taxType =="h") {
//				itemCost = itemCost*(1+0.13);			
//		    } else if (taxType == "g") {
//		    	itemCost = itemCost*(1+0.07);
//		    }
			
		}
		log("item cost is " + itemCost);
		
//		char grade;
//		String gradeS;
//		
//		print("Please enter your grade: ");
//		
//		gradeS = input.nextLine();
//		grade = gradeS.charAt(0);
		
//		if(grade =='A') {   //'A'   vs. "A" 
//			print("Well done!");
//		} else if(grade == 'F') {
//				print("Failed!");				
//		} else if(grade =='B') {
//			    print("You did well!");
//		} else {
//			print ("You made it!");
//		}

		short num=6;
		
		switch(num) {
		case 7: num++;
		break;
		case 6: num++;
		break;
		case 5:num +=100;
		break;
		default: num +=2;		
		}
		print("num is " + num);
	}
	
}
