import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    static void main() {
//        System.out.println( divide());
//        System.out.println(divideByInputNumber());
//        try {
//            System.out.println(negativeNumberChecker(11));
//        } catch (NegativeNumberException e) {
//            System.err.println(e.getMessage());
//        }

        try {
            System.out.println(squareRoot(-10));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception:");
        }
    }

    static double squareRoot(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return Math.sqrt(n);
    }


    static boolean negativeNumberChecker(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("this is negative");
        }
        return false;
    }

    static int divideByInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        String inputNumber = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputNumber);
            return 100 / number;
        } catch (NumberFormatException e) {
            System.err.println("Please input an integer!");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
        }
        return 0;
    }

    static int divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number 1: ");
        int x = scanner.nextInt();
        System.out.print("Please input a number 2: ");
        int y = scanner.nextInt();

        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            return 0;
        }
    }
}
