import java.util.*;

public class Anagram {
    public static void main(String args[]) {
        char charecterFrequency[] = new char[255];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter original: ");
        String original = input.nextLine().toLowerCase();
        System.out.println("Enter string to check: ");
        String anagram = input.nextLine().toLowerCase();
        
        for (int i = 0; i < original.length(); i++) {
            int currentChar = (int)original.charAt(i);
            charecterFrequency[currentChar]++;
        }
        
        for (int i = 0; i < anagram.length(); i++) {
            int currentChar = (int)anagram.charAt(i);
            charecterFrequency[currentChar]--;
        }
        
        int flag = 0;
        for (int i = 97; i< 123; i++) {
            if (charecterFrequency[i] != 0)
                flag = 1;
        }
        
        if (flag == 1)
            System.out.println("Strings are NOT anagrams.");
        else
            System.out.println("Strings are anagrams.");
    }
}