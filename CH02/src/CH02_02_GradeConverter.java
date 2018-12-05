import java.util.Scanner;

public class CH02_02_GradeConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		String choice = "y";
		String letter = "";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter numerical grade: ");
			int grade = sc.nextInt();
			
			if (grade >= 88) {
				letter = "A";
			}
			else if (grade >= 80) {
				letter = "B";
			}
			else if (grade >= 67) {
				letter = "C";	
			}
			else if (grade >= 60) {
				letter = "D";
			}
			else if (grade < 60) {
				letter = "F";
			}
			System.out.println("Letter grade: " + letter);
			
			System.out.println();
			System.out.print("Continue y/n: ");
			choice = sc.next();

		}
		
	}
}

