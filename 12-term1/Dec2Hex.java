import java.util.*;

public class Dec2Hex {
	static String conversions = "0123456789ABCDEF";
	static String convert (int number) {

		if (number < 2)
			return "" + number;
		return "" + convert(number / 16) + conversions.charAt(number % 16);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = input.nextInt();
		System.out.println("Hexadecimal form: " + convert(n));
	}
}
