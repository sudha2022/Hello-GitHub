/* Write a program to ask the user for states they have visited in the US. 
 * Ignore case by converting their input to lower case. 
 * Ignore duplicate inputs. Order of input doesn't matter. 
 * The program runs forever until the user types "done". 
 * When the user types "done", display the unique list of states back to the user.
   Use one of the collection framework classes
 * 
 * */
package programmingFundementalsConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		HashSet<String> name =new HashSet<String>();  
		Scanner input= new Scanner(System.in);
		String name1=" " ;
		do
		{
		System.out.println("Enter the states you visited one at a time");
	    System.out.println("Enter State");
	    name1 =input.nextLine().toLowerCase();
		if(!name1.equalsIgnoreCase("done")) {
	     name.add(name1);
		}  
		
		
		}while(!name1.equalsIgnoreCase("done")) ; 
		input.close();
		System.out.println(name);
	
		
	
}
}
		
		

	


