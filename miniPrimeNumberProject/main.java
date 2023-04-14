package miniPrimeNumberProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num;
		System.out.println("Enter an integer: ");
		num = read.nextInt();
		boolean isPrime = true; //Başlangıçta sayıyı asal kabul ediyoruz.
		
		if(num==1)
		{
			System.out.println("Isn't a prime number!");
			return;
		}
		
		if(num<1)
		{
			System.out.println("Wrong number!");
			return;
		}
		
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				isPrime = false; //Sayı buraya girip boolean false dönerse asal değil kabul ediyoruz.
			}
		}
		
		if(isPrime)
		{
			System.out.println("The number is Prime number.");
		}
		else
		{
			System.out.println("Isn't a Prime number");
		}
	}

}
