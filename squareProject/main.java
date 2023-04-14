package squareProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program calculates the square of the entered value up to 1000. \n");
		Scanner read = new Scanner(System.in);
		
		int num, result;

		while (true) {
			System.out.println("Enter a number (max 1000), or -1 to exit: ");
			num = read.nextInt();

			if (num == -1) {
				System.out.println("Exiting program...");
				break;
			}

			if (num > 1000) {
				System.out.println("Please enter a number less than or equal to 1000.");
				continue;
			}

			result = num * num;
			System.out.println("Result: " + result);
		}

		read.close();
	}
}


