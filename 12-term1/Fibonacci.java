import java.util.*;

public class Fibonacci {

	static int fib (int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of terms to calculate: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(fib(i));
		}
	}
}
