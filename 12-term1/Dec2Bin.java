import java.util.*;

public class Dec2Bin {


	static String convert (int number) {
		if (number < 2)
			return "" + number;
		return "" + convert(number / 2) + (number % 2);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = input.nextInt();
		System.out.println("Binary form: " + convert(n));
	}
}
