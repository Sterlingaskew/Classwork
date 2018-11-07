package worksheets;

public class Worksheetone {

			private int numOne, numTwo, answer;

			public void setNums(int n1, int n2) 
			{ numOne=n1;
			  numTwo=n2;
			}

			// Method add() adds numOne and numTwo and stores the result in answer.
			public void add() 
			{
				answer = numOne + numTwo;

			}

			// Method print() displays the sum of numOne and numTwo.
			public void print()
		   {  
			System.out.println(numOne+" + "+numTwo+" = "+answer);


		   }
}




