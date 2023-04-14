package sumOfExponentsProject9;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program makes the exponents of the entered value. \n");
		Scanner read = new Scanner(System.in);
		
		int num, num2, num3;
		System.out.println("Enter a number: ");
		num = read.nextInt();
		
		num2 = num * 11;	//n+nn=n*11
		num3 = num * 111; // n+nn+nnn=n*111
		
		int result = num + num2 + num3;
		System.out.println("Result: " + result);
		
		read.close();
	}
}
