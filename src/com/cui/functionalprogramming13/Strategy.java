package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
public interface Strategy {
    /**
     * 提供了单一的 approach() 方法来承载函数式功能
     * @param msg 消息
     * @return String类型
     */
    String approach(String msg);
}
