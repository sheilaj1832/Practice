import java.util.Scanner;

public class CH04_02_FactorialCalendar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			int num = sc.nextInt();
			
			// calculate the factorial of the number
		    long factorial = 1;		
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
						
			System.out.println("The factorial of " + num + " is " + factorial);
			System.out.println();
			System.out.print("Continue y/n?");
		choice =  sc.next();
		System.out.println();
		}
		sc.close();
	}
}
