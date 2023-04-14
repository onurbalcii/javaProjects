package primeNumbersAverageProject13;

import java.util.Scanner;

public class main{
	
	public static void main(String[] args) {
		System.out.println("This program is calculate prime number average between two integer!");
		Scanner read = new Scanner(System.in);
		
		int num1, num2, total=0, digit=0;
		double average;
		
		System.out.println("Enter first number: ");
		num1 = read.nextInt();
		
		System.out.println("Enter second number: ");
		num2 = read.nextInt();
		
		System.out.printf("Prime numbers between %d and %d; \n", num1, num2);
		
		for(int i=num1; i<=num2; i++) {
			
			if(isPrime(i)) {
				System.out.println(i+"");
				int num = i;
				total = total + num;
				digit++;
			}
		}
		
		average = (double) total / digit;
		System.out.printf("Average of prime numbers:%f ", average);
	}
	
	public static boolean isPrime(int num) {
		
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<=num/2; i++) {
			
			if(num % i  == 0) {
				return false;
			}
		}
		
		return true;
	}
}
