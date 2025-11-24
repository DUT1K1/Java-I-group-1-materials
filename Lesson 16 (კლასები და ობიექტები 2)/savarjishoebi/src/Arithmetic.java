public class Arithmetic {
    int nSum(int n) {
        if (n == 0) return 0;
        return n + nSum(n - 1);
    }

    // 5^4 = 5 * 5^3 = 5 * 5 * 5^2 = 5 * 5 * 5 * 5^1 = 5 * 5 * 5 * 5 * 1 =
    int power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
}
