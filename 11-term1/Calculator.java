import java.util.*;

public class Calculator {
	public static void main (String args[]) {
		int number1, number2, result;
		result = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		number1 = input.nextInt();
		System.out.println("Enter operation [+,-,x,/]:");
		String operation = input.next();	
		System.out.println("Enter second number:");
		number2 = input.nextInt();
		

		if (operation.equals("+"))
			result = number1 + number2;
		else if (operation.equals("-"))
			result = number1 - number2;
		else if (operation.equals("x"))
			result = number1 * number2;
		else if (operation.equals("/"))
			result = number1 / number2;
		else
			System.out.println("Invalid operation");
		
		System.out.println(number1 + operation + number2 + "=" + result);
	}

}
