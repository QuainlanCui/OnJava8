package com.cui.streamingprogramming;

import java.util.*;
/**
 * 随机展示 5 至 20 之间不重复的整数并进行排序
 * @author cuizh
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5,20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}

