import java.util.*;

public class Armstrong {
	public static void main (String args[]) {	
		int number;
		int length = 0;
		int sum = 0;

		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		int tmp = number;

		while (tmp != 0) {
			length++;
			tmp /= 10;
		}
		tmp = number;

		while (tmp != 0) {
			sum += Math.pow(tmp % 10, length);
			tmp /= 10;
		}

		System.out.println("Power " + length + " sum: " + sum);

		if (sum == number) {
			System.out.println("Number is Armstrong number.");
		} else {
			System.out.println("Number is NOT Armstrong number.");
		}
	}
}
