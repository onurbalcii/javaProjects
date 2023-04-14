package vowelsAndConsonantsProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String word;
		int counter = 0;
		System.out.println("Enter a letter: ");
		word = read.next();
		
		char[] letters = new char[word.length()];
		word.getChars(0, word.length(), letters, 0);
		
		System.out.println("These letters are vowels in the word");
		
		for(int i=0; i<letters.length; i++)
		{
			if(letters[i] == 'a')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'e')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'o')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'u')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'ı')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'i')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'u')
			{
				System.out.println(letters[i]);
				counter++;
			}
			else if(letters[i] == 'ü')
			{
				System.out.println(letters[i]);
				counter++;
			}
			if(counter < 0)
			{
				System.out.println("The word has not any vowels");
			}
		}
	}

}
