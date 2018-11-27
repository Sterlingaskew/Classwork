package leapyear;
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		for(int i=0;i<3;i++) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		System.out.println(year+(LeapYear.isLeapYear(year)==true? " is":" IS NOT")+" a leap year");
		

	
	}
}
}