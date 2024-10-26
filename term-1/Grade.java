import java.util.*;

public class Grade {
	public static void main(String args[]) {
		System.out.println("Enter score (out of 100): ");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();

		if (score >= 90) {
			System.out.println("Grade A");
		} else if (score >= 80) {
			System.out.println("Grade B");
		} else if(score >= 70) {
			System.out.println("Grade C");
		} else if (score >= 40) {
			System.out.println("Grade D");
		} else {
			System.out.println("Grade F");
		}
	}
}
