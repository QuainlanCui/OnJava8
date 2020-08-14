package com.cui.streamingprogramming;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cuizh
 */
public class Stream6 {
    @Test
    public void test1() {
        //流->集合
        Stream<String> stream = Stream.of("aa", "bb", "cc");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("ddd");
        stream.map(s -> s + "-1").collect(Collectors.toCollection(ArrayList::new));
    }

    @Test
    public void test2(){
        //流到数组
        Stream<String> stream = Stream.of("aa", "bb", "cc");
        String[] array = stream.toArray(String[]::new);
        Arrays.stream(array).forEach(System.out::println);


    }
}
