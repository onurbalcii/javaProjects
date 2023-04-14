package countsTheDaysProject12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	System.out.println("This program calculates the days before the entered date. (Only in the same year) ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (dd/mm/yyyy format): ");
        String date = scanner.nextLine();

        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        int days = dayOfYear(day, month, year);

        System.out.println(date + " is the " + days + "th day of the year.");
    }

    public static int dayOfYear(int day, int month, int year) {
        int[] daysPerMonth = {0,31,59,90,120,151,181,212,243,273,304,334};

        int days = daysPerMonth[month - 1] + day;

        if (isLeapYear(year) && month > 2) {
            days++;
        }

        return days;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

