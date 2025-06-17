import java.util.*;

public class StringPalindrome {

	static String reverse (String word) {
		if (word.length() == 0)
			return "";
		char first_letter = word.charAt(0);
		String deleted_word = word.substring(1);
		return reverse(deleted_word) + first_letter;
		// First letter goes to the last position
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in a word:");
		String word = input.nextLine();
		String word_reverse = reverse(word);
		System.out.println(word_reverse);
		if (word == word_reverse) {
			System.out.println("Word is a palindrome.");
		} else {
			System.out.println("Word is not a palindrome.");
		}
	}
}
