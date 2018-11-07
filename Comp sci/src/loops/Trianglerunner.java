package loops;

import java.util.Scanner;

public class Trianglerunner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		for(int i=0 ;i<3; i++)
		{
			System.out.print("Enter side A ::  ");
			int a = keyboard.nextInt();

			System.out.print("Enter side B ::  ");
			int b = keyboard.nextInt();

			System.out.print("Enter side C ::  ");
			int c = keyboard.nextInt();

			trianglelab test = new trianglelab();
			test.setSides(a, b, c);
			test.calcPerimeter();
			test.calcArea();
			test.print();
			
		}
	}
}
