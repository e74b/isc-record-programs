import java.util.*;

public class Dec2Oct {


	static String convert (int number) {
		if (number < 8) // Base case
			return "" + number;
		return "" + convert(number / 8) + (number % 8);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = input.nextInt();
		System.out.println("Octal form: " + convert(n));
	}
}
