
package numbers;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void main(String[] args) {

        natural();
        oddEven();
        buzz();

    }

    private static void natural() {
        System.out.println("Enter a natural number:");
        number = scanner.nextInt();
        if (number < 1) {
            System.out.println("This number is not natural!");
            System.exit(0);
        }
    }

    private static void oddEven() {
        if (number % 2 == 0) {
            System.out.println("This number is Even.");
        } else {
            System.out.println("This number is Odd.");
        }
    }

    private static void buzz() {
        if (number == 7) {
            System.out.printf("""
                    Explanation:
                    It is a Buzz number.
                    %d is divisible by 7 and ends with 7.""", number);
        } else if (number % 7 == 0) {
            System.out.printf("""
                    Explanation:
                    It is a Buzz number.
                    %d is divisible by 7""", number);
        } else if (Integer.toString(number).endsWith("7")) {
            System.out.printf("""
                    Explanation:
                    It is a Buzz number.
                    %d ends with 7""", number);
        } else {
            System.out.printf("""
                    Explanation:
                    It is not a Buzz number.
                    %d is neither divisible by 7 nor does it end with 7.""", number);
        }
    }
}
