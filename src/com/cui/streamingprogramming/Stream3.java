package com.cui.streamingprogramming;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author cuizh
 */
public class Stream3 {
    @Test
    public void test1() {
        //获取流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        HashMap<Object, Object> map = new HashMap<>();
        Stream<Object> stream2 = map.keySet().stream();
        Stream<Object> stream3 = map.values().stream();
        Stream<Map.Entry<Object, Object>> stream4 = map.entrySet().stream();

        Stream<String> a = Stream.of("a", "bb", "cc");
        String[] arr = {"aa", "bb", "cc"};
        Stream<String> stream5 = Stream.of(arr);
        System.out.println("112");

    }

    @Test
    public void test2() {
        Stream<String> stream = Stream.of("aa", "bb", "cc");
//        System.out.println(stream.count());
//        Stream<String> limit = stream.limit();
        stream.filter(s -> {
            System.out.println(s);
            return true;
        });
    }

    @Test
    public void test3() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbb", "bbb", "bb");

       /* list.stream().forEach(s -> {
            System.out.println(s);
        });*/

       /* list.forEach(s -> {
            System.out.println(s);
        });*/

        list.forEach(System.out::println);
    }

    @Test
    public void test4() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbb", "bbb", "bb");

        long count = list.stream().count();
        System.out.println(count);
    }

    @Test
    public void test5() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbbb", "bbb", "bb");

        List<String> list1 = list.stream()
                .filter(s -> {
                    return s.length() == 3;
                }).collect(Collectors.toList());

        System.out.println(list1.getClass());

    }

    @Test
    public void test6() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbbb", "bbb", "bb");

        list.stream()
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void test7() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbbb", "bbb", "bb");

        list.stream()
                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    public void test8() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "aa", "bbbb", "bbb", "bb");

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "12", "22", "44");
        /*list.stream()
                .map(s -> {
                    return s+"-1";
                }).forEach(System.out::println);*/

        list1.stream()
                .map(s -> {
                    int i = Integer.parseInt(s);
                    return i + 1;
                }).forEach(System.out::println);
    }

    @Test
    public void test9() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "121", "22", "44");

//        list.stream().sorted().forEach(System.out::println);

        list.stream().sorted((i1, i2) -> {
            return Integer.parseInt(i2) - Integer.parseInt(i1);
        }).forEach(System.out::println);
    }

    @Test
    public void test10() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 2, 3, 4, 5, 5);
        list.stream().distinct().forEach(System.out::println);

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "121", "121", "44");
        list1.stream().distinct().forEach(System.out::println);
    }

    @Test
    public void test11() {
        //重写person的hashcode 和 equals
        Stream<Person> stream = Stream.of(
                new Person("a", 1),
                new Person("b", 4),
                new Person("c", 5),
                new Person("c", 5)
        );

        stream.distinct().forEach(System.out::println);
    }

    class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Person person = (Person) o;
            return Objects.equals(name, person.name) &&
                    Objects.equals(age, person.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }


    @Test
    public void test12() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 2, 3, 4, 5, 5);

        boolean b = list.stream().allMatch(integer -> {
            return integer > 0;
        });
        System.out.println(b);

        boolean b1 = list.stream().anyMatch(integer -> {
            return integer > 4;
        });
        System.out.println(b1);

        System.out.println(list.stream().noneMatch(integer -> {
            return integer > 5;
        }));
    }

    @Test
    public void test13() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 2, 3, 4, 5, 5);

        Optional<Integer> optional = list.stream().findFirst();
        System.out.println(optional.get());
    }

    @Test
    public void test14() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 2, 3, 4, 5, 5);

        Optional<Integer> max = list.stream().max((o1, o2) -> {
            return o1 - o2;
        });
        System.out.println(max.get());

        Optional<Integer> min = list.stream().min(((o1, o2) -> o1 - o2));
        System.out.println(min.get());
    }

    @Test
    public void test15() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 5);
        list.forEach(System.out::println);

        //默认值1，赋值给x，取出list第一个元素3，赋值给y
        //将x+y， 赋值给x，取出list第二个元素5，赋值给y
        //最后将x+y, 赋值给reduce

        Integer reduce = list.stream().reduce(1, (x, y) -> {
            System.out.println("x=" + x + ", y=" + y);
            return x + y;
        });
        System.out.println(reduce);

        //一般用来获取最大值
        Integer reduce1 = Stream.of(4, 5, 6, 10).reduce(0, (x, y) -> {
            return x > y ? x : y;
        });
        System.out.println(reduce1);

    }
}
