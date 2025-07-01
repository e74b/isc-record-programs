import java.util.*;

public class BinarySearch {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		int array[] = new int[n]; // array 'a'
		
		System.out.println("Enter " + n + " elements, sorted.");

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter search element: ");
		int search = input.nextInt();

		int first = 0;
		int mid = 0;
		int last = n - 1;
		int flag = 0;

		while (first <= last) {
			mid = (first + last) / 2;

			if (array[mid] == search) {
				flag = 1;
				break; // To prevent infinite loop
			} else if (array[mid] > search) {
				last = mid - 1;
			} else if (array[mid] < search) {
				first = mid + 1;
			}
		}

		if (flag == 1) {
			System.out.println("Element found.");
		} else {
			System.out.println("Element not found.");
		}
	}
}
