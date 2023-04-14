package oddNumber;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program calculates the average of odd numbers between two integers!");
		Scanner read = new Scanner(System.in);
		
		int num1, num2, total=0, digit=0;
		double average;
		
		System.out.println("Enter first number: ");
		num1 = read.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = read.nextInt();
		
		System.out.printf("Odd numbers between %d and %d; \n", num1, num2);
		
		for(int i=num1; i<=num2; i++) {
			
			if(isOdd(i)) {
				System.out.println(i+"");
				total += i;
				digit++;
			}
		}
		
		if (digit == 0) {
			System.out.println("There is no odd number between the given numbers.");
		} else {
			average = (double) total / digit;
			System.out.printf("Sum of odd numbers: %d\n", total);
			System.out.printf("Average of odd numbers: %f ", average);
		}
	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
}
