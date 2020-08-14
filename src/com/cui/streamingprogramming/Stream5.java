package com.cui.streamingprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author cuizh
 */
public class Stream5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "AAA", "BBB", "CCC", "DDDDD", "EEE");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"aaa","aaa","abb","accc","ddd");

//        list1.stream().filter(s ->  s.length() == 3).forEach(System.out::println);
//        System.out.println("--------");
//        list1.stream().filter(s -> s.length() == 3).limit(3).forEach(System.out::println);
//        System.out.println("--------");

//        list2.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
//        list2.stream().filter(s -> s.startsWith("a")).skip(2).forEach(System.out::println);
//       Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
        Stream.concat(list1.stream(),list2.stream())
                .map(s -> {
                    return new Person(s,1);
                }).forEach(System.out::println);

        Stream.concat(list1.stream(),list2.stream()).map(Person2::new);


    }

}
class Person2{
    private String name;

    public Person2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
