import java.util.*;

public class Shapes {

	static double areaCircle (double radius) {
		return Math.pow(radius, 2) * Math.PI;
	}

	static double areaRectangle (double length, double breadth) {
		return length * breadth;
	}

	static double squarePerimeter (double side) {
		return side * 4;
	}


	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle radius: ");
		double radius = input.nextDouble();
		System.out.println("Area = " + areaCircle(radius));
		
		System.out.println("Enter rectangle length:");
		double length = input.nextDouble();
		System.out.println("Enter rectangle breadth:");
		double breadth = input.nextDouble();
		System.out.println("Area = " + areaRectangle(length, breadth));

		System.out.println("Enter square side");
		double side = input.nextDouble();
		System.out.println("Perimiter = " + squarePerimeter(side));
	}
}
