package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
public class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}
