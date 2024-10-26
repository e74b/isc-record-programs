import java.util.*;

public class BuzzHCFLCM {
	public static void main(String args[]) {
		int number1, number2, greatest_number, lcm;
		int hcf = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter:\n[1] For Buzz number\n[2] For LCM\n[3] For HCF");
		int choice = input.nextInt();		

		switch (choice) {
			case (1):
				System.out.println("Enter number: ");
				int number = input.nextInt();
				if (number % 7 == 0 || number % 10 == 7) 
					System.out.println(number + " is buzz number");
				else 
					System.out.println(number + " is NOT buzz number");
				break;

			case (2):
				
				System.out.println("Enter first number: ");
				number1 = input.nextInt();
				System.out.println("Enter second number: ");
				number2 = input.nextInt();

				if (number1 > number2) greatest_number = number1;
				else greatest_number = number2;

				for (int i = 1; i <= greatest_number ;i++) {		
					if (number1 % i == 0 && number2 % i == 0)
						hcf = i;	
				}
				lcm = (number1 * number2) / hcf;
				System.out.println("LCM = " + lcm);	
				break;
			case (3):
				System.out.println("Enter first number: ");
				number1 = input.nextInt();
				System.out.println("Enter second number: ");
				number2 = input.nextInt();

				if (number1 > number2) greatest_number = number1;
				else greatest_number = number2;

				for (int i = 1; i <= greatest_number ;i++) 		
					if (number1 % i == 0 && number2 % i == 0)
						hcf = i;	
				System.out.println("HCF = " + hcf);
				break;
			default:
				System.out.println("Invalid option");
		}
	}
}
