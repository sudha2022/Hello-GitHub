/*Write a program that declares and initializes a counter to 0. 
 * Run a forever while loop, increment counter by 1 with every iteration. break the loop when counter is 5.
 *  continue the loop without printing the number when counter is 3. Print the counter for all other values.
   This question involves while loop, break and continue statements
 * 
 * */


package programmingFundementalsConcepts;

public class Solution3 {

	public static void main(String[] args) {
		int counter=0;
		while(true) {
		if(counter==5) {
		break;
		}
	
		if (counter != 3 && counter != 0 ) {
			System.out.println("The value of the counter is : " + counter);
			}



			counter++;
			}
	}
}
	


