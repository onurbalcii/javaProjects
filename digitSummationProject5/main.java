package digitSummationProject5;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program adds the digits of the entered number. \n");
		Scanner read = new Scanner(System.in);
		
        System.out.println("Enter a positive number: ");
        int num = read.nextInt();
        int result = digit(num);
        System.out.println("The final result is: " + result);
	}
	
	public static int digit(int num) {
		int sum = 0, enteries = 0;
		while (num != 0) {
			sum = (num%10)+sum;
			num /= 10;
			enteries++;
		}
		
		return sum;
	}
}
	
