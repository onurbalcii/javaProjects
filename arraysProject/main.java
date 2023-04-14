package arraysProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int stuNum;
		System.out.println("How many student names will you enter? ");
		stuNum = read.nextInt();
		
		String students[] = new String[stuNum];
		
		for(int i=0; i<stuNum; i++) {
			System.out.println("Enter student name:");
			students[i] = read.next();
		}
		
		System.out.println("The students you entered.");
		for (String student:students) {
			System.out.println(student);
		}
	}

}
