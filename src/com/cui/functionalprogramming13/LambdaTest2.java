package com.cui.functionalprogramming13;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cuizh
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("a", "b", "c");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
        names.forEach(System.out::println);

//        Collections.sort(names,(o1,o2)->{
//            return o2.compareTo(o1);
//        });

//        Collections.sort(names,(a,b)->b.compareTo(a));
        names.sort((a,b)->b.compareTo(a));
        names.forEach(System.out::println);
    }
}
