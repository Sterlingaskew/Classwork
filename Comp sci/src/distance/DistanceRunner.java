package distance;
import java.util.Scanner;
import static java.lang.System.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		for(int i=0;i<3;i++) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		
		//add more test cases
		}
	}
}