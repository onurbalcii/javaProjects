package middleDigitProject8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program finds the middle digit of a 5-digit number. \n");
		Scanner read = new Scanner(System.in);
		
		int num, middleDigit;
		System.out.println("Enter a number: (Only have 5 digits)");
		num = read.nextInt();
		
		
		if(num < 10000) {
			System.out.println("Invail number entered! ");
		}else if(num > 99999) {
			System.out.println("Invail number entered! ");
		}else {
			middleDigit = (num / 100) % 10;
			System.out.println("The middle digit is: " + middleDigit);
		}
		read.close();
	}
}
