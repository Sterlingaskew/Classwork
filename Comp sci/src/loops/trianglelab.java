package loops;

//Sterling Askew -
//date -
//Period 4 -
//Triangle lab  -


public class trianglelab {
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public void Triangle() 
	{
		setSides(0, 0, 0);
		perimeter = 0;
		theArea = 0;
	}

	int[] setSides(int a, int b, int c) 
	{ 
		this.sideA=a;this.sideB=b;this.sideC=c;
		int[] abc = {a,b,c};
		return abc;	
	}

	public void calcPerimeter() 
	{
		perimeter = sideA + sideB + sideC;
				
	}

	public void calcArea() {
		double s;
		s = perimeter / 2;
		theArea = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
	}

	public String toString() {
		return " " + sideA + " " + sideB + " " + sideC;
	}

	public void print() {
		System.out.println(sideA+"  "+sideB+"  "+sideC);
		System.out.printf("Area == %.2f\n",theArea);
	}
}
