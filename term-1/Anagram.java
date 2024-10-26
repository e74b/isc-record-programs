import java.util.*;

public class Anagram {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two words :: ");
		String word1 = input.nextLine();
		String word2 = input.nextLine();

		char word1_array[] = new char[word1.length()];

		for (int i = 0; i < word1.length(); i++) {
			char charecter = word1.charAt(i);
			if (charecter == ' '){
				word1_array[i] = 0;
			} else {
				word1_array[i] = word1.charAt(i);
			}
		}

		for (int i = 0; i < word2.length(); i++) {
			Boolean found = false;
			
			if (word2.charAt(i) == 32) 
				continue;

			for (int j = 0; j < word1.length(); j++) {
				if (word2.charAt(i) == word1_array[j]) {
					word1_array[j] = 0;
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Word is not an anagram");
				System.exit(0);
			}

		}

		for (int i = 0; i < word1.length(); i++) {
			if (word1_array[i] != 0) {
				System.out.println("Word is not an anagram."); 
				System.exit(0);
			}
		}

		System.out.println("Word is an anagram.");
	}
}
