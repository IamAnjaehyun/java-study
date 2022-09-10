package str_01_decimal;

public class Decimal_01 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100000; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }

    }

    static boolean isPrime(int k) {
        if(k<2) return false;
        for (int i = 2; i * i <= k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}