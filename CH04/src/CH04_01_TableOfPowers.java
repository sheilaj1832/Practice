import java.util.Scanner;

public class CH04_01_TableOfPowers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();
		
		String choice = "y";
		int squared;
		int cubed;
		
		while(choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		System.out.println();
		
		 // Table with header
        String table = "";
        String header = "Number\tSquared\tCubed\n";
       	String separator = "======\t=======\t=====\n";
        table += header;
        table += separator;
		
        //For loop
		for (int i = 1; i <= number; i++) {
			squared = i*i;
			cubed = i*i*i;
        	table+=i +"\t"+squared+"\t"+cubed+"\n"; 
		}
           System.out.println(table); 
           
		System.out.println("Continue y/n?");
		choice = sc.next();
		}
		sc.close();
	}
}


