import java.util.Scanner;

public class CH03_02_TravelTimeCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter miles:           ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour:  ");
			double mph = sc.nextDouble();
			System.out.println();
			
			//calculations
			int hours = (int) ((int) miles/mph);
			int milesrem = (((int)miles % (int)mph));
			int minutes = (int) (milesrem/(mph/60));
			
			System.out.println("Estimated travel time");
			System.out.println("---------------------");
			System.out.println("Hours:   " + hours);
			System.out.println("Minutes: " + minutes);
			System.out.println();
			
			System.out.print("Continue y/n?");
			System.out.println();
			choice = sc.next();
		}
		sc.close();
	}

}
