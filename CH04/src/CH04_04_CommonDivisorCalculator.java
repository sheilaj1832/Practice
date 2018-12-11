import java.util.Scanner;

public class CH04_04_CommonDivisorCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Greatest Common Divisor Finder\n");

		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter first number: ");
			int x = sc.nextInt();
			System.out.print("Enter second number: ");
			int y = sc.nextInt();
			
			// Logic
			int divisor = 0;
            
            // continue until x = 0
            while (x != 0) {
                // subtract x from y until y < x
                while (y >= x) {
                    y -= x;
                }

                // swap the values of x and y
                divisor = x;
                x = y;
                y = divisor;
            }
			
			System.out.println("Greatest common divisor: " + divisor);
			System.out.println();
			
			System.out.print("Continue y/n?");
			choice = sc.next();
		}
		sc.close();
	}
}



