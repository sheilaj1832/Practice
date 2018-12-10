import java.util.Scanner;

public class CH03_04_ChangeCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			// Input data
			System.out.print("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			System.out.println();
			
			// Calculate the # of coins
            int quarters = cents / 25;  // Get # of quarters
            cents %= 25;                // Assign the remainder to the cents

            int dimes = cents / 10;  // Get # of dimes
            cents %= 10;             // Assign the remainder to the cents

            int nickels = cents / 5;  // Get # of nickels
            int pennies = cents % 5;  // Get # of pennies

			// Display results
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes:    " + dimes);
			System.out.println("Nickels:  " + nickels);
			System.out.println("Pennies:  " + pennies);
			System.out.println();
			
			System.out.print("Continue y/n? ");
			choice = sc.next();
			
		}
		sc.close();
	}

}
