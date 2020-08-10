package com.cui.functionalprogramming13;

import java.util.function.Consumer;

/**
 * 方法引用
 * @author cuizh
 */
public class MethodRef {

    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");


        c = MethodRef::hello;
        c.call("bob");

        c = new Description("valuable")::help;
        c.call("information");

        c = Helper::assist;
        c.call("help!!");
    }
    static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    static class Description {
        String about;
        Description(String desc) { about = desc; }
        void help(String msg) { // [4]
            System.out.println(about + " " + msg);
        }
    }
    static class Helper {
        static void assist(String msg) { // [5]
            System.out.println(msg);
        }
    }

}
interface Callable {
    void call(String s);
}
class Describe {
    void show(String msg) {
        System.out.println(msg);
    }
}
