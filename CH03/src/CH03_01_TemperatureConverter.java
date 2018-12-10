import java.util.Scanner;

public class CH03_01_TemperatureConverter {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to the Temperature Converter");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter degrees in Fahrenheit: ");
			double fdegrees = sc.nextDouble();
			
			double cdegrees = (fdegrees-32) * 5/9;
			cdegrees = (double) Math.round(cdegrees * 100)/100;

			System.out.println("Degrees in Celsius: " + cdegrees);
			System.out.println();
			
			System.out.print("Continue y/n?");
			
			choice = sc.next();
			
		}
		sc.close();
	}

}
