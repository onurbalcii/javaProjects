package binaryToDecimalProject7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program converts a Binary number to Decimal. \n");
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter a binary number: ");
		String binaryString = read.nextLine();
		
		int decimal = binaryToDecimal(binaryString);
		System.out.println("The decimal value of " + binaryString + " is " +decimal);
	}
	
	public static int binaryToDecimal(String binaryString) {
		int decimal = 0;
		int base = 1;
		
		for(int i = binaryString.length() - 1; i >= 0; i--) {
			if(binaryString.charAt(i) == '1') {
				decimal += base;
			}
			base *= 2;
		}
		
		return decimal;
	}
}
