package leapYear;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int year;
		System.out.println("Enter an year:");
		year = read.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				System.out.println("Year is not leap year");
			}
			else {
				System.out.println("Year is leap year");
			}
		}
		
		else if(year % 400 == 0) {
			if(year % 100 == 0) {
				System.out.println("Year is not leap year");
			}
			else {
				System.out.println("Year is leap year");
			}
		}
		else {
			System.out.println("Year is not leap year");
		}
	}

}
