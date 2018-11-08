package quadraticlab;

//Sterling Askew -
//Date -
//period 4 -
//Quadratic -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic {
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic() {
	}

	public Quadratic(int quadA, int quadB, int quadC) {
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC) {
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void calcRoots() {
		double numerator1 = -b + Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		double numerator2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * a * c));
		double denominator = 2 * a;

		rootOne = numerator1 / denominator;
		rootTwo = numerator2 / denominator;
	}

	public String toString() {
		return "\n\n" + "rootOne :: " + rootOne + ":\nrootTwo :: " + rootTwo;
	}

	public void print() {
		System.out.print("\n\nrootOne :: ");
		System.out.printf("%.2f", rootOne);
		System.out.print("\nrootTWo ::" );
		System.out.printf("%.2f", rootTwo);

	}
}
