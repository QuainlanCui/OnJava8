package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
@FunctionalInterface
public interface Convert<F, T> {
    T convert(F from);
}
