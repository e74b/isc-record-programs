import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter " + n + " elements:");

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int pos = i;
			int small = array[i];

			for (int j = i + 1; j < n; j++) {
				if (array[j] < small) {
					small = array[j];
					pos = j;
				}
			}

			int tmp = array[i];
			array[i] = small;
			array[pos] = tmp;
		}

		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}
}
