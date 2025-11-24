public class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }

    int biggest(int a, int b) {
        return a > b ? a : b;
    }

    void print(String x) {
        System.out.println(x);
        print(x);
    }

    void printNTimes(String x, int n) {
        if (n <= 0) return;
        System.out.println(x + "\t" + n);
        printNTimes(x, n - 1);
    }

    int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
