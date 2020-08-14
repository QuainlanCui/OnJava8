package com.cui.streamingprogramming;

import java.util.ArrayList;

/**
 * @author cuizh
 */
public class Stream2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("b1");
        list.add("b2");

        list.stream()
                .filter((Stream2::startWithA))
                .sorted()
                .forEach(System.out::println);
    }

    private static boolean startWithA(String s) {
        return s.startsWith("a");
    }
}
