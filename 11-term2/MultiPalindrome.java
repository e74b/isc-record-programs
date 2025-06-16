import java.util.*;

public class MultiPalindrome {
    
    static boolean isPalindrome (String word) {
        String reversed = "";
        for (int i = (word.length() - 1); i >= 0; i--)
            reversed += word.charAt(i);
            
        return reversed.equals(word);
    }
    
    public static void main(String args[]) {
        int totalPalindromes = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = input.nextLine().toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        
        int nWords = tokenizer.countTokens();
        
        for (int i = 0; i < nWords; i++) {
            String token = tokenizer.nextToken();
            
            if(isPalindrome(token)) {
                totalPalindromes++;
                System.out.println(token + " is a palindrome.");
            }
        }
        
        System.out.println("Total Palindromes: " + totalPalindromes);
    }
}