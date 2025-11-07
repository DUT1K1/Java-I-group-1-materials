public class Homework {
    public static void main(String[] args) {
        // N1
//        int sum = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i % 5 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
        // N1 v2
//        int sum = 0;
//        for (int i = 10; i <= 100; i += 5) {
//            sum += i;
//        }
//        System.out.println(sum);


        // N2
//        int number = 12345678;
//        int digit = 1;
//
//        while (number >= 10) {
//            number /= 10;
//            digit++;
//        }
//        System.out.println(digit);

        // N3
//        int denominator = 2;
//        int num = 161341;
//        if (num == 1) {
//            System.out.println("არაა მარტივი.");
//        }
//        while (denominator < num) {
//            if (num % denominator == 0) {
//                System.out.println("არაა მარტივი.");
//                break;
//            }
//            denominator++;
//        }
//        if (denominator == num) {
//            System.out.println("რიცხვი მარტივია!!!");
//        }

        // N4
//        int x = 123434;
//        int y = 721134;
//        while (x != y) {
//            if (x > y) {
//                x -= y;
//            }
//            if (x < y) {
//                y -= x;
//            }
//        }
//        System.out.println("x = " + x + "; y = " + y);

        // N5
//        int digitSum = 0;
//        int currNumber = 0;
//        for (int i = 100; i < 1000; i++) {
//            currNumber = i;
//            while (currNumber != 0) {
//                int digit = currNumber % 10;
//                digitSum += digit;
//                currNumber /= 10;
//            }
//            if (i % digitSum == 0) {
//                System.out.println(i);
//            }
//            digitSum = 0;
//        }

        // N6
        int amount = 15;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + ", " + num2);
        for (int i = 0; i < amount - 2; i++) {
            int sum = num1 + num2;
            System.out.print(", " + sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
