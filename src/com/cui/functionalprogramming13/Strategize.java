package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
public class Strategize {
    Strategy strategy;
    String msg;

    /**
     * soft作为默认策略传入构造函数中
     * @param msg 消息
     */
    Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                //匿名内部类
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                //Lambda
                msg -> msg.substring(0, 5),
                //方法引用，左边类或者对象，右边方法名
                Unrelated::twice
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for(Strategy newStrategy : strategies) {
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }
}
