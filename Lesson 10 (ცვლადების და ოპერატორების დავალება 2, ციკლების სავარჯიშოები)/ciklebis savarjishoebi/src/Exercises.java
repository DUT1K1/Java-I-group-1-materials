import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        // Savarjisho 1
        // for
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        // while
//        int x = 1;
//        while (x <= 10) {
//            System.out.println(x);
//            x++;
//        }

        // do-while
//        int y = 1;
//        do {
//            System.out.println(y);
//            y++;
//        } while (y <= 10);

        // Savarjisho 2
        // v1
//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }

        // v2
//        for (int i = 0; i <= 20; i ++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // v3
//        for (int i = 0; i <= 20; i ++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // Savarjisho 3

        // 5 * 1 = 5
        // 5 * 2 = 10
        // ...
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * " + i + " = " + (5 * i));
//        }

        // Savarjisho 4
//        int sum = 0;
//        for (int i = 1; i <= 15; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // Savarjisho 5
//        Scanner input = new Scanner(System.in);
//        System.out.print("გთხოვთ შეიყვანოთ რიცხვი: ");
//        int number = input.nextInt();
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }

        // Savarjisho 6
        // 0 1 1 2 3 5 8 13
//        Scanner input = new Scanner(System.in);
//        System.out.print("რამდენი ფიბონაცის წევრი გინდა?: ");
//        long number = input.nextLong();
//
//        long a = 0, b = 1;
//
//        System.out.print("ფიბონაჩის მიმდევრობაა: " + a + ", " + b);
//        for (int i = 2; i < number; i++) {
//            long next = a + b;
//            System.out.print(", " + next);
//            a = b;
//            b = next;
//        }

        // Savarjisho 7
//        Scanner input = new Scanner(System.in);
//        System.out.print("შეიყვანე პირველი რიცხვი: ");
//        int number1 = input.nextInt();
//        System.out.print("შეიყვანე მეორე რიცხვი: ");
//        int number2 = input.nextInt();
//
//        int usj = (number1 > number2) ? number1 : number2;
//        int usj = Math.max(number1, number2);
//
//        while (true) {
//            if (usj % number1 == 0 && usj % number2 == 0) {
//                System.out.println(usj);
//                break;
//            }
//            usj++;
//        }

        // Savarjisho 8
        // *
        // * *
        // * * *
        // * * * *
//        Scanner input = new Scanner(System.in);
//        System.out.print("რამდენი რიგი გინდა?: ");
//        int number = input.nextInt();
//
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Savarjisho 9
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number1 = input.nextInt();
//        System.out.print("Enter an integer: ");
//        int number2 = input.nextInt();
//
//        int usg = 1;
//        for (int i = 1; i <= number1 && i <= number2; i++) {
//            if (number1 % i == 0 && number2 % i == 0) {
//                usg = i;
//            }
//        }
//        System.out.println("უსგ = " + usg);

        // Savarjisho 9 v2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number1 = input.nextInt();
//        System.out.print("Enter an integer: ");
//        int number2 = input.nextInt();
//
//        while (true) {
//            if (number1 == number2) {
//                break;
//            } else if (number1 < number2) {
//                number2 -= number1;
//            } else if (number1 > number2) {
//                number1 -= number2;
//            }
//        }
//        System.out.println(number1 + " : " + number2);
        // 156 -> 156 -> 52  -> 52
        // 260 -> 104 -> 104 -> 52

        // Savarjisho 10
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
