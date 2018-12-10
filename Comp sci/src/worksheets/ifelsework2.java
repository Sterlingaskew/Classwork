package worksheets;

public class ifelsework2 {
	public static void main(String[] args) {

		String sam = "hey there";
		String ben = "hey thar";

		System.out.println(sam.indexOf('h'));

		System.out.println(sam.indexOf('7'));

		System.out.println(ben.indexOf('a'));

		System.out.println(ben.indexOf('y'));

		System.out.println(sam.indexOf("ey"));

		System.out.println(ben.indexOf("ar"));

		System.out.println(sam.charAt(3));

		System.out.println(sam.charAt(0));

		System.out.println(sam.substring(3, 6));

		System.out.println(sam.substring(0, 4));

		System.out.println(sam.equals(ben));

		System.out.println(sam.compareTo(ben));

		System.out.println(ben.compareTo(sam));

		System.out.println(ben.compareTo("abc"));

		System.out.println(ben.replaceAll("e", "#"));

		System.out.println(ben.replaceAll("#", "*"));

		System.out.println(ben.length());

		System.out.println(sam.length());

		System.out.println(sam.charAt(20));
	}
}
