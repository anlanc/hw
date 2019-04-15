import java.util.Scanner;

public class HelloUser {
	
	
	public static void main(String[] args) {
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = userInputScanner.nextLine();
		System.out.println("Hello "+ name);
		
		
	}
	
}
