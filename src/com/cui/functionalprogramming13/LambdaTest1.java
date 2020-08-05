package com.cui.functionalprogramming13;

/**
 * @author cuizh
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        NoReturnNoParam noReturnNoParam = () -> System.out.println("NoReturnNoParam");
        noReturnNoParam.method();

        NoReturnOneParam noReturnOneParam = (int a) -> System.out.println("NoReturnOneParam" + a);
        noReturnOneParam.method(66);

        NoReturnMultiParam noReturnMultiParam = (int a, int b) -> System.out.println("NoReturnMultiParam param:" + "{" + a + "," + +b + "}");
        noReturnMultiParam.method(66, 77);

        ReturnNoParam returnNoParam = () -> {
            System.out.println("returnNoParam");
            return 1;
        };
        System.out.println("returnNoParam" + returnNoParam.method());


        ReturnOneParam returnOneParam = (int a) -> {
            System.out.println("returnOneParam" + a);
            return 1;
        };
        System.out.println(returnOneParam.method(66));

        ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.println("returnMultiParam");
            return 1;
        };
        System.out.println(returnMultiParam.method(90, 90));
    }
}


@FunctionalInterface
interface NoReturnNoParam {
    /**
     * 无参无返回值
     */
    void method();
}

/**
 * 一个参数无返回
 */
@FunctionalInterface
interface NoReturnOneParam {
    void method(int a);
}

@FunctionalInterface
interface NoReturnMultiParam {
    /**
     * 多参无返回
     *
     * @param a 参数1
     * @param b 参数2
     */
    void method(int a, int b);
}


/**
 * 多个参数有返回值
 */
@FunctionalInterface
interface ReturnMultiParam {
    int method(int a, int b);
}

/*** 无参有返回*/
@FunctionalInterface
interface ReturnNoParam {
    int method();
}

/**
 * 一个参数有返回值
 */
@FunctionalInterface
interface ReturnOneParam {
    int method(int a);
}