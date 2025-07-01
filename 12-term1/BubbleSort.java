import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		int array[] = new int[n]; // array 'a'
		
		System.out.println("Enter " + n + " elements:");

		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n - 1; j ++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
