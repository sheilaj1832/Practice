import java.util.Scanner;

public class CH02_03_RectangleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		
		System.out.println("Area: " + (width * length));
		System.out.println("Perimeter: " + ((2 * width) + (2 * length)));
	
		System.out.print("Continue y/n? ");
		choice = sc.next();
		}
		sc.close();
	}

}
