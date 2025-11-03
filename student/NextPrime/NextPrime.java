package NextPrime;

public class NextPrime {
    public static Integer nextPrime(Integer n) {
        int candidate = (n == null || n < 1) ? 2 : n + 1;

        while (true) {
            boolean isPrime = true;

            for (int i = 2; i <= candidate / 2; i++) {
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) return candidate;
            candidate++;
        }
    }
}