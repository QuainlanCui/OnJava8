package com.cui.streamingprogramming;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author cuizh
 */
public class Stream1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings,"ab","ac","abc","abcd","bc,","bqwer");

        strings.stream()
                .filter(s -> {return s.startsWith("a");})
                .filter(s -> {return s.length() == 3;})
                .forEach(System.out::println);
    }
}
