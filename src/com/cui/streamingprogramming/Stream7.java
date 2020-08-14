package com.cui.streamingprogramming;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cuizh
 */
public class Stream7 {
    @Test
    public void test1() {
        Stream<Person> stream = Stream.of(
                new Person("abc", 22),
                new Person("ab", 22),
                new Person("bb", 33),
                new Person("cde", 33));

//        Optional<Person> max = stream.max(Comparator.comparingInt(Person::getAge));
//        max.ifPresent(person -> System.out.println(person.getName()));

//        stream.min(((o1, o2) -> o1.getAge()- o2.getAge())).ifPresent(person -> System.out.println(person.getName()));
//        Optional<Person> min = stream.min(Comparator.comparingInt(Person::getAge));
//        min.ifPresent(person -> System.out.println(person.getName()));
//        Double collect = stream.collect(Collectors.averagingInt(Person::getAge));
//        System.out.println(collect);

//        Long collect = stream.count();
//        System.out.println(collect);
        Map<Integer, List<Person>> collect = stream.collect(Collectors.groupingBy(Person::getAge));


    }
}
