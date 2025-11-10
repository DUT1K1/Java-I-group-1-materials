import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // N1
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = in.nextInt();
//        double sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum / n);

        // N2
//        String binary = "";
//        int decimal = 134;
//        while (decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);
//
//        int binNum = Integer.parseInt(binary);
//
//        int position = 0;
//        while (binNum > 0) {
//            int lastDigit = binNum % 10;
//            if (lastDigit == 1) {
//                System.out.print(
//                        (int) Math.pow(2, position) + " + "
//                );
//            }
//            position++;
//            binNum /= 10;
//        }
//        System.out.print("0");

        // N3
//        for (int i = 1; i < 16; i++) {
//            if (i == 5 || i == 7 || i == 11) {
//                continue;
//            }
//            System.out.println(i);
//        }


        // N4
//        Scanner in = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int binaryNum = in.nextInt();
//        int decimalNum = 0;
//        int multiplier = 1;
//
//        while (binaryNum > 0) {
//            int lastDigit = binaryNum % 10;
//
//            decimalNum += lastDigit * multiplier;
//            multiplier *= 2;
//            binaryNum /= 10;
//        }
//        System.out.println(decimalNum);

        // N5
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int decimal = in.nextInt();
//        String binary = "";
//        while (decimal > 0) {
//            int remainder = decimal % 2;
//            binary = remainder + binary;
//            decimal /= 2;
//        }
//        System.out.println(binary);

        // N6
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        System.out.print("Guess a number between 1 and 100: ");
        int guess = sc.nextInt();
        while (guess != numberToGuess) {
            if (guess > numberToGuess) {
                System.out.print("Try lower: ");
                guess = sc.nextInt();
            }
            if (guess < numberToGuess) {
                System.out.print("Try higher: ");
                guess = sc.nextInt();
            }
        }
        System.out.println(guess + " is correct!");
    }
}
