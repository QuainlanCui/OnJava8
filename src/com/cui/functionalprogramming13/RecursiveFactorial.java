package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
public class RecursiveFactorial implements IntCall {


    @Override
    public int call(int arg) {
        return 0;
    }

    static IntCall fact;
    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for(int i = 0; i <= 10; i++) {
            System.out.println(fact.call(i));
        }
    }
}
interface IntCall{
    int call(int arg);
}
