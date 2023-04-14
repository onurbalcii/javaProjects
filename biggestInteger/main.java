package biggestInteger;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3, topNum;
		System.out.println("Enter three integer:");
		num1 = read.nextInt();
		num2 = read.nextInt();
		num3 = read.nextInt();
		
		topNum = num1;
		
		if(topNum < num2)
		{
			topNum = num2;
		}
		
		if(topNum < num3)
		{
			topNum = num3;
		}
		
		System.out.println("Bigger integer is: " + topNum);
	}

}
