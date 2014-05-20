package simplecalculator.java;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String args[])
	{
		Scanner getnum = new Scanner(System.in);
		double firstnum, secondnum, answer;
		
		System.out.println("Type in a number and press enter.");
		firstnum = getnum.nextDouble();
		
		System.out.println("Type in another number and press enter.");
		secondnum = getnum.nextDouble();
		
		answer = firstnum * secondnum;
		System.out.println("The product of these two numbers is " + answer + ".");
		
	}
		
}
