package numbersDivisibleBy3By5AndBothProject10;

public class main {

	public static void main(String[] args) {
		System.out.println("This program says the numbers from 1 to 100 are divisible by 3, 5 and both. \n");
		
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Multiple of three and five");
			}else if(i%3==0){
				System.out.println("Multiple of three");
			}else if(i%5==0) {
				System.out.println("Multiple of five");
			}else {
				System.out.println(i);
			}
		}
	}
}
