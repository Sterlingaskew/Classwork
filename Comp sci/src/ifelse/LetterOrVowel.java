package ifelse;

import static java.lang.System.out;

import java.util.Scanner;

public class LetterOrVowel {
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter :: ");
		String word = keyboard.next();
		String value = word.toLowerCase();
		char firstletter= value.charAt(0);
		if(firstletter>=97 && firstletter<=122) 
			{
				if (firstletter== 'a'|firstletter=='e'|firstletter== 'i'|firstletter== 'o'|firstletter== 'u')
					out.print(word+" - vowel");
				else
					out.print(word+" - consonant");
			}
		if(firstletter>47 && firstletter<58)
			out.print(word+" - number");
		if(firstletter<=97&& firstletter<=122)
		{
			if(firstletter>47 && firstletter<58)
				out.print("");
		}
		else 
			out.print(word+" - something else");
		
	}
}
