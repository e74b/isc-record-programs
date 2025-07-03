
import java.util.*;

public class Dec2Bin {
	static String bin = "";

	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to convert: ");
		int n = input.nextInt();
		deci2bin(n);

		System.out.println("Binary: " + bin);
	}

	static void deci2bin (int number) {
		if (number < 2) {
			bin = number + bin; // Base case
		} else {
			bin = number % 2 + bin;
			deci2bin(number / 2); // Recursive case
		}
	}
}
