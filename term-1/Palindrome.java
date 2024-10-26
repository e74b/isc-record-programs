import java.util.*;

public class Palindrome {
	public static void main (String args[]) {
		int number;
		int buffer;
		int reversed = 0;
		
		System.out.println("Enter number:");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		buffer = number;
		
		while (buffer != 0) {
			int digit = buffer % 10;
			reversed *= 10;
			reversed += digit;
			buffer /= 10;
		}

		System.out.println("Original: " + number);
		System.out.println("Reversed: " + reversed);

		if (number == reversed) {
			System.out.println("Number is palindrome.");
		} else {
			System.out.println("Number is NOT palindrome.");
		}
	}
}
