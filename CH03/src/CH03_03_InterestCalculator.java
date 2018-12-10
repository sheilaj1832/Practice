import java.util.Scanner;

public class CH03_03_InterestCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter loan amount:   ");
			double amount = sc.nextDouble();
			System.out.print("Enter interest rate: ");
			double rate = sc.nextDouble();
			System.out.println();
			
			//calculations
			amount = (double) Math.round(amount *100)/100;
			rate = (double) Math.round(rate *1000)/1000;
			
			double interest = amount * (rate/100);
			interest = (double) Math.round(interest *100)/100;
			
			//output
			System.out.println("Loan Amount:     $" + amount);
			System.out.println("Interest rate:    " + rate +"%");
			System.out.println("Interest Amount: $" + interest);
			System.out.println();
			
			System.out.print("Continue y/n?");
			choice = sc.next();
		}
		sc.close();
	}

}
