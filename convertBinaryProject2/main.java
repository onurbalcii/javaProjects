package convertBinaryProject2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program converts a decimal number to a binary number. ");
		Scanner read = new Scanner(System.in);
		
		String binary;
		int decimal = 0;
		
		while(decimal != -1) {
			
		System.out.println("\nEnter a decimal number: ");
		decimal = read.nextInt();
		
		if(decimal == -1) {
			System.out.println("Calculation finised! ");
			break;
		}
			
		binary = toBinary(decimal);
		System.out.println("Binary representation of " + decimal + " is " + binary);
		
		}
	}
	
	public static String toBinary(int decimal) {
		
		if(decimal == 0) {
			return "0";
		}
		
		String binary = "";
		while (decimal > 0) {
			int remainder = decimal % 2;
			binary = remainder + binary;
			decimal /= 2;
		}
		
		return binary;
	}
}
