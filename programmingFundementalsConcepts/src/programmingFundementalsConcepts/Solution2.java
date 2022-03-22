/* 
 * Decription-
 * Write a program to ask the user to enter a year and tell them if it's a leap year or not
A leap year is divisible by 4 but not divisible by 100, OR it is divisible by 400
HINT: % operator can be used to check if a number is divisible by another number. If the number is divisible % will be equal to 0
This question involves logical operators and conditional statements
 * 
 * */



package programmingFundementalsConcepts;

import java.util.Scanner;

public class Solution2 {


public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int year = input.nextInt();

System.out.println("Please enter the Year");
//Is it leap year

boolean leap = false;

//if the year is divided by 4

if(year %4 ==0 || year %400==0) {

System.out.println("Entered year is a leap year");

}else if (year % 400 !=0) {

System.out.println("It's not a leap year");
}
}
}