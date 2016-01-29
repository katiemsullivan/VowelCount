//Katie Sullivan

import java.util.Scanner;

public class VowelCountSullivan {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);     
		System.out.println("Please enter a word: ");
		String word = in.nextLine();     
		
		int vowels = 0;
		
		for (int i = 0; i < word.length(); i++) {         
			String ch = word.substring(i, i + 1);         
			if ("aeiou".contains(ch.toLowerCase())) {
				vowels++;    
			}    
		}
		
		if (vowels > 0) {
			System.out.println(vowels + " vowel(s) in " + word);   
		} else	{
			System.out.println("You must have made a spelling mistake somewhere.");
		}
		
		in.close();
	}
}
