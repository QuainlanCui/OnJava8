package com.cui.functionalprogramming13;

import java.util.function.Consumer;

/**
 * @author cuizh
 */
public class MethodRef2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        printMax(MethodRef2::getMax,arr);
    }
    public static void getMax(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void printMax(Consumer<int[]> consumer, int[] arr){
        consumer.accept(arr);

    }
}
