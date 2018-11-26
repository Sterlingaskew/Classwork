package ifelse;

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a Whole number :: ");
		int num = keyboard.nextInt();
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println(num+" is odd :: "+NumberVerify.isOdd(num));
		System.out.println(num+" is even ::"+NumberVerify.isEven(num));
		//add in more test cases
	}
}