package com.yufa.xz.designpattern.singleton;

/**
 * @author LiuYe
 * @date 2021/3/7 6:15 下午
 */
public class Singleton01 {
    private Singleton01() {

    }
    // 或者写到静态代码块
    private static final Singleton01 INSTANCE = new Singleton01();

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
