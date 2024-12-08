import java.util.*;

class StringFun {
    
    String str;
    
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = input.nextLine();
    }
    
    void words() {
        int words = 1;
        int vowels = 0;
        int uppercase = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            switch (currentChar) {
                // Count vowels and words
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    vowels ++;
                    break;
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    vowels ++;
                    break;
                case ' ':
                    words ++;
                    break;
                    
            }
            
            if (65 <= (int)currentChar && (int)currentChar <= 90)
                uppercase ++;
        }
        
        System.out.println("Words\t\t: " + words);
        System.out.println("Vowels\t\t: " + vowels);
        System.out.println("Uppercase\t: " + uppercase);
    }
    
    void frequency() {
        char charecterFrequency[] = new char[255];
        
        for (int i = 0; i < str.length(); i++) {
            int currentChar = (int)str.toUpperCase().charAt(i);
            charecterFrequency[currentChar]++;
        }
        
        System.out.println("Letter Frequency: ");
        for (int i = 65; i < 91; i++) {
            if(charecterFrequency[i] > 0)
                System.out.println((char)i + ":\t" + (int)charecterFrequency[i]);
        }
    }
    
    public static void main() {
        StringFun stringfun = new StringFun();
        stringfun.input();
        stringfun.words();
        stringfun.frequency();
    }
}