package Date;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
		int grade;
		System.out.println("Enter your grade:");
		grade = read.nextInt();
		
		if(grade >= 101) {
			System.out.println("Wrong grade!");
		}
		else if(grade >= 90 && grade <= 100) {
			System.out.println("Your score is A");
		}
		
		else if(grade >= 80 && grade <= 89) {
			System.out.println("Your score is B");
		}
		
		else if(grade >= 70 && grade <= 79) {
			System.out.println("Your score is C");
		}
		
		else if(grade >= 60 && grade <= 69) {
			System.out.println("Your score is D");
		}
		
		else {
			System.out.println("Your score is F");
		}
	}

}
