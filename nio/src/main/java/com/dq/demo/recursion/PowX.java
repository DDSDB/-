package com.dq.demo.recursion;

public class PowX {
    /**
     * n
     *
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }

        if (n == -1) {
            return 1 / x;
        }
        double base = x;
        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                x = x * base;
            }
            return x;
        }
        double nBase = 1 / x;
        for (int i = -2; i >= n; i--) {
            x = nBase / x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 3));
        System.out.println(myPow(2.0, -2));
    }
}
