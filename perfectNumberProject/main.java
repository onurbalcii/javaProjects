package perfectNumberProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num;
		int total = 0;
		System.out.println("Enter an integer: ");
		num = read.nextInt();
		
		for(int i=1; i<num; i++)
		{
			if(num % i == 0) {
				total = total + i;
			}
		}
		
		if(total == num) {
			System.out.println("Perfect Number!");
		}else {
			System.out.println("Not a Perfect Number!");
		}
	}

}
