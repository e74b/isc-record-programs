import java.util.*;

public class CurrencyConvert {
	
	static double cvtINRToUSD (double rupees) {
		double dollars = rupees / 83.48;
		return dollars;
	}


	static double cvtINRToGBP (double rupees) {
		double pounds = rupees / 111.22;
		return pounds;
	}


	static double cvtINRToEUR (double rupees) {
		double euro = rupees / 93.27;
		return euro;
	}

	static double round (double value) {
		return Math.round(value * 100) / 100.0d;
	}

	public static void main(String args[]) {
		System.out.println("Enter amount in rupees:");
		Scanner input = new Scanner (System.in);
		double rupees = input.nextDouble();

		System.out.println(rupees + " ₹ (INR)");
		System.out.println("= " + round(cvtINRToUSD(rupees)) + " $ (USD)");	
		System.out.println("= " + round(cvtINRToGBP(rupees)) + " £ (GBP)");
		System.out.println("= " + round(cvtINRToEUR(rupees)) + " € (EUR)");
	}
}
