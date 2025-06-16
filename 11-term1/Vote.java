import java.util.*;

public class Vote {
	public static void main(String args[]) {
		int age;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = input.nextInt();

		if (age >= 18){
			System.out.println("You can vote!");
		} else {
			System.out.println("You cannot vote!");
		}
	}
}
