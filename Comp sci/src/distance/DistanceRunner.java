package distance;

import java.util.Scanner;
import static java.lang.System.*;

public class DistanceRunner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		Distance test = new Distance();
		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.println(test);

		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();

		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.println(test);

		out.print("Enter X1 :: ");
		x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		y2 = keyboard.nextInt();

		test.setCoordinates(x1, y1, x2, y2);
		test.calcDistance();
		System.out.println(test);
	}
}