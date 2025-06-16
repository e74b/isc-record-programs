import java.util.*;

public class BinarySearch {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter " + n + " elements, sorted.");

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter search element: ");
		int search = input.nextInt();

		int first = 0;
		int last = n - 1;
		int flag = 0;
		int mid = (first + last) / 2;

		while (first <= last) {
			mid = (first + last) / 2;

			if (array[mid] > search) {
				last = mid;
			} else if (array[mid] < search) {
				first = mid;
			} else if (array[mid] == search) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Element found at position: " + (mid + 1));
		} else {
			System.out.println("Element not found.");
		}
	}
}
