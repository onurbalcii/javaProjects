package divideIntegersProject3;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("This program divides two numbers by subtraction. \n");
		Scanner read = new Scanner(System.in);
		
		int num, divider;
		System.out.println("Enter the number: ");
		num = read.nextInt();
		
		System.out.println("Enter the divider");
		divider = read.nextInt();
		
		if(divider == 0) {
			System.out.println("Divider cannot be zero(0)! ");
		} else {
			int calculate = subtraction(num, divider);
			System.out.println(num + " / " + divider + " = " + calculate);
		}		
		
	}
	
	public static int subtraction(int num, int divider) {
		int calculate = 0;
		while(num >= divider) {
			num -= divider;
			calculate++;
		}
		return calculate;
	}
}
