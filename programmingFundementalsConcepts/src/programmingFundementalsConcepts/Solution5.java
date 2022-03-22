/* Write a program to ask the user for a decimal number,
 *  and print the floor, ceil, round of that number
    This question involves java.lang.Math class
 * 
 * 
 * */



package programmingFundementalsConcepts;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the first decimal number");
		double num1 = input.nextDouble();
		System.out.println("The ceil value of the numberis:"+ Math.ceil(num1));
		System.out.println("Thefloor value of the numberis:"+ Math.floor(num1));
		System.out.println("The round value of the numberis:"+ Math.round(num1));



	}

}
