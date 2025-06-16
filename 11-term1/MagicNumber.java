import java.util.*;

public class MagicNumber {
	public static void main(String args[]) {
		int number;
		int sum;
		int temp;

		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();

		while (number>9) {
			sum = 0;	
			while (number > 0) {
				sum += number % 10;
				number /= 10;
			}

			number = sum;
		}
		
		if (number == 1) {
			System.out.println("Number is magic number.");
		} else {
			System.out.println("Number is NOT magic number.");
		}
	}
}
