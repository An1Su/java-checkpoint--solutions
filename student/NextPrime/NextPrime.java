package NextPrime;

public class NextPrime {
    public static Integer nextPrime(Integer n) {
        int candidate = n +1;

        while (!isPrime(candidate)) {
            candidate ++;
        }
        return candidate;
    }
    public static boolean isPrime(int candidate){
        if (candidate <2) return false;
        for (int i = 2; i <=Math.sqrt(candidate); i++) {
            if (candidate%i == 0) return false;
        }
        return true;
    }

}