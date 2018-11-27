package ifelse;

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{	
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
	    System.out.println("5 is even :: " + NumberVerify.isEven(5));
		for(int i=0; i<3; i++)
		{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a Whole number :: ");
		int num = keyboard.nextInt();
		//add in input

		System.out.println(num+" is odd :: "+NumberVerify.isOdd(num));
		System.out.println(num+" is even :: "+NumberVerify.isEven(num));
		

		//add in more test cases
	}
}
}