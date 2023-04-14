package euclidsAlgorithmProject1;

import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		System.out.println("This prgram calculates the gratest common divisor of two given positive integers. \n");
		Scanner read = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Enter the first number: ");
		num1 = read.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = read.nextInt();
		
		int gcd = calculate(num1, num2);
		
		System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
	}
	
	public static int calculate(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		
		return calculate(num2, num1 % num2);
	}
}
