package stringmanipulation;

public class Social
{
   public static String go( String a )
	{
	   if(a.charAt(3)==45) 
	   {
		   if(a.charAt(6)==45) 
		   {
			   return a.substring(7, 11);
		   
		   }
		   return "bad";
	   }
		return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/