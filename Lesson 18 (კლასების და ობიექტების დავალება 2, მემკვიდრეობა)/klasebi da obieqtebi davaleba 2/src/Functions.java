public class Functions {
    public static int multiples(int a, int b, int k) {
        if (a == b) {
            if (a % k == 0) {
                return a;
            }
            return 0;
        }
        if (a % k == 0) {
            return multiples(a + 1, b, k) + a;
        }
        return multiples(a + 1, b, k);
    }

    public static int countSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + countSum(n - 1);
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static int countZeros(int number) {
        if (number == 0) {
            return 1;
        }

        if (number % 10 == 0) {
            return 1 + countZeros(number / 10);
        }
        if (number / 10 == 0) {
            return 0;
        }
        return countZeros(number / 10);
    }

    public static void printOddOrEvenZeros(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
