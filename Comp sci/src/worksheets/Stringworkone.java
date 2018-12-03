package worksheets;

public class Stringworkone {
	public static void main( String[] args ) {
		String one = "sambenwilearethebest";
		String two = "09876543210";
		String three = "02 13 97 68 45 0";

	System.out.println( one.length());			// LINE 1 20

	System.out.println( two.length());			// LINE 2 11

	System.out.println( three.length());		// LINE 3 16

	System.out.println( one.charAt( 2 ) );		// LINE 4 m

	System.out.println( one.charAt( 5 ));		// LINE 5 n

	System.out.println(one.charAt(one.length()-1));	// LINE 6 t

	System.out.println( one.charAt( 6 ) );		// LINE 7 w

	System.out.println( one.substring(0,4) );		// LINE 8 sambe

	System.out.println( one.substring(5) );		// LINE 9 nwilearethebest

	System.out.println( one.substring(9) );		// LINE 10 earethebest

	System.out.println( one.substring(2,7));	// LINE 11 mbenwi

	System.out.println( one.indexOf("abc") );	// LINE 12 -1

	System.out.println( one.indexOf("e") );		// LINE 13 4

	System.out.println( one.indexOf("hij") );	// LINE 14 -1

	System.out.println( two.indexOf("54"));		// LINE 15 6

	System.out.println( two.indexOf("24"));		// LINE 16 -1

	System.out.println( one.indexOf( 'w' ));	// LINE 17 6

	System.out.println( two.indexOf( 'b' ));	// LINE 18 -1

	System.out.println( two.indexOf( 's' ));      // LINE 19 -1

	System.out.println( three.indexOf("45"));	// LINE 20 12


}
}
