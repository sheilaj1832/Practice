import java.util.Scanner;

public class CH04_03_TipCalculator {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("Tip Calculator\n");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {

			System.out.print("Cost of meal: ");
			double cost = sc.nextDouble();
			System.out.println();
			
			double tip15 = cost * .15;
			double total15 = cost + tip15;
			double tip20 = cost * .2;
			double total20 = cost + tip20;
			double tip25 = cost * .25;
			double total25 = cost + tip25;
			
			
			System.out.println("15%");
			System.out.println("Tip Amount: " + tip15);
			System.out.println("Total Amount: " + total15 + "\n");
			
			System.out.println("20%");
			System.out.println("Tip Amount: " + tip20);
			System.out.println("Total Amount: " + total20 + "\n");
			
			System.out.println("25%");
			System.out.println("Tip Amount: " + tip25);
			System.out.println("Total Amount: " + total25 + "\n");
			
			System.out.print("Continue y/n?");
			choice = sc.next();
		}
		sc.close();
	}

}
