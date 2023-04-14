package multiplyProject4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program multiplies two numbers without using the multiplication operator. \n");
		Scanner read = new Scanner(System.in);
		
		int num1, num2, result=0;
		System.out.println("Enter the first number: ");
		num1 = read.nextInt();
		
		System.out.println("Enter second number");
		num2 = read.nextInt();
		
		for(int i=0; i<num2; i++) {
			result = result + num1;
		}
		
		System.out.println("Multiply result: " +result);
	}
}
