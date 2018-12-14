package labs;
import java.util.Scanner;
import static java.lang.System.*;
public class MPHRunner {
		public static void main( String[] args )
		{
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(in);

			out.print("Enter the distance :: ");
			int dist = keyboard.nextInt();

			out.print("Enter the hours :: ");
			int hrs = keyboard.nextInt();

			out.print("Enter the minutes :: ");
			int mins = keyboard.nextInt();

			MilesPerHour test = new MilesPerHour();
			test.setNums(dist, hrs, mins);
			test.calcMPH();
			System.out.print(test);
			out.print("Enter the distance :: ");
			 dist = keyboard.nextInt();

			out.print("Enter the hours :: ");
			 hrs = keyboard.nextInt();

			out.print("Enter the minutes :: ");
			 mins = keyboard.nextInt();

			MilesPerHour test1 = new MilesPerHour();
			test1.setNums(dist, hrs, mins);
			test1.calcMPH();
			System.out.print(test1);
			out.print("Enter the distance :: ");
			 dist = keyboard.nextInt();

			out.print("Enter the hours :: ");
			 hrs = keyboard.nextInt();

			out.print("Enter the minutes :: ");
			 mins = keyboard.nextInt();

			MilesPerHour test2 = new MilesPerHour();
			test2.setNums(dist, hrs, mins);
			test2.calcMPH();
			System.out.print(test2);
		}
	}

