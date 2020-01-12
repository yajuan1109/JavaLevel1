/*
* This program Mad Lib game
*
* @author Yajuan Wang
* @version 1.0
* @since 2019-10-04 CST8110 Introduction to Programming
*/
import java.util.Scanner;

public class JavaAssign1yaju0001 {

	public static void main(String[] args) {
		
		String malenameyaju0001, liquidyaju0001, foodPluralyaju0001;
		String adjective1yaju0001, adjective2yaju0001, adjective3yaju0001, adjective4yaju0001, adjective5yaju0001;
		String noun1yaju0001, noun2yaju0001, noun3yaju0001, noun4yaju0001;
		String pluralNoun1yaju0001, pluralNoun2yaju0001;
		String verbyaju0001, verbEd1yaju0001, verbEd2yaju0001, verbIngyaju0001;
		
		System.out.print("Please enter an male name: ");
		Scanner input = new Scanner(System.in);
		malenameyaju0001 = input.next();
		System.out.print("Please enter an adjective: ");
		adjective1yaju0001= input.next();
		System.out.print("Please enter a noun: ");
        noun1yaju0001 = input.next();
        System.out.print("Please enter an adjective: ");
        adjective2yaju0001 = input.next();
        System.out.print("Please enter a food( plural): ");
        foodPluralyaju0001 = input.next();
        System.out.print("Please enter a noun( plural): ");
        pluralNoun1yaju0001 = input.next();
        System.out.print("Please enter a verb ending in 'ed': ");
        verbEd1yaju0001 = input.next();
        System.out.print("Please enter a liquid: ");
        liquidyaju0001 = input.next();
        System.out.print("Please enter a noun: ");
        noun2yaju0001 = input.next();
        
        System.out.println("Come on over to " + malenameyaju0001 +
        		                        "'s Pizza Parlor where you can enjoy you favorite " + adjective1yaju0001 + "-dish pizza's. " + 
        		                        "\nYou can try our famous  " + noun1yaju0001 + 
        		                        "- lovers pizza, or select from our list of  " + adjective2yaju0001 +
        		                        " topping, \nincluding sauteed " + foodPluralyaju0001 +", " + pluralNoun1yaju0001 +
        		                        ", and many more. \nOur crusts are hand-" + verbEd1yaju0001 +
        		                        " and basted in " + liquidyaju0001 + " to make them seem more " +
        		                        noun2yaju0001 + "-made."       		                  
        		                        );
        
        System.out.print("\nPlease enter a verb: ");
        verbyaju0001 = input.next();
        System.out.print("Please enter an adjective: ");
        adjective3yaju0001 = input.next();
        System.out.print("Please enter an adjective: ");
        adjective4yaju0001 =input.next();
        System.out.print("Please enter a noun: ");
        noun3yaju0001 = input.next();
        System.out.print("Please enter an adjective: ");
        adjective5yaju0001 = input.next();
        System.out.print("Please enter a verb ending in 'ed': ");
        verbEd2yaju0001 = input.next();
        System.out.print("Please enter a noun: ");
        noun4yaju0001 = input.next();
        System.out.print("Please enter a verb ending in 'ing': ");
        verbIngyaju0001 = input.next();
     
        System.out.println("\nWhile anyone can " + verbyaju0001 + 
        		                       " to themselves they were " +  adjective3yaju0001 + 
                                       ", the true test is admission to someone else." + 
        		                       "\nFaults are " + adjective4yaju0001 + " where " + noun3yaju0001 +
        		                       " is thin." + "\nThe only real way to look " + adjective5yaju0001 +
        		                       " is not to be " + verbEd2yaju0001 + " so soon." +
        		                       "\nAlways try to do things in chronological " + noun4yaju0001 +
        		                       "; it's less " + verbIngyaju0001 + " that way.");
              
	}

}
