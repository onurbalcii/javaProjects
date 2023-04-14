package twoBinaryNumbersAdditionProject6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	System.out.println("This program converts a Binary number to Decimal. \n");
        Scanner read = new Scanner(System.in);
    	
        System.out.println("Enter first binary number: ");
        String binary1 = read.nextLine();
        System.out.println("Enter second binary number: ");
        String binary2 = read.nextLine();

        String result = addBinary(binary1, binary2);
        System.out.println("The sum of the two binary numbers is: " + result);
    }

    public static String addBinary(String binary1, String binary2) {
        int len1 = binary1.length();
        int len2 = binary2.length();
        int carry = 0;
        StringBuilder read = new StringBuilder();
        
        while (len1 > 0 || len2 > 0) {
            int sum = carry;
            if (len1 > 0) {
                sum += binary1.charAt(len1 - 1) - '0';
                len1--;
            }
            if (len2 > 0) {
                sum += binary2.charAt(len2 - 1) - '0';
                len2--;
            }
            read.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry != 0) {
            read.append(carry);
        }
        return read.reverse().toString();
    }
}

