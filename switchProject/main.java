package switchProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String grade;
		System.out.println("Enter your letter grade:");
		grade = read.next();
		
		switch(grade)
		{
			case "AA":
				System.out.println("Perfect! You Passed.");
				break;
			
			case "BB":
				System.out.println("Great! You Passed.");
				break;
				
			case "CC":
				System.out.println("Well-done! You Passed.");
				break;
				
			case "DD":
				System.out.println("Good! You Passed.");
				break;
				
			case "FF":
				System.out.println("Unfortunately! You did not Passed.");
				break;
				
			default:
				System.out.println("You entered wrong grade!");
		}
	}

}
