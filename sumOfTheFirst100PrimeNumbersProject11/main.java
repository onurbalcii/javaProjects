package sumOfTheFirst100PrimeNumbersProject11;

public class main {
    public static void main(String[] args) {
    	System.out.println("This program finds and adds the prime numbers from the first 100 numbers. \n");
    	
        int count = 0;
        int sum = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number)) {
                count++;
                sum += number;
            }
            number++;
        }

        System.out.println("The sum of the first 100 prime numbers is " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

