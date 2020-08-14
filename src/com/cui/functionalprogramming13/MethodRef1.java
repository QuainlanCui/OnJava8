package com.cui.functionalprogramming13;



/**
 * @author cuizh
 */
public class MethodRef1 {
    public static void main(String[] args) {
        // TODO:将数字字符串转为整数类型
        Convert<String, Integer> convert = Integer::valueOf;
        Integer converted = convert.convert("123");
        System.out.println(converted.getClass());

    }
}
