package ifelse;

import static java.lang.System.out;

import java.util.Scanner;

public class NumCheck {
	public static void main(String[] args)
	{
		for (int i=0;i<4;i++) 
		{
			Scanner keyboard = new Scanner(System.in);
			out.print("\nEnter a Number :: ");
			int numberToCheck = keyboard.nextInt();
			if (check(numberToCheck) == 5)
			{
				System.out.print(numberToCheck + " is divisible by 5.");
			}
			if (check(numberToCheck) == 3)
			{
				System.out.print(numberToCheck + " is divisible by 3.");
			}	
			if (check(numberToCheck) == 0)
			{
				System.out.print(numberToCheck + " is not divisible by either 5 or 3.");
			}
			if (check(numberToCheck) ==2) 
			{
				System.out.print(numberToCheck +" is divisible by both 5 and 3.");
			}
		}
	}

	public static int check(int numberToCheck) 
	{
		if (numberToCheck % 5 == 0)
			if (numberToCheck % 3 == 0)
				return 2;
			else 
				return 5;
		if (numberToCheck % 3 == 0)
			return 3;
		if (numberToCheck > 0)
			return 0;
		else
			return 0;
	}

}
