package classwork;

import static java.lang.System.out;

import java.util.Scanner;

public class Ifelse 
{
	public static void main ( String[] args )
	{
		for(int i =0; i<3;i++) 
		{
			Scanner keyboard = new Scanner(System.in);
			out.print("Enter :: ");
			String word = keyboard.next();
			String value = word.toLowerCase();
			char firstletter= value.charAt(0);
			if(firstletter>=97 && firstletter<=122) 
				{
					if (firstletter== 'a'||firstletter=='e'||firstletter== 'i'||firstletter== 'o'||firstletter== 'u')
						out.print(word+" - vowel\n");
					else
						out.print(word+" - consonant\n");
				}
			if(firstletter>47 && firstletter<58)
				out.print(word+" - number\n");
			if(firstletter>32 && firstletter<48)
				out.print(word+" - something else\n");
			if(firstletter>57 && firstletter<65)
				out.print(word+" - something else\n");
			if(firstletter>90 && firstletter<97)
				out.print(word+" - something else\n");
			if(firstletter>122 && firstletter<127)
				out.print(word+" - something else\n");
		}
	}
}


