/*Write a program that asks user for 2 integers and print the divison of
 *  the 2 integers. Handle ArithmeticException and print its stacktrace. 
 *  Handle all other RuntimeException and print its message.
 *  Irrespective of whether an exception ocurred or not, print a "Thank you" message
 * */package programmingFundementalsConcepts;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter the first number");
			int num1 = input.nextInt();

			System.out.println("Enter the second number");
			int num2 = input.nextInt();

			System.out.println("The division of the 2 numbers is " + num1 / num2);

	}
		catch (Exception e) {
			System.out.println(e);
		}
finally {
			
			System.out.println("Thank you");
			input.close();
		}
}
}
