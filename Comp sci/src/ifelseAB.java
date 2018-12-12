import static java.lang.System.out;

import java.util.Scanner;

public class ifelseAB 
{
	public static void main ( String[] args )
	{
		for(int i=0;i<3;i++) 
		{
			Scanner keyboard = new Scanner(System.in);
			out.print("Enter a string :: ");
			String stringtocheck = keyboard.next();
			out.print("Enter first letter ::");
			String firstletter= keyboard.next();
			out.print("Enter second letter ::");
			String secondletter= keyboard.next();
			if(stringtocheck.indexOf(firstletter+secondletter)!=stringtocheck.length()-2)
			{
			    if(stringtocheck.indexOf(firstletter+secondletter)>0) 
					out.print(true+"\n");	
				else
					out.print(false+"\n");
			}
			else
				out.print(false+"\n");
		}
	}
}
