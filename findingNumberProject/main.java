package findingNumberProject;

public class main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1, 2, 5, 7, 9, 0};
		int wanted = 5;
		boolean getIt = false;
		
		for(int num : numbers) {
			if(num == wanted) {
				getIt = true;
				break;
			}
		}
		if(getIt) {
			System.out.println("Number is found!");
		}else {
			System.out.println("Number is not found!");
		}
	}

}
