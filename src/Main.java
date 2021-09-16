import java.util.Scanner;

public class Main {
    public static final String INVALID_VALUE_MASSAGE = "Invalid value";

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        long userInput = scr.nextLong();
        printYearsAndDays(userInput);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.err.println(INVALID_VALUE_MASSAGE);
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            if (days >= 365) {
                long remainingDays = days % 365;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            } else {
                System.out.println(minutes + " min = " + years + " y and " + days + " d");
            }
        }
    }
}
