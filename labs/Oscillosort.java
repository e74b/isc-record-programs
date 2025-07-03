import java.util.*;

public class Oscillosort {
	public static void main(String args[]) {
		// int a[] = {3, 9, 6, 19, 27, 12, 5};

		// Input statement
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. elements: ");
		int n = input.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " integers: ");
		for (int i =0; i < n; i++)
			a[i] = input.nextInt();

		// Bubble Sort
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
		}

		// Output ascending array
		System.out.println("Ascending: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();

		// Pendulum Sort
		// lim is the smallest number sorted so far.
		// We initialize it to a number larger than any number 
		//   in the array as we have not sorted any element yet.
		int lim = a[a.length - 1] + 1;
		for (int i = 0; i < a.length; i++) {

			// Calculate current sort position 'ind'
			int ind = (i + 1) / 2;
			if (i % 2 == 0)
				ind = -ind;
			System.out.println(ind);
			ind += (a.length / 2);
			// Wrap around case for even elements
			ind = (ind + a.length) % a.length;
			int max = 0;
			int pos = -1;

			for (int j = 0; j < a.length; j++) {
				// Select the largest element in the list 
				//   which we have not sorted yet. 
				if (a[j] > max && a[j] < lim) {
					max = a[j];
					pos = j;
				}
			}

			// Swap positions with current largest number and
			//   current sort position.
			int tmp = a[pos];
			a[pos] = a[ind];
			a[ind] = tmp;

			lim = max;
		}

		System.out.println("Oscillosorted: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println();
	}
}
