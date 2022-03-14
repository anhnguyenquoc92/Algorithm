package hackerrank.mathematics;

public class PrimeFactor {
    public static int primeCount(long n) {
        if (n == 1) return 0;
        if (n == 2 || n == 3) return 1;

        int factor = 1;
        int count = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                factor *=i;

                if (factor < n) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(primeCount(500));
    }
}
