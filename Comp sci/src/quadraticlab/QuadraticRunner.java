package quadraticlab;

	//Name - 
	//Date -

	import java.util.Scanner; 
	import static java.lang.System.*;
	 

	public class QuadraticRunner
	{
		public static void main( String[] args )
		{
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner( System.in );
			out.print("Enter a :: ");
			int quadA = keyboard.nextInt();
			out.print("Enter b :: ");
			int quadB = keyboard.nextInt();
			out.print("Enter c :: ");
			int quadC = keyboard.nextInt();
			
			
			Quadratic test = new Quadratic();
			test.setEquation(quadA,quadB,quadC);
			test.calcRoots( );
			System.out.println( test );
		}
	}


