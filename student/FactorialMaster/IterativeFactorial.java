package FactorialMaster;

public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n <0) return -1;
        if (n == 1 || n == 0) return 1;
        long result=1;
        for (int i = 1; i<=n; i++){
            result *=i;
        }
        return result;
    }
}
