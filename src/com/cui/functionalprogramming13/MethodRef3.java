package com.cui.functionalprogramming13;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author cuizh
 */
public class MethodRef3 {
    public static void main(String[] args) {
        Date date = new Date();
        Supplier supplier = date::getTime;



        System.out.println(supplier.get());
    }

}
