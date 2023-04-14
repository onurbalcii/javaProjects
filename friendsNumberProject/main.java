package friendsNumberProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1;
		int num2;
		int total1=0;
		int total2=0;
		
		System.out.println("Enter two integer: ");
		num1 = read.nextInt();
		num2 = read.nextInt();
		
		for(int i=1; i<num1; i++)
		{
			if(num1 % i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int i=1; i<num2; i++)
		{
			if(num2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		if(num1==total2 && num2==total1) {
			System.out.println("friends numbers!");
		}else {
			System.out.println("Not friends numbers!");
		}
	}

}
