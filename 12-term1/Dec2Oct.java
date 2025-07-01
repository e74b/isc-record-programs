import java.util.*;

public class Dec2Oct {
	static String oct = "";

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to convert: ");
		int n = input.nextInt();
		decitooct(n);

		System.out.println("Octal: 0o" + oct);
	}

	static void decitooct (int number) {
		if (number < 8) {
			oct = number + oct; // Base case
		} else {
			oct = number % 8 + oct;
			decitooct(number / 8); // Recursive case
		}
	}
}
