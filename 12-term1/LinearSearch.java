import java.util.*;

public class LinearSearch {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		int array[] = new int[n];

		System.out.println("Enter " + n + "elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter search element: ");
		int search = input.nextInt();

		int flag = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == search) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Element found at position: " + (i + 1));
		} else {
			System.out.println("Element not found.")
		}
	}
}
