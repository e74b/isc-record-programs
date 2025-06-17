import java.util.*;

public class GCD {
	static int gcd (int num1, int num2) {
		if (num2 % num1 == 0) {
			return num1;
		} else {
			return gcd(num2, num2 % num1);
		}
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("GCD = " + gcd(num1, num2));
	}
}
