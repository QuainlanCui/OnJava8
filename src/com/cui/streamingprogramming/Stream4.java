package com.cui.streamingprogramming;

import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author cuizh
 */
public class Stream4 {

    @Test
    public void test1() {
        Stream<Person> stream = Stream.of(new Person("a", 1),
                new Person("b", 2),
                new Person("c", 3),
                new Person("d", 4));

//        Integer totalAge = stream.map(Person::getAge).reduce(0, Integer::sum);
//        System.out.println(totalAge);

        Integer maxAge = stream.map(Person::getAge).reduce(0,Math::max);
        System.out.println(maxAge);
    }

    @Test
    public void test2(){
        Integer aCount = Stream.of("a", "b", "C", "a", "a", "d")
                .map(s -> {
                    if ("a".equals(s)) {
                        return 1;
                    } else {
                        return 0;
                    }
                }).reduce(0, Integer::sum);
        System.out.println(aCount);
    }

    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//        stream.filter(integer -> integer>3).forEach(System.out::println);
        //
        IntStream intStream = stream.mapToInt(Integer::intValue);
        intStream.forEach(System.out::println);
    }

    @Test
    public void test4(){
        Stream<String> a = Stream.of("a");
        Stream<String> b = Stream.of("b");

        Stream<String> stream = Stream.concat(a, b);
        stream.forEach(System.out::println);
    }
}
