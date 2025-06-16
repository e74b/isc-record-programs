import java.util.*;


public class isPrime {
	public static void main(String argss[]) {
		int number;
		int flag = 0;

		System.out.println("Enter number: ");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();

		for (int i = 2; i < number ;i++) {
			if (number % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println ("Number is composite.");
		} else {
			System.out.println ("Number is prime.");
		}
	}
}
