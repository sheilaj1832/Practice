import java.util.Scanner;

public class CH02_01StudentRegistration {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Student Registration Form");
	System.out.println();
	
	System.out.print("Enter first name: ");
	String firstName = sc.next();
	
	System.out.print("Enter last name: ");
	String lastName = sc.next();
	
	System.out.print("Enter year of birth: ");
	int yearOfBirth = sc.nextInt();
	
	System.out.println("Welcome " + firstName + " " + lastName + "!");
	System.out.println("Your registration is complete.");
	System.out.println("Your temporary password is: " + firstName + "*" + yearOfBirth);
	
	sc.close();
	
	}

}
