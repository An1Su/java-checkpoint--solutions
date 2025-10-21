package FactorialMaster;

public class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n<0) return -1;
        if (n==0) return 1;
        return n*this.calculate(n-1);
    }
}
